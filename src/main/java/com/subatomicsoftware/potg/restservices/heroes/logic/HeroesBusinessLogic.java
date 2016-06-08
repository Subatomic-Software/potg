package com.subatomicsoftware.potg.restservices.heroes.logic;

import com.subatomicsoftware.potg.restservices.heroes.dao.HeroRepository;
import com.subatomicsoftware.potg.restservices.heroes.model.Hero;
import com.subatomicsoftware.potg.restservices.heroes.model.HeroAbility;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by seezoo on 6/7/2016.
 */
public class HeroesBusinessLogic {

    @Autowired
    private HeroRepository repository;

    public void saveHero(){
        Hero hero1 = new Hero();
        hero1.setHero_name("Slots");
        hero1.setHero_img("abc");
        hero1.setHero_role("mid or feed");
        HeroAbility ab1=  new HeroAbility();
        ab1.setAbility_name("asd");
        ab1.setAbility_text("qq");
        ab1.setAbility_img("eee");
        List<HeroAbility> l1 = new ArrayList<>();
        l1.add(ab1);
        hero1.setAbilities(l1);
        repository.save(hero1);
    }
}
