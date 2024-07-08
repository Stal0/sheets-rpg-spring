package com.stalixo.charsheetspring.domain.enums;

public enum SheetsModels {

    DND("dnd"),
    OTHER("other");

    private String value;

    SheetsModels(String dnd) {
        this.value = dnd;
    }

    public String getValue() {
        return value;
    }
}
