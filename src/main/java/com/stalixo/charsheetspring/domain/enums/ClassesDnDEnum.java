package com.stalixo.charsheetspring.domain.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum ClassesDnDEnum {
    BARBARIAN("BARBARIAN"),
    BARD("BARD"),
    CLERIC("CLERIC"),
    DRUID("DRUID"),
    FIGHTER("FIGHTER"),
    MONK("MONK"),
    PALADIN("PALADIN"),
    RANGER("RANGER"),
    ROGUE("ROGUE"),
    SORCERER("SORCERER"),
    WARLOCK("WARLOCK"),
    WIZARD("WIZARD");

    private final String value;

    private ClassesDnDEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }

    @JsonCreator
    public static ClassesDnDEnum forValue(String value) {
        for (ClassesDnDEnum classDnD : ClassesDnDEnum.values()) {
            if (classDnD.getValue().equalsIgnoreCase(value)) {
                return classDnD;
            }
        }
        throw new IllegalArgumentException("Invalid value for ClassesDnDEnum: " + value);
    }
}
