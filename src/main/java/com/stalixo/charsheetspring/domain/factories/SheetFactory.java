package com.stalixo.charsheetspring.domain.factories;

import com.stalixo.charsheetspring.domain.enums.SheetsModelsEnum;
import com.stalixo.charsheetspring.domain.sheets.Sheet;
import com.stalixo.charsheetspring.dto.response.UserResponseDTO;

public interface SheetFactory {

    public Sheet createSheet(UserResponseDTO userDTO, SheetsModelsEnum sheetsModel);

}
