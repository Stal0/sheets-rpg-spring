package com.stalixo.charsheetspring.domain.factories;

import com.stalixo.charsheetspring.domain.Sheet;
import com.stalixo.charsheetspring.domain.blocks.AttributeBlock;
import com.stalixo.charsheetspring.domain.enums.SheetsModels;
import com.stalixo.charsheetspring.domain.implementations.attribute.AttributeDND;
import com.stalixo.charsheetspring.domain.implementations.attribute.AttributeOTHER;

public class AttributeFactory {

    public static AttributeBlock createBlock(String id, Sheet sheet, SheetsModels model) {
        switch (model) {
            case DND:
                return new AttributeDND(id, sheet);
            case OTHER:
                return new AttributeOTHER(id, sheet);
            default:
                throw new IllegalArgumentException("Modelo de ficha não identificado: " + model);
        }
    }
}
