package com.stalixo.charsheetspring.domain.blocks;

import java.util.HashMap;
import java.util.Map;

public abstract class AttributeBlock extends Block {

    protected Map<String, Double> attributes = new HashMap<String, Double>();

    public AttributeBlock() {
    }

    public AttributeBlock(String id) {
        super(id);
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
