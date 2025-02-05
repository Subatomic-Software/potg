package com.subatomicsoftware.potg.services.rest.heroes.logic;

import com.subatomicsoftware.potg.services.rest.heroes.dao.HeroRepository;
import com.subatomicsoftware.potg.services.rest.heroes.model.Hero;
import com.subatomicsoftware.potg.services.rest.heroes.model.HeroAbility;
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
    private HeroRepository heroRepository;

    public Hero generateTestHero(){
        Hero hero = new Hero();
        hero.setHeroName("Slotterback");
        hero.setHeroImg("https://s3.amazonaws.com/us.potg/hero_full/bastion.png");
        hero.setHeroThumbImg("https://s3.amazonaws.com/us.potg/hero_thumb/bastion.png");
        hero.setHeroRole("mid or feed");
        HeroAbility ab1=  new HeroAbility();
        ab1.setAbilityName("feeding");
        ab1.setAbilityText("gg afk");
        ab1.setAbilityImg("https://s3.amazonaws.com/us.potg/abilities/ampitup.png");
        List<HeroAbility> l1 = new ArrayList<>();
        l1.add(ab1);
        hero.setAbilities(l1);

        return heroRepository.save(hero);
    }

    public Hero saveHero(Hero hero){
        return heroRepository.save(hero);
    }

    public Hero getHeroByName(String heroName){
        Hero hero = heroRepository.findByHeroName(heroName);
        return hero;
    }

    public Hero getHeroById(String id){
        Hero hero = heroRepository.findOne(id);
        return hero;
    }

    public List<Hero> getAllHeroes(){
        return heroRepository.findAll();
    }

    public void deleteAllHeros(){
        heroRepository.deleteAll();
    }

    public void deleteHero(String id){
        heroRepository.delete(id);
    }

    public List<Hero> getHeroByRole(String heroRole) {
        return heroRepository.findByHeroRole(heroRole);
    }

}
