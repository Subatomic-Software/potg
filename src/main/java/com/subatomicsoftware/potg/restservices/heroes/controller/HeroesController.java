package com.subatomicsoftware.potg.restservices.heroes.controller;

import com.subatomicsoftware.potg.restservices.heroes.dao.HeroRepository;
import com.subatomicsoftware.potg.restservices.heroes.logic.HeroesBusinessLogic;
import com.subatomicsoftware.potg.restservices.heroes.model.Hero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by seezoo on 6/6/2016.
 */
@RestController
@RequestMapping("/heroes")
public class HeroesController {



    @RequestMapping(method= RequestMethod.GET)
    public @ResponseBody List<Hero> getHeroes() {
        HeroesBusinessLogic bl =new HeroesBusinessLogic();
        bl.saveHero();

        List<Hero> heroes =  new ArrayList<>();
        Hero hero1 = new Hero();
        hero1.setHero_name("Slots");
        Hero hero2 = new Hero();
        hero2.setHero_name("Daman");
        heroes.add(hero1);
        heroes.add(hero2);
        return heroes;

    }

    @RequestMapping(method= RequestMethod.POST)
    public void createHero() {
        HeroesBusinessLogic bl =new HeroesBusinessLogic();
        bl.saveHero();
      //todo create heroes and assign and if//
    }

    @RequestMapping(method= RequestMethod.DELETE)
    public void deleteHeroes() {
        //todo delete all heroes//
    }
}
