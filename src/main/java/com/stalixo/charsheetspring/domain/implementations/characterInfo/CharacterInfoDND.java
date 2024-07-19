package com.stalixo.charsheetspring.domain.implementations.characterInfo;

import com.stalixo.charsheetspring.domain.Sheet;
import com.stalixo.charsheetspring.domain.blocks.CharacterInfoBlock;

public class CharacterInfoDND extends CharacterInfoBlock {

    private String nameCharacter;
    private String race;
    private String characterClass;
    private String background;
    private Integer experiencePoints;
    private String alignment;


    public CharacterInfoDND(String id, Sheet sheet) {
        super(id, sheet);
    }

    public String getNameCharacter() {
        return nameCharacter;
    }

    public void setNameCharacter(String nameCharacter) {
        this.nameCharacter = nameCharacter;
    }

    public String getRace() {
        return race;
    }

    public void setGender(String gender) {
        this.race = race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getCharacterClass() {
        return characterClass;
    }

    public void setCharacterClass(String characterClass) {
        this.characterClass = characterClass;
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public Integer getExperiencePoints() {
        return experiencePoints;
    }

    public void setExperiencePoints(Integer experiencePoints) {
        this.experiencePoints = experiencePoints;
    }

    public String getAlignment() {
        return alignment;
    }

    public void setAlignment(String alignment) {
        this.alignment = alignment;
    }
}
