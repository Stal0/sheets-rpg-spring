package com.stalixo.charsheetspring.domain.factories;

import com.stalixo.charsheetspring.domain.enums.SheetsModelsEnum;
import com.stalixo.charsheetspring.domain.sheets.SheetDnD;
import com.stalixo.charsheetspring.dto.response.UserResponseDTO;

public class SheetFactoryDnD implements SheetFactory{

    @Override
    public SheetDnD createSheet(UserResponseDTO userDTO, SheetsModelsEnum sheetsModel) {
        return new SheetDnD(userDTO, sheetsModel);
    }
}
