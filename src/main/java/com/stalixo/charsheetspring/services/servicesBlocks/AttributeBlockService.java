package com.stalixo.charsheetspring.services.servicesBlocks;

import com.stalixo.charsheetspring.domain.subBlocks.AttributeBlock;
import com.stalixo.charsheetspring.domain.subBlocks.CharacterInfoBlock;
import com.stalixo.charsheetspring.repositories.repositoriesBlocks.AttributeBlockRepository;
import com.stalixo.charsheetspring.repositories.repositoriesBlocks.CharacterInfoBlockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AttributeBlockService {

    @Autowired
    private AttributeBlockRepository repo;

    public AttributeBlock findById(String id) {
        Optional<AttributeBlock> obj = repo.findById(id);
        obj.orElseThrow();
        return obj.get();
    }
}
