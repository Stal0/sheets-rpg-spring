package com.stalixo.charsheetspring.dto.sheets.dnd;

import com.stalixo.charsheetspring.domain.enums.EnumsDnD.ClassesDnDEnum;
import com.stalixo.charsheetspring.domain.sheets.SheetDnD;

import java.io.Serializable;

public class SheetDndBasicInfoDTO implements Serializable {

    private String name;
    private String race;
    private ClassesDnDEnum classDnD;
    private int level;
    private String alignment;
    private String background;
    private Double experiencePoints;

    public SheetDndBasicInfoDTO() {
    }

    public SheetDndBasicInfoDTO(SheetDnD sheetDnD) {
        this.name = sheetDnD.getName();
        this.race = sheetDnD.getRace();
        this.classDnD = sheetDnD.getCharacterClass();
        this.level = sheetDnD.getLevel();
        this.alignment = sheetDnD.getAlignment();
        this.background = sheetDnD.getBackground();
        this.experiencePoints = sheetDnD.getExperiencePoints();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public ClassesDnDEnum getClassDnD() {
        return classDnD;
    }

    public void setClassDnD(ClassesDnDEnum classDnD) {
        this.classDnD = classDnD;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
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
}
