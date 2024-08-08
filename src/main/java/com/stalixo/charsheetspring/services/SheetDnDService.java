package com.stalixo.charsheetspring.services;

import com.stalixo.charsheetspring.domain.sheets.SheetDnD;
import com.stalixo.charsheetspring.repositories.SheetDnDRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SheetDnDService implements SheetService<SheetDnD> {

    @Autowired
    private SheetDnDRepository repo;

    @Override
    public List<SheetDnD> getAllSheets() {
        return repo.findAll();
    }

    @Override
    public SheetDnD createSheet(SheetDnD sheet) {
        return repo.insert(sheet);
    }

    @Override
    public SheetDnD getSheetById(String id) {
        Optional<SheetDnD> obj = repo.findById(id);
        obj.orElseThrow();
        return obj.get();
    }

    public SheetDnD update(SheetDnD obj) {
        Optional<SheetDnD> newObj = repo.findById(obj.getId());
        updateData(newObj.get(), obj);
        return repo.save(newObj.get());
    }

    @Override
    public void deleteSheet(String id) {
        repo.findById(id);
        repo.deleteById(id);
    }

    private void updateData(SheetDnD sheet, SheetDnD obj) {
        sheet.setName(obj.getName());
    }
}
