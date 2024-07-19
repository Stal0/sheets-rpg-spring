package com.stalixo.charsheetspring.domain.blocks;

import com.stalixo.charsheetspring.domain.Sheet;
import org.springframework.data.annotation.Id;

import java.io.Serializable;
import java.util.Objects;

public abstract class Block implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private String id;
    protected Sheet sheet;

    public Block() {
    }

    public Block(Sheet sheet, String id) {
        this.sheet = sheet;
        this.id = id;
    }

    public Sheet getSheet() {
        return sheet;
    }

    public void setSheet(Sheet sheet) {
        this.sheet = sheet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Block block = (Block) o;
        return Objects.equals(sheet, block.sheet);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(sheet);
    }
}