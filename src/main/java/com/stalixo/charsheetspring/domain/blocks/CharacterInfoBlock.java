package com.stalixo.charsheetspring.domain.blocks;

import com.stalixo.charsheetspring.domain.Sheet;

import java.util.HashMap;
import java.util.Map;

public abstract class CharacterInfoBlock extends Block {

    protected Map<String, String> informations = new HashMap<>();

    public CharacterInfoBlock(String id, Sheet sheet) {
        super(sheet, id);
    }

    public Map<String, String> getInformations() {
        return informations;
    }

    public void setInformations(Map<String, String> informations) {
        this.informations = informations;
    }

    public void setInformation(String obj, String value) {

        if (obj == null || obj.trim().isEmpty()) {
            throw new IllegalArgumentException("field cannot be null or empty");
        }
        if (value == null) {
            throw new IllegalArgumentException("field value cannot be null");
        }
        informations.put(obj, value);
    }

    public void removeInformation(String obj) {
        if (obj == null || obj.trim().isEmpty()) {
            throw new IllegalArgumentException("field cannot be null or empty");
        }
        informations.remove(obj);
    }

}
