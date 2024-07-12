package com.stalixo.charsheetspring.domain.implementations;

import com.stalixo.charsheetspring.domain.blocks.AttributeBlock;

public class AttributeDND extends AttributeBlock {

    public AttributeDND (String id) {
        super(id);
        attributes.put("Força", 0.0);
        attributes.put("Destreza", 0.0);
        attributes.put("Constituição", 0.0);
        attributes.put("Inteligência", 0.0);
        attributes.put("Sabedoria", 0.0);
        attributes.put("Carisma", 0.0);
    }

}
