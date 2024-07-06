package com.stalixo.charsheetspring.domain;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

public abstract class Block implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private String id;
    private Sheet sheet;

    public Block() {
    }

    public Block(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Block block = (Block) o;
        return Objects.equals(id, block.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
