package com.subatomicsoftware.potg.restservices.heroes.model;

import org.springframework.data.annotation.Id;

import java.util.List;
/**
 * Created by seezoo on 6/6/2016.
 */
public class Hero {

    @Id
    private String id;
    private String heroImg;
    private String heroThumbImg;
    private String heroRole;
    private String heroName;
    private List<HeroAbility> abilities;

    public Hero() {}
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public String getHeroRole() {
        return heroRole;
    }

    public void setHeroRole(String heroRole) {
        this.heroRole = heroRole;
    }

    public String getHeroImg() {
        return heroImg;
    }

    public void setHeroImg(String heroImg) {
        this.heroImg = heroImg;
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
                "Hero[id=%s, heroName='%s', heroImg='%s', heroThumbImg='%s', heroRole='%s', abilities='%s']",
                id, heroName, heroImg, heroThumbImg, heroRole, abilities);
    }

    public String getHeroThumbImg() {
        return heroThumbImg;
    }

    public void setHeroThumbImg(String heroThumbImg) {
        this.heroThumbImg = heroThumbImg;
    }
}
