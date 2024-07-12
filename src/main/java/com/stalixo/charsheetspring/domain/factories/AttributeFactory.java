package com.stalixo.charsheetspring.domain.factories;

import com.stalixo.charsheetspring.domain.blocks.AttributeBlock;
import com.stalixo.charsheetspring.domain.enums.SheetsModels;
import com.stalixo.charsheetspring.domain.implementations.AttributeDND;
import com.stalixo.charsheetspring.domain.implementations.AttributeOTHER;

public class AttributeFactory {

    public static AttributeBlock createBlock(String id, SheetsModels model) {
        switch (model) {
            case DND:
                return new AttributeDND(id);
            case OTHER:
                return new AttributeOTHER(id);
            default:
                throw new IllegalArgumentException("Modelo de ficha não identificado: " + model);
        }
    }
}
