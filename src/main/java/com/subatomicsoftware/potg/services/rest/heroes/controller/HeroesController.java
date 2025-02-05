package com.subatomicsoftware.potg.services.rest.heroes.controller;

import com.subatomicsoftware.potg.services.rest.heroes.logic.HeroesService;
import com.subatomicsoftware.potg.services.rest.heroes.model.Hero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by seezoo on 6/6/2016.
 */
@RestController
@RequestMapping("/api/heroes")
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

    @RequestMapping(path="/test",method= RequestMethod.GET)
    public @ResponseBody Hero createTestHero() {
        return heroesService.generateTestHero();
    }

    @RequestMapping(method= RequestMethod.DELETE)
    public void deleteHeroes() {
        heroesService.deleteAllHeros();
    }

    @RequestMapping(path="/{id}", method= RequestMethod.DELETE)
    public void deleteHero(@PathVariable("id") String heroId) {
        heroesService.deleteHero(heroId);
    }

    @RequestMapping(path = "/{id}",method= RequestMethod.PUT)
    public @ResponseBody Hero setHero(@PathVariable("id") String heroId) {
        //todo
        return null;
    }
}
