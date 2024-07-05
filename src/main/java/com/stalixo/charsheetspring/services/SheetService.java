package com.stalixo.charsheetspring.services;

import com.stalixo.charsheetspring.domain.Sheet;
import com.stalixo.charsheetspring.repositories.SheetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SheetService {

    @Autowired
    private SheetRepository repo;

    public List<Sheet> findAll() {
        return repo.findAll();
    }

    public Sheet findById(String id) {
        Optional<Sheet> obj = repo.findById(id);
        obj.orElseThrow();
        return obj.get();
    }
}
