package com.stalixo.charsheetspring.domain.sheets;

import com.stalixo.charsheetspring.domain.enums.AttributesDndEnum;
import com.stalixo.charsheetspring.domain.enums.ClassesDnDEnum;
import com.stalixo.charsheetspring.domain.enums.SkillsDnDEnum;
import com.stalixo.charsheetspring.domain.enums.SheetsModelsEnum;
import com.stalixo.charsheetspring.dto.response.UserResponseDTO;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serial;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@Document
public class SheetDnD implements Sheet, Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    private String id;
    private String name;
    private String race;
    private ClassesDnDEnum characterClass;
    private Integer level;
    private String alignment;
    private String background;
    private Double experiencePoints;

    private Map<AttributesDndEnum, Double> attributes;
    private Map<SkillsDnDEnum, Boolean> proficiencies;
    private Map<AttributesDndEnum, Boolean> savingThrowsProficiency;

    private Integer inspiration;
    private Integer proficiencyBonus;
    private Integer passiveWisdom;

    private Integer armorClass;
    private Integer initiative;
    private Integer speed;

    private String hitDice;

    private Boolean[] successes = new Boolean[3];
    private Boolean[] failures = new Boolean[3];


    private UserResponseDTO userDTO;
    private SheetsModelsEnum sheetsModels;

    public SheetDnD(UserResponseDTO userDTO, SheetsModelsEnum sheetsModels) {
        attributes = new HashMap<>();
        proficiencies = new HashMap<>();
        savingThrowsProficiency = new HashMap<>();
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

    public SheetsModelsEnum getSheetsModels() {
        return sheetsModels;
    }

    public void setSheetsModels(SheetsModelsEnum sheetsModels) {
        this.sheetsModels = sheetsModels;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public ClassesDnDEnum getCharacterClass() {
        return characterClass;
    }

    public void setCharacterClass(ClassesDnDEnum characterClass) {
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

    public Map<AttributesDndEnum, Double> getAttributes() {
        return attributes;
    }

    public void setAttributes(Map<AttributesDndEnum, Double> attributes) {
        this.attributes = attributes;
    }

    public Map<SkillsDnDEnum, Boolean> getProficiencies() {
        return proficiencies;
    }

    public void setProficiencies(Map<SkillsDnDEnum, Boolean> proficiencies) {
        this.proficiencies = proficiencies;
    }

    public Map<AttributesDndEnum, Boolean> getSavingThrowsProficiency() {
        return savingThrowsProficiency;
    }

    public void setSavingThrowsProficiency(Map<AttributesDndEnum, Boolean> savingThrowsProficiency) {
        this.savingThrowsProficiency = savingThrowsProficiency;
    }

    public Integer getProficiencyBonus() {
        return proficiencyBonus;
    }

    public void setProficiencyBonus(Integer proficiencyBonus) {
        this.proficiencyBonus = proficiencyBonus;
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
