package com.stalixo.charsheetspring.domain.subBlocks;

import com.stalixo.charsheetspring.domain.Block;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class CharacterInfoBlock extends Block {

    private String nameCharacter;
    private Character gender;
    private Double heigth;

    public CharacterInfoBlock(String id, String nameCharacter, Character gender, Double heigth) {
        super(id);
        this.nameCharacter = nameCharacter;
        this.gender = gender;
        this.heigth = heigth;
    }

    public String getNameCharacter() {
        return nameCharacter;
    }

    public void setNameCharacter(String nameCharacter) {
        this.nameCharacter = nameCharacter;
    }

    public Character getGender() {
        return gender;
    }

    public void setGender(Character gender) {
        this.gender = gender;
    }

    public Double getHeigth() {
        return heigth;
    }

    public void setHeigth(Double heigth) {
        this.heigth = heigth;
    }

}
