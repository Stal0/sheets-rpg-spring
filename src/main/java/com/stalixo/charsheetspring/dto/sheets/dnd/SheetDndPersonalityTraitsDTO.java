package com.stalixo.charsheetspring.dto.sheets.dnd;

import java.io.Serializable;

public class SheetDndPersonalityTraitsDTO implements Serializable {

    private String personalityTraits;
    private String ideals;
    private String bonds;
    private String flaws;

    // Construtor padrão
    public SheetDndPersonalityTraitsDTO() {
    }

    // Construtor que aceita os parâmetros
    public SheetDndPersonalityTraitsDTO(String personalityTraits, String ideals, String bonds, String flaws) {
        this.personalityTraits = personalityTraits;
        this.ideals = ideals;
        this.bonds = bonds;
        this.flaws = flaws;
    }

    // Getters e Setters

    public String getPersonalityTraits() {
        return personalityTraits;
    }

    public void setPersonalityTraits(String personalityTraits) {
        this.personalityTraits = personalityTraits;
    }

    public String getIdeals() {
        return ideals;
    }

    public void setIdeals(String ideals) {
        this.ideals = ideals;
    }

    public String getBonds() {
        return bonds;
    }

    public void setBonds(String bonds) {
        this.bonds = bonds;
    }

    public String getFlaws() {
        return flaws;
    }

    public void setFlaws(String flaws) {
        this.flaws = flaws;
    }
}
