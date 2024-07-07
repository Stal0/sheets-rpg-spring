package com.stalixo.charsheetspring.domain.subBlocks;

import com.stalixo.charsheetspring.domain.Block;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class CharacterInfoBlock extends Block {

    private String nameCharacter;
    private String race;
    private Double heigth;

    public CharacterInfoBlock(String id, String nameCharacter, String race, Double heigth) {
        super(id);
        this.nameCharacter = nameCharacter;
        this.race = race;
        this.heigth = heigth;
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

    public Double getHeigth() {
        return heigth;
    }

    public void setHeigth(Double heigth) {
        this.heigth = heigth;
    }

}
