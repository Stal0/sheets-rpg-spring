package com.stalixo.charsheetspring.services.servicesBlocks;

import com.stalixo.charsheetspring.domain.blocks.CharacterInfoBlock;
import com.stalixo.charsheetspring.repositories.repositoriesBlocks.CharacterInfoBlockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CharacterInfoBlockService {

    @Autowired
    private CharacterInfoBlockRepository repo;

    public CharacterInfoBlock findById(String id) {
        Optional<CharacterInfoBlock> obj = repo.findById(id);
        obj.orElseThrow();
        return obj.get();
    }
}
