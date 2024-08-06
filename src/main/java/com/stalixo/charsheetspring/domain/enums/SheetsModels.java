package com.stalixo.charsheetspring.domain.enums;

public enum SheetsModels {

    DND("DND"),
    TORMENTA("TORMENT"),
    OTHER("OTHER");

    private final String value;

    private SheetsModels (String s) {
        this.value = s;
    }

    public String getValue() {
        return value;
    }

    public static SheetsModels fromValue(String value) {
        for (SheetsModels models : SheetsModels.values()) {
            if (models.value.equals(value)) {
                return models;
            }
        }
        throw new IllegalArgumentException("Modelo de ficha desconhecido: " + value);
    }
}
