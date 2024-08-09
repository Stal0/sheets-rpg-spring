package com.stalixo.charsheetspring.dto.sheets.dnd;

import com.stalixo.charsheetspring.domain.enums.AttributesDndEnum;
import com.stalixo.charsheetspring.domain.enums.SkillsDnDEnum;

import java.io.Serializable;
import java.util.Map;

public class SheetDndAttributesInfoDTO implements Serializable {

    private Map<AttributesDndEnum, Double> attributes;
    private Map<SkillsDnDEnum, Boolean> proficiencies;
    private Map<AttributesDndEnum, Boolean> savingThrowsProficiency;
    private Map<SkillsDnDEnum, Integer> proficienciesValues;
    private int inspiration;
    private int proficiencyBonus;
    private int passiveWisdom;

    // Construtor padrão
    public SheetDndAttributesInfoDTO() {
    }

    // Construtor que aceita um SheetDnD
    public SheetDndAttributesInfoDTO(Map<AttributesDndEnum, Double> attributes,
                                     Map<SkillsDnDEnum, Boolean> proficiencies,
                                     Map<AttributesDndEnum, Boolean> savingThrowsProficiency,
                                     Map<SkillsDnDEnum, Integer> proficienciesValues,
                                     int inspiration,
                                     int proficiencyBonus,
                                     int passiveWisdom) {
        this.attributes = attributes;
        this.proficiencies = proficiencies;
        this.savingThrowsProficiency = savingThrowsProficiency;
        this.proficienciesValues = proficienciesValues;
        this.inspiration = inspiration;
        this.proficiencyBonus = proficiencyBonus;
        this.passiveWisdom = passiveWisdom;
    }

    // Getters e Setters

    public Map<AttributesDndEnum, Double> getAttributes() {
        return attributes;
    }

    public void setAttributes(Map<AttributesDndEnum, Double> attributes) {
        this.attributes = attributes;
    }

    public Map<SkillsDnDEnum, Boolean> getProficiencies() {
        return proficiencies;
    }

    public void setProficiencies(Map<SkillsDnDEnum, Boolean> proficiencies) {
        this.proficiencies = proficiencies;
    }

    public Map<AttributesDndEnum, Boolean> getSavingThrowsProficiency() {
        return savingThrowsProficiency;
    }

    public void setSavingThrowsProficiency(Map<AttributesDndEnum, Boolean> savingThrowsProficiency) {
        this.savingThrowsProficiency = savingThrowsProficiency;
    }

    public Map<SkillsDnDEnum, Integer> getProficienciesValues() {
        return proficienciesValues;
    }

    public void setProficienciesValues(Map<SkillsDnDEnum, Integer> proficienciesValues) {
        this.proficienciesValues = proficienciesValues;
    }

    public int getInspiration() {
        return inspiration;
    }

    public void setInspiration(int inspiration) {
        this.inspiration = inspiration;
    }

    public int getProficiencyBonus() {
        return proficiencyBonus;
    }

    public void setProficiencyBonus(int proficiencyBonus) {
        this.proficiencyBonus = proficiencyBonus;
    }

    public int getPassiveWisdom() {
        return passiveWisdom;
    }

    public void setPassiveWisdom(int passiveWisdom) {
        this.passiveWisdom = passiveWisdom;
    }
}
