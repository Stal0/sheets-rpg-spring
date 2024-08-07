package com.stalixo.charsheetspring.domain.enums;

public enum SheetsModelsEnum {

    DND("DND"),
    TORMENTA("TORMENT"),
    OTHER("OTHER");

    private final String value;

    private SheetsModelsEnum(String s) {
        this.value = s;
    }

    public String getValue() {
        return value;
    }

    public static SheetsModelsEnum fromValue(String value) {
        for (SheetsModelsEnum models : SheetsModelsEnum.values()) {
            if (models.value.equals(value)) {
                return models;
            }
        }
        throw new IllegalArgumentException("Modelo de ficha desconhecido: " + value);
    }
}
