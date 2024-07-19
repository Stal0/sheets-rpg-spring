package com.stalixo.charsheetspring.domain.factories;

import com.stalixo.charsheetspring.domain.Sheet;
import com.stalixo.charsheetspring.domain.blocks.CharacterInfoBlock;
import com.stalixo.charsheetspring.domain.enums.SheetsModels;
import com.stalixo.charsheetspring.domain.implementations.attribute.AttributeOTHER;
import com.stalixo.charsheetspring.domain.implementations.characterInfo.CharacterInfoDND;
import com.stalixo.charsheetspring.domain.implementations.characterInfo.CharacterInfoOTHER;

public class CharacterInfoFactory {

    public static CharacterInfoBlock createBlock(String id, Sheet sheet, SheetsModels model) {
        switch (model) {
            case DND:
                return new CharacterInfoDND(id, sheet);
            case OTHER:
                return new CharacterInfoOTHER(id, sheet);
            default:
                throw new IllegalArgumentException("Modelo de ficha não identificado: " + model);
        }
    }


}
