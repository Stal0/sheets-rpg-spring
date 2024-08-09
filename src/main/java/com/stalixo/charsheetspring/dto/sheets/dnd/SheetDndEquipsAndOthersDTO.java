package com.stalixo.charsheetspring.dto.sheets.dnd;

import java.io.Serializable;
import java.util.List;

public class SheetDndEquipsAndOthersDTO implements Serializable {

    private List<String> attacksAndConjuration;
    private List<String> proficienciesAndLanguage;
    private List<String> equipments;
    private List<String> featuresAndTraits;

    // Construtor padrão
    public SheetDndEquipsAndOthersDTO() {
    }

    // Construtor que aceita os parâmetros
    public SheetDndEquipsAndOthersDTO(List<String> attacksAndConjuration, List<String> proficienciesAndLanguage,
                                      List<String> equipments, List<String> featuresAndTraits) {
        this.attacksAndConjuration = attacksAndConjuration;
        this.proficienciesAndLanguage = proficienciesAndLanguage;
        this.equipments = equipments;
        this.featuresAndTraits = featuresAndTraits;
    }

    // Getters e Setters

    public List<String> getAttacksAndConjuration() {
        return attacksAndConjuration;
    }

    public void setAttacksAndConjuration(List<String> attacksAndConjuration) {
        this.attacksAndConjuration = attacksAndConjuration;
    }

    public List<String> getProficienciesAndLanguage() {
        return proficienciesAndLanguage;
    }

    public void setProficienciesAndLanguage(List<String> proficienciesAndLanguage) {
        this.proficienciesAndLanguage = proficienciesAndLanguage;
    }

    public List<String> getEquipments() {
        return equipments;
    }

    public void setEquipments(List<String> equipments) {
        this.equipments = equipments;
    }

    public List<String> getFeaturesAndTraits() {
        return featuresAndTraits;
    }

    public void setFeaturesAndTraits(List<String> featuresAndTraits) {
        this.featuresAndTraits = featuresAndTraits;
    }
}
