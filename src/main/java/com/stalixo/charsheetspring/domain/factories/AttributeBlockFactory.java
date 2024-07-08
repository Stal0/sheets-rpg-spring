package com.stalixo.charsheetspring.domain.factories;

import com.stalixo.charsheetspring.domain.blocks.AttributeBlock;
import com.stalixo.charsheetspring.domain.enums.SheetsModels;

import java.util.HashMap;
import java.util.Map;

public class AttributeBlockFactory {

    public static AttributeBlock createAttributeBlock(String id, SheetsModels model) {
        Map<String, Double> attributes = new HashMap<>();

        switch (model) {
            case DND:
                attributes.put("Força", 0.0);
                attributes.put("Destreza", 0.0);
                attributes.put("Constituição", 0.0);
                attributes.put("Inteligência", 0.0);
                attributes.put("Sabedoria", 0.0);
                attributes.put("Carisma", 0.0);
                break;

            case OTHER:
                break;

            default:
                throw new IllegalArgumentException("Modelo de ficha não suportado " + model);
        }
        return new AttributeBlock(id, attributes);
    }
}
