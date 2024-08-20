package com.stalixo.charsheetspring.domain.sheets;

import com.stalixo.charsheetspring.domain.enums.EnumsDnD.AttributesDndEnum;
import com.stalixo.charsheetspring.domain.enums.EnumsDnD.ClassesDnDEnum;
import com.stalixo.charsheetspring.domain.enums.EnumsDnD.SkillsDnDEnum;
import com.stalixo.charsheetspring.domain.enums.SheetsModelsEnum;
import com.stalixo.charsheetspring.dto.response.UserResponseDTO;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serial;
import java.io.Serializable;
import java.util.*;

@Document
public class SheetDnD implements Sheet, Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    private String id;
    //Informações básicas do personagem
    private String name;
    private String race;
    private ClassesDnDEnum characterClass;
    private Integer level;
    private String alignment;
    private String background;
    private Double experiencePoints;
    //Maps dos atributos, proficiências e salva guardas, bônus de proficiência, inspiração e Sabedoria passiva.
    private Map<AttributesDndEnum, Double> attributes;
    private Map<SkillsDnDEnum, Boolean> proficiencies;
    private Map<AttributesDndEnum, Boolean> savingThrowsProficiency;
    private Map<SkillsDnDEnum, Integer> proficienciesValues;
    private Integer inspiration;
    private Integer proficiencyBonus;
    private Integer passiveWisdom;
    //Informações de combate, Classe de armadura, iniciativa, etc...
    private Integer armorClass;
    private Integer initiative;
    private Double speed;
    private String hitDice;
    private Boolean[] successes = new Boolean[3];
    private Boolean[] failures = new Boolean[3];
    //Equipamentos, talentos entre outros do personagem
    List<String> attacksAndConjuration = new ArrayList<>();
    List<String> proficienciesAndLanguage = new ArrayList<>();
    List<String> equipments = new ArrayList<>();
    List<String> featuresAndTraits = new ArrayList<>();
    //Informações sobre o personagem, personalidade, ideiais, fraquezas, etc...
    private String personalityTraits;
    private String ideals;
    private String bonds;
    private String flaws;

    private UserResponseDTO userDTO;
    private SheetsModelsEnum sheetsModels;

    public SheetDnD(UserResponseDTO userDTO, SheetsModelsEnum sheetsModels) {
        attributes = new HashMap<>();
        proficiencies = new HashMap<>();
        savingThrowsProficiency = new HashMap<>();
        proficienciesValues = new HashMap<>();
        this.userDTO = userDTO;
        this.sheetsModels = sheetsModels;
    }

    private int calculateModifier(double attributeValue) {
        return (int) Math.floor((attributeValue - 10) / 2);
    }

    public int getSkillValue(SkillsDnDEnum skill) {
        AttributesDndEnum associatedAttribute = skill.getAtributoAssociado();
        double attributeValue = attributes.getOrDefault(associatedAttribute, 10.0);
        int modifier = calculateModifier(attributeValue);
        if (proficiencies.getOrDefault(skill, false)) {
            modifier += proficiencyBonus;
        }
        return modifier;
    }

    public int getSavingThrowValue(AttributesDndEnum attribute) {
        double attributeValue = attributes.getOrDefault(attribute, 10.0);
        int modifier = calculateModifier(attributeValue);
        if (savingThrowsProficiency.getOrDefault(attribute, false)) {
            modifier += proficiencyBonus;
        }
        return modifier;
    }

    public void calculateProficienciesValues() {
        for (SkillsDnDEnum skill : SkillsDnDEnum.values()) {
            proficienciesValues.put(skill, getSkillValue(skill));
        }
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

    public Map<SkillsDnDEnum, Integer> getProficienciesValues() {
        return proficienciesValues;
    }

    public void setProficienciesValues(Map<SkillsDnDEnum, Integer> proficienciesValues) {
        this.proficienciesValues = proficienciesValues;
    }

    public Integer getInspiration() {
        return inspiration;
    }

    public void setInspiration(Integer inspiration) {
        this.inspiration = inspiration;
    }

    public Integer getPassiveWisdom() {
        return passiveWisdom;
    }

    public void setPassiveWisdom(Integer passiveWisdom) {
        this.passiveWisdom = passiveWisdom;
    }

    public Integer getArmorClass() {
        return armorClass;
    }

    public void setArmorClass(Integer armorClass) {
        this.armorClass = armorClass;
    }

    public Integer getInitiative() {
        return initiative;
    }

    public void setInitiative(Integer initiative) {
        this.initiative = initiative;
    }

    public Double getSpeed() {
        return speed;
    }

    public void setSpeed(Double speed) {
        this.speed = speed;
    }

    public String getHitDice() {
        return hitDice;
    }

    public void setHitDice(String hitDice) {
        this.hitDice = hitDice;
    }

    public Boolean[] getSuccesses() {
        return successes;
    }

    public void setSuccesses(Boolean[] successes) {
        this.successes = successes;
    }

    public Boolean[] getFailures() {
        return failures;
    }

    public void setFailures(Boolean[] failures) {
        this.failures = failures;
    }

    public List<String> getAttacksAndConjuration() {
        return attacksAndConjuration;
    }

    public void setAttacksAndConjuration(List<String> attacksAndConjuration) {
        this.attacksAndConjuration = attacksAndConjuration;
    }

    public List<String> getProficienciesAndLanguage() {
        return proficienciesAndLanguage;
    }

    public void setProficienciesAndLanguage(List<String> proficienciesAndLanguage) {
        this.proficienciesAndLanguage = proficienciesAndLanguage;
    }

    public List<String> getEquipments() {
        return equipments;
    }

    public void setEquipments(List<String> equipments) {
        this.equipments = equipments;
    }

    public List<String> getFeaturesAndTraits() {
        return featuresAndTraits;
    }

    public void setFeaturesAndTraits(List<String> featuresAndTraits) {
        this.featuresAndTraits = featuresAndTraits;
    }

    public String getPersonalityTraits() {
        return personalityTraits;
    }

    public void setPersonalityTraits(String personalityTraits) {
        this.personalityTraits = personalityTraits;
    }

    public String getIdeals() {
        return ideals;
    }

    public void setIdeals(String ideals) {
        this.ideals = ideals;
    }

    public String getBonds() {
        return bonds;
    }

    public void setBonds(String bonds) {
        this.bonds = bonds;
    }

    public String getFlaws() {
        return flaws;
    }

    public void setFlaws(String flaws) {
        this.flaws = flaws;
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
