var main = angular.module('potg', ['ngRoute']);

 main.config(
						function ($httpProvider) {
						    $httpProvider.defaults.headers.common['X-Requested-With'] = 'XMLHttpRequest';
						}).controller("home", function ($http, $location) {
						    var self = this;
						    $http.get("/user/").success(function (data) {
						        if (data.id) {
						            console.log("data:" + data);
						            self.id = data.id;
						            self.battletag = data.battletag;
						            self.authenticated = true;
						        } else {
						            self.id = "N/A";
						            self.authenticated = false;
						        }
						        console.log("data:" + data);
						    }).error(function () {
						        self.id = "N/A";
						        self.authenticated = false;
						    });
						    self.logout = function () {
						        $http.post('/logout/', {}).success(function () {
						            self.authenticated = false;
						            $location.path("/");
						        }).error(function (data) {
						            console.log("Logout failed");
						            self.authenticated = false;
						        });
						    };
						});


main.config(['$routeProvider', function ($routeProvider) {
        $routeProvider
            .when('/', { templateUrl: 'partials/home.html' })
            .when('/guides/', { templateUrl: 'partials/guidelist.html', controller: 'guidelist' })
            .when('/createguide', { templateUrl: 'partials/guideform.html', controller: 'guideform' })
            .when('/guide/:id', {templateUrl: 'partials/guide.html', controller: 'viewguide'})

}]);


main.config(['$locationProvider', function ($locationProvider) {
    $locationProvider.html5Mode(true);
}]);

//Controller for guide view
main.controller('viewguide', function ($scope, $http, $routeParams) {
    $scope.guide = {};

    $http({
        method: 'GET',
        url: '/guides/',
        params:{id:$routeParams.id}
    }).success(function (result) {
        $scope.guide = result;
    });
});


//Controller for guide creation form
main.controller('guideform', function ($scope, $http) {
    $scope.guide = {};
    $scope.guide.userID = $scope.home.battletag;
    $scope.heroList = [];

    /*$scope.heroList = [
        { "heroName": "genji", "heroImg": "genji.jpg", "heroRole": "offense", "abilities": [{ "abilityName": "dash" }, { "abilityName": "reflect" }, { "abilityName": "sword shit" }] },
        { "heroName": "hanzo", "heroImg": "hanzo.jpg", "heroRole": "offense", "abilities": [{ "abilityName": "I see you" }, { "abilityName": "multi arrow" }, { "abilityName": "ryu gawee f u" }] }
    ];*/

    $http({
        method: 'GET',
        url: '/heroes/',
    }).success(function (result) {
        $scope.heroList = result;
    });

    
    $scope.guide.compliments = {};
    $scope.guide.compliments.heros = [];
    $scope.guide.counters = {};
    $scope.guide.counters.heros = [];
    $scope.guide.abilities = [];

    $scope.updateAbilities = function(){
        var index = document.getElementById("heroSelect").selectedIndex;
        $scope.guide.abilities = [];

        for (i = 0; i < 3; i++) {

            $scope.guide.abilities.push({ abilityName : $scope.heroList[index].abilities[i].abilityName});
        }
    };

    $scope.addCompliment = function(){
        $scope.guide.compliments.heros.push({ heroName: $scope.complimentSelection });
    };
    
    $scope.removeCompliment = function(){
        $scope.guide.compliments.heros.pop({ heroName: $scope.complimentSelection });
    };

    $scope.addCounter = function () {
        $scope.guide.counters.heros.push({ heroName: $scope.counterSelection });
    };
    
    $scope.removeCounter = function() {
        $scope.guide.counters.heros.pop({ heroName: $scope.counterSelection });
    };

    $scope.save = function () {
        $http({
            method: 'POST',
            url: '/guides/',
            data: $scope.guide
        }).success(function (result) {
            window.location.href = "/guides/";
        }).error(function (result) {
            alert("Failed to save");
        });
    }
});

//Guidelisting
main.controller('guidelist', function ($scope, $http) {
    $scope.guideList = [];

    $http({
        method: 'GET',
        url: '/guides/'
    }).success(function (result) {
        $scope.guideList = result;
    });
});