package com.subatomicsoftware.potg.services.rest.heroes.model;

/**
 * Created by seezoo on 6/6/2016.
 */
public class HeroAbility {
    private String abilityName;
    private String abilityImg;
    private String abilityText;
    private String abilityUserText;

    public String getAbilityName() {
        return abilityName;
    }

    public void setAbilityName(String abilityName) {
        this.abilityName = abilityName;
    }
    public String getAbilityImg() {
        return abilityImg;
    }

    public void setAbilityImg(String abilityImg) {
        this.abilityImg = abilityImg;
    }

    public String getAbilityText() {
        return abilityText;
    }

    public void setAbilityText(String abilityText) {
        this.abilityText = abilityText;
    }

    public String getAbilityUserText() {
        return abilityUserText;
    }

    public void setAbilityUserText(String abilityUserText) {
        this.abilityUserText = abilityUserText;
    }
}
