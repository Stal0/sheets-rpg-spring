package com.stalixo.charsheetspring.domain.subBlocks;

import com.stalixo.charsheetspring.domain.Block;
import com.stalixo.charsheetspring.domain.Sheet;
import com.stalixo.charsheetspring.domain.enums.SheetsModels;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.HashMap;
import java.util.Map;

@Document
public class AttributeBlock extends Block {

    private Map<String, Double> attributes = new HashMap<String, Double>();

    public AttributeBlock(String id, Sheet sheet) {
        super(id);
        if (sheet.getSheetsModels() == SheetsModels.DND) {
            attributes.put("Força", 0.0);
            attributes.put("Destreza", 0.0);
            attributes.put("Constituição", 0.0);
            attributes.put("Inteligência", 0.0);
            attributes.put("Sabedoria", 0.0);
            attributes.put("Carisma", 0.0);
        }
    }

    public Map<String, Double> getAttributes() {
        return attributes;
    }

    public void setAttribute(String obj, Double value) {

        if (obj == null || obj.trim().isEmpty()) {
            throw new IllegalArgumentException("Attribute name cannot be null or empty");
        }
        if (value == null) {
            throw new IllegalArgumentException("Attribute value cannot be null");
        }
        attributes.put(obj, value);
    }

    public void removeAttribute(String obj) {
        if (obj == null || obj.trim().isEmpty()) {
            throw new IllegalArgumentException("Attribute name cannot be null or empty");
        }
        attributes.remove(obj);
    }
}
