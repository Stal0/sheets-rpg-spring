package com.stalixo.charsheetspring.domain;

import com.stalixo.charsheetspring.domain.blocks.Block;
import com.stalixo.charsheetspring.domain.enums.SheetsModels;
import com.stalixo.charsheetspring.dto.request.UserRequestDTO;
import com.stalixo.charsheetspring.dto.response.UserResponseDTO;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Document
public class Sheet implements Serializable {
    private static final long serialVersionUID = 1l;

    @Id
    protected String id;
    protected String name;
    protected SheetsModels sheetsModels;

    protected UserResponseDTO userDTO;

    private List<Block> blocks = new ArrayList<>();

    public Sheet() {
    }

    public Sheet(String id, String name, UserResponseDTO userDTO, SheetsModels model) {
        this.id = id;
        this.name = name;
        this.userDTO = userDTO;
        this.sheetsModels = model;
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

    public SheetsModels getSheetsModels() {
        return sheetsModels;
    }

    public void setSheetsModels(SheetsModels sheetsModels) {
        this.sheetsModels = sheetsModels;
    }

    public UserResponseDTO getUserDTO() {
        return userDTO;
    }

    public void setUserDTO(UserResponseDTO userDTO) {
        this.userDTO = userDTO;
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
