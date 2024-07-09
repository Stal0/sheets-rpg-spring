package com.stalixo.charsheetspring.domain.blocks;

import com.stalixo.charsheetspring.domain.Sheet;
import com.stalixo.charsheetspring.domain.enums.SheetsModels;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.HashMap;
import java.util.Map;

@Document
public class AttributeBlock extends Block {

    private Map<String, Double> attributes = new HashMap<String, Double>();

    public AttributeBlock() {
    }

    public AttributeBlock(String id, Map<String, Double> attributes) {
        super(id);
        this.attributes = attributes;
    }

    public Map<String, Double> getAttributes() {
        return attributes;
    }

    public void setAttributes(Map<String, Double> attributes) {
        this.attributes = attributes;
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
