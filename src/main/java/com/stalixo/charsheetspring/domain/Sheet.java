package com.stalixo.charsheetspring.domain;

import com.stalixo.charsheetspring.domain.subBlocks.CharacterInfoBlock;
import com.stalixo.charsheetspring.dto.UserDTO;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Document
public class Sheet implements Serializable {
    private static final long serialVersionUID = 1l;

    private String id;
    private String name;

    private UserDTO userDTO;

    private List<Block> blocks = new ArrayList<>();

    public Sheet() {
    }

    public Sheet(String id, String name, UserDTO userDTO) {
        this.id = id;
        this.name = name;
        this.userDTO = userDTO;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Block> getBlocks() {
        return blocks;
    }

    public void addBlock(Block block) {
        blocks.add(block);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sheet sheet = (Sheet) o;
        return Objects.equals(id, sheet.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }


}
