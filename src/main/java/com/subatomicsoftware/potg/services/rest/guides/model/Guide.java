package com.subatomicsoftware.potg.services.rest.guides.model;

import com.subatomicsoftware.potg.services.rest.heroes.model.Hero;
import com.subatomicsoftware.potg.services.rest.heroes.model.HeroAbility;
import org.springframework.data.annotation.Id;

import java.util.List;

/**
 * Created by seezoo on 6/13/2016.
 */
public class Guide {

    @Id
    private String guideId;
    private String guideTitle;
    private String userId;
    private String heroName;
    private String heroImg;
    private String heroThumbImg;
    private List<HeroAbility> heroAbilities;
    private List<Hero> counters;
    private List<Hero> compliments;
    private String mainInput;
    private String conclusionInput;

    public String getGuideId() {
        return guideId;
    }

    public void setGuideId(String guideId) {
        this.guideId = guideId;
    }

    public String getGuideTitle() {
        return guideTitle;
    }

    public void setGuideTitle(String guideTitle) {
        this.guideTitle = guideTitle;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public String getHeroImg() {
        return heroImg;
    }

    public void setHeroImg(String heroImg) {
        this.heroImg = heroImg;
    }

    public String getHeroThumbImg() {
        return heroThumbImg;
    }

    public void setHeroThumbImg(String heroThumbImg) {
        this.heroThumbImg = heroThumbImg;
    }

    public List<HeroAbility> getHeroAbilities() {
        return heroAbilities;
    }

    public void setHeroAbilities(List<HeroAbility> heroAbilities) {
        this.heroAbilities = heroAbilities;
    }

    public List<Hero> getCounters() {
        return counters;
    }

    public void setCounters(List<Hero> counters) {
        this.counters = counters;
    }

    public List<Hero> getCompliments() {
        return compliments;
    }

    public void setCompliments(List<Hero> compliments) {
        this.compliments = compliments;
    }

    public String getMainInput() {
        return mainInput;
    }

    public void setMainInput(String mainInput) {
        this.mainInput = mainInput;
    }


    public String getConclusionInput() {
        return conclusionInput;
    }

    public void setConclusionInput(String conclusionInput) {
        this.conclusionInput = conclusionInput;
    }
}
