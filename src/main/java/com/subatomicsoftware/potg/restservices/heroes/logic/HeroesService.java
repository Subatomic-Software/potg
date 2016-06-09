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

    public void saveHero(Hero hero1){
        repository.save(hero1);
    }

    public Hero getHeroByName(String heroName){
        Hero hero = repository.findByHeroName(heroName);
        return hero;
    }

    public Hero getHeroById(String id){
        Hero hero = repository.findOne(id);
        return hero;
    }

    public List<Hero> getAllHeroes(){
        return repository.findAll();
    }
}
