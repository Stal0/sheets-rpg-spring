package com.stalixo.charsheetspring.domain.subBlocks;

import com.stalixo.charsheetspring.domain.Block;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.HashMap;
import java.util.Map;

@Document
public class AttributeBlock extends Block {

    private Map<String, Double> attributes = new HashMap<String, Double>();

    public AttributeBlock() {}

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
