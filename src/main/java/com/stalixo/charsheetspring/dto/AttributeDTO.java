package com.stalixo.charsheetspring.dto;

import java.io.Serializable;
import java.util.Objects;

public class AttributeDTO implements Serializable {
private static final long serialVersionUID = 1L;

    private String field;
    private Double value;

    public AttributeDTO() {
    }

    public AttributeDTO(Double value, String field) {
        this.value = value;
        this.field = field;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AttributeDTO that = (AttributeDTO) o;
        return Objects.equals(field, that.field);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(field);
    }
}
