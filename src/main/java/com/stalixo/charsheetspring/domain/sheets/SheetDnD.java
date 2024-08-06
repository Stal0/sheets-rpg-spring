package com.stalixo.charsheetspring.domain.sheets;

import com.stalixo.charsheetspring.domain.enums.SheetsModels;
import com.stalixo.charsheetspring.dto.response.UserResponseDTO;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@Document
public class SheetDnD implements Sheet{

    @Id
    private String id;

    private UserResponseDTO userDTO;
    private SheetsModels sheetsModels;

    private String name;
    private String race;
    private String characterClass;
    private Integer level;
    private String alignment;
    private String background;
    private Double experiencePoints;

    private Map<String, Double> ability;


    public SheetDnD(UserResponseDTO userDTO, SheetsModels sheetsModels) {
        ability = new HashMap<>();
        this.userDTO = userDTO;
        this.sheetsModels = sheetsModels;
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

    public UserResponseDTO getUserDTO() {
        return userDTO;
    }

    public void setUserDTO(UserResponseDTO userDTO) {
        this.userDTO = userDTO;
    }

    public SheetsModels getSheetsModels() {
        return sheetsModels;
    }

    public void setSheetsModels(SheetsModels sheetsModels) {
        this.sheetsModels = sheetsModels;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getCharacterClass() {
        return characterClass;
    }

    public void setCharacterClass(String characterClass) {
        this.characterClass = characterClass;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getAlignment() {
        return alignment;
    }

    public void setAlignment(String alignment) {
        this.alignment = alignment;
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public Double getExperiencePoints() {
        return experiencePoints;
    }

    public void setExperiencePoints(Double experiencePoints) {
        this.experiencePoints = experiencePoints;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SheetDnD that = (SheetDnD) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
