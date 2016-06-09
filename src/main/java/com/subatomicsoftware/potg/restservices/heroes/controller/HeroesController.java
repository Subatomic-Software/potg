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
    public @ResponseBody List<Hero> getHeroes(@RequestParam(value = "heroName",required = false) String heroName) {
        List<Hero> heroes = new ArrayList<>();
        if(heroName==null) {
            return heroesService.getAllHeroes();
        }else if(heroName!= null){
            heroes.add(heroesService.getHeroByName(heroName));
        }
        return heroes;
    }

    @RequestMapping(method= RequestMethod.POST)
    public void createHero(@RequestBody Hero hero) {
        HeroesService bl =new HeroesService();
        heroesService.saveHero(hero);
    }

    @RequestMapping(method= RequestMethod.DELETE)
    public void deleteHeroes() {
        //todo delete all heroes//
    }
}
