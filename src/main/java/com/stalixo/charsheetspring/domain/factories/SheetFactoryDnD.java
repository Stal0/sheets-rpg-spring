package com.stalixo.charsheetspring.domain.factories;

import com.stalixo.charsheetspring.domain.enums.AttributesDndEnum;
import com.stalixo.charsheetspring.domain.enums.SheetsModelsEnum;
import com.stalixo.charsheetspring.domain.enums.SkillsDnDEnum;
import com.stalixo.charsheetspring.domain.sheets.Sheet;
import com.stalixo.charsheetspring.domain.sheets.SheetDnD;
import com.stalixo.charsheetspring.dto.response.UserResponseDTO;

import java.util.HashMap;
import java.util.Map;

public class SheetFactoryDnD implements SheetFactory{

    @Override
    public SheetDnD createSheet(UserResponseDTO userDTO, SheetsModelsEnum sheetsModel) {
        SheetDnD sheetDnD = new SheetDnD(userDTO, sheetsModel);

        Map<AttributesDndEnum, Double> attributes = new HashMap<>();
        attributes.put(AttributesDndEnum.STRENGTH, 10.0);
        attributes.put(AttributesDndEnum.DEXTERITY, 10.0);
        attributes.put(AttributesDndEnum.CONSTITUTION, 10.0);
        attributes.put(AttributesDndEnum.WISDOM, 10.0);
        attributes.put(AttributesDndEnum.INTELLIGENCE, 10.0);
        attributes.put(AttributesDndEnum.CHARISMA, 10.0);
        sheetDnD.setAttributes(attributes);

        Map<SkillsDnDEnum, Boolean> proficiencies = new HashMap<>();
        proficiencies.put()
        return sheetDnD;
    }
}
