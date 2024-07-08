package com.stalixo.charsheetspring.services.servicesBlocks;

import com.stalixo.charsheetspring.domain.blocks.AttributeBlock;
import com.stalixo.charsheetspring.dto.AttributeDTO;
import com.stalixo.charsheetspring.repositories.repositoriesBlocks.AttributeBlockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AttributeBlockService {

    @Autowired
    private AttributeBlockRepository repo;

    public List<AttributeBlock> findAll() {
        return repo.findAll();
    }

    public AttributeBlock findById(String id) {
        Optional<AttributeBlock> obj = repo.findById(id);
        obj.orElseThrow();
        return obj.get();
    }

    public void setAttributeById(String id, AttributeDTO attributeDTO) {
        Optional<AttributeBlock> obj = repo.findById(id);
        obj.orElseThrow();
        obj.get().setAttribute(attributeDTO.getField(), attributeDTO.getValue());
    }
}
