package com.stalixo.charsheetspring.dto.sheets.dnd;

import java.io.Serializable;

public class SheetDndCombatInfoDTO implements Serializable {

    private int armorClass;
    private int initiative;
    private double speed;
    private String hitDice;
    private Boolean[] successes;
    private Boolean[] failures;

    // Construtor padrão
    public SheetDndCombatInfoDTO() {
    }

    // Construtor que aceita os parâmetros
    public SheetDndCombatInfoDTO(int armorClass, int initiative, double speed, String hitDice, Boolean[] successes, Boolean[] failures) {
        this.armorClass = armorClass;
        this.initiative = initiative;
        this.speed = speed;
        this.hitDice = hitDice;
        this.successes = successes;
        this.failures = failures;
    }

    // Getters e Setters

    public int getArmorClass() {
        return armorClass;
    }

    public void setArmorClass(int armorClass) {
        this.armorClass = armorClass;
    }

    public int getInitiative() {
        return initiative;
    }

    public void setInitiative(int initiative) {
        this.initiative = initiative;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public String getHitDice() {
        return hitDice;
    }

    public void setHitDice(String hitDice) {
        this.hitDice = hitDice;
    }

    public Boolean[] getSuccesses() {
        return successes;
    }

    public void setSuccesses(Boolean[] successes) {
        this.successes = successes;
    }

    public Boolean[] getFailures() {
        return failures;
    }

    public void setFailures(Boolean[] failures) {
        this.failures = failures;
    }
}
