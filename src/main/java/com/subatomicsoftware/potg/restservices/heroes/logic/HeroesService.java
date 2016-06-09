package com.subatomicsoftware.potg.restservices.heroes.logic;

import com.subatomicsoftware.potg.restservices.heroes.dao.HeroRepository;
import com.subatomicsoftware.potg.restservices.heroes.model.Hero;
import com.subatomicsoftware.potg.restservices.heroes.model.HeroAbility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by seezoo on 6/7/2016.
 */
@Service
public class HeroesService {

    @Autowired
    private HeroRepository repository;

    public void saveHero(){
        Hero hero1 = new Hero();
        hero1.setHeroName("Slots");
        hero1.setHeroImg("abc");
        hero1.setHeroRame("mid or feed");
        HeroAbility ab1=  new HeroAbility();
        ab1.setAbilityName("asd");
        ab1.setAbilityText("qq");
        ab1.setAbilityImg("eee");
        List<HeroAbility> l1 = new ArrayList<>();
        l1.add(ab1);
        hero1.setAbilities(l1);
        repository.save(hero1);
    }
}
