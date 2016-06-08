package com.subatomicsoftware.potg.restservices.heroes.model;

import org.springframework.data.annotation.Id;

import java.util.List;
/**
 * Created by seezoo on 6/6/2016.
 */
public class Hero {

    @Id
    private String id;
    private String hero_img;
    private String hero_role;
    private String hero_name;
    private List<HeroAbility> abilities;

    public Hero() {}
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHero_name() {
        return hero_name;
    }

    public void setHero_name(String hero_name) {
        this.hero_name = hero_name;
    }
    public String getHero_role() {
        return hero_role;
    }

    public void setHero_role(String hero_role) {
        this.hero_role = hero_role;
    }

    public String getHero_img() {
        return hero_img;
    }

    public void setHero_img(String hero_img) {
        this.hero_img = hero_img;
    }

    public List<HeroAbility> getAbilities() {
        return abilities;
    }

    public void setAbilities(List<HeroAbility> abilities) {
        this.abilities = abilities;
    }

    @Override
    public String toString() {
        return String.format(
                "Hero[id=%s, hero_name='%s', hero_img='%s', hero_role='%s', abilities='%s']",
                id, hero_name, hero_img,hero_role,abilities);
    }
}
