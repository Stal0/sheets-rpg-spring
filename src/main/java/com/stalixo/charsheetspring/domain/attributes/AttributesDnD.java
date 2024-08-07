package com.stalixo.charsheetspring.domain.attributes;

public class AttributesDnD implements Attributes{

    private int value;

    public AttributesDnD(int value) {
        this.value = value;
    }

    @Override
    public int getModify() {
        return (value - 10) / 2;
    }

    @Override
    public int getValue() {
        return value;
    }

    @Override
    public void setValue(int value) {
        this.value = value;
    }
}
