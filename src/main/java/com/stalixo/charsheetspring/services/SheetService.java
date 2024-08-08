package com.stalixo.charsheetspring.services;

import com.stalixo.charsheetspring.domain.sheets.Sheet;

import java.util.List;

public interface SheetService<T extends Sheet> {
    T createSheet(T sheet);
    T getSheetById(String id);
    List<T> getAllSheets();
    void deleteSheet(String id);

}
