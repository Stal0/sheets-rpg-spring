package com.stalixo.charsheetspring.domain.sheets;

import com.stalixo.charsheetspring.domain.enums.SheetsModelsEnum;
import com.stalixo.charsheetspring.dto.response.UserResponseDTO;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@Document
public class SheetTormenta implements Sheet{

    @Id
    private String id;

    private UserResponseDTO userDTO;
    private SheetsModelsEnum sheetsModels;

    private String name;
    private String race;
    private String characterClass;
    private String tendency;
    private Integer age;
    private String gender;
    private String divinity;
    private Double size;
    private Double displacement;

    private Map<String, Double> ability;


    public SheetTormenta(UserResponseDTO userDTO, SheetsModelsEnum sheetsModels) {
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

    public String getCharacterClass() {
        return characterClass;
    }

    public void setCharacterClass(String characterClass) {
        this.characterClass = characterClass;
    }

    public String getTendency() {
        return tendency;
    }

    public void setTendency(String tendency) {
        this.tendency = tendency;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDivinity() {
        return divinity;
    }

    public void setDivinity(String divinity) {
        this.divinity = divinity;
    }

    public Double getSize() {
        return size;
    }

    public void setSize(Double size) {
        this.size = size;
    }

    public Double getDisplacement() {
        return displacement;
    }

    public void setDisplacement(Double displacement) {
        this.displacement = displacement;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SheetTormenta that = (SheetTormenta) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
