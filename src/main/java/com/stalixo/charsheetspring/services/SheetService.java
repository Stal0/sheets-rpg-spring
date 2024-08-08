package com.stalixo.charsheetspring.services;

import com.stalixo.charsheetspring.domain.sheets.Sheet;
import com.stalixo.charsheetspring.domain.sheets.SheetDnD;
import com.stalixo.charsheetspring.repositories.SheetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SheetService {

    @Autowired
    private SheetRepository repo;

    public List<SheetDnD> findAll() {
        return repo.findAll();
    }

    public SheetDnD findById(String id) {
        Optional<SheetDnD> obj = repo.findById(id);
        obj.orElseThrow();
        return obj.get();
    }

    public SheetDnD update(SheetDnD obj) {
        Optional<SheetDnD> newObj = repo.findById(obj.getId());
        updateData(newObj.get(), obj);
        return repo.save(newObj.get());
    }

    public void delete(String id) {
        findById(id);
        repo.deleteById(id);
    }

    private void updateData(SheetDnD sheet, SheetDnD obj) {
        sheet.setName(obj.getName());
    }
}
