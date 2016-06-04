angular
				.module("app", [])
				.config(
						function ($httpProvider) {
						    $httpProvider.defaults.headers.common['X-Requested-With'] = 'XMLHttpRequest';
						}).controller("home", function ($http, $location) {
						    var self = this;
						    $http.get("/user").success(function (data) {
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
						        $http.post('logout', {}).success(function () {
						            self.authenticated = false;
						            $location.path("/");
						        }).error(function (data) {
						            console.log("Logout failed")
						            self.authenticated = false;
						        });
						    };
						});