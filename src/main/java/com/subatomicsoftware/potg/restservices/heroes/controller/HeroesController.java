package com.subatomicsoftware.potg.restservices.heroes.controller;

import com.subatomicsoftware.potg.restservices.heroes.logic.HeroesService;
import com.subatomicsoftware.potg.restservices.heroes.model.Hero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by seezoo on 6/6/2016.
 */
@RestController
@RequestMapping("/heroes")
public class HeroesController {

    @Autowired
    HeroesService heroesService;

    @RequestMapping(method= RequestMethod.GET)
    public @ResponseBody List<Hero> getHeroes(@RequestParam(value = "heroName",required = false)  String heroName,
                                              @RequestParam(value = "heroRole",required = false)  String heroRole) {
        List<Hero> heroes = new ArrayList<>();
        if(heroName==null && heroRole==null) {
            return heroesService.getAllHeroes();
        }else if(heroName!= null){
            heroes.add(heroesService.getHeroByName(heroName));
        }else if(heroRole!= null){
            heroes.addAll(heroesService.getHeroByRole(heroRole));
        }
        return heroes;
    }

    @RequestMapping(method= RequestMethod.POST)
    public @ResponseBody Hero createHero(@RequestBody Hero hero) {
        return heroesService.saveHero(hero);
    }

    @RequestMapping(path="/init",method= RequestMethod.POST)
    public @ResponseBody Hero createTestHero() {
        return heroesService.generateTestHero();
    }

    @RequestMapping(method= RequestMethod.DELETE)
    public void deleteHeroes() {
        heroesService.deleteAllHeros();
    }
}
