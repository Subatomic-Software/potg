package com.subatomicsoftware.potg.services.rest.heroes.model;

import org.springframework.data.annotation.Id;

import java.util.List;
/**
 * Created by seezoo on 6/6/2016.
 */
public class Hero {

    @Id
    private String heroId;
    private String heroImg;
    private String heroThumbImg;
    private String heroRole;
    private String heroName;
    private List<HeroAbility> abilities;
    private String counterText;
    private String complimentText;

    public Hero() {}
    public String getHeroId() {
        return heroId;
    }

    public void setHeroId(String heroId) {
        this.heroId = heroId;
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
                "Hero[heroId=%s, heroName='%s', heroImg='%s', heroThumbImg='%s', heroRole='%s', abilities='%s']",
                heroId, heroName, heroImg, heroThumbImg, heroRole, abilities);
    }

    public String getHeroThumbImg() {
        return heroThumbImg;
    }

    public void setHeroThumbImg(String heroThumbImg) {
        this.heroThumbImg = heroThumbImg;
    }


    public String getComplimentText() {
        return complimentText;
    }

    public void setComplimentText(String complimentText) {
        this.complimentText = complimentText;
    }

    public String getCounterText() {
        return counterText;
    }

    public void setCounterText(String counterText) {
        this.counterText = counterText;
    }

}
