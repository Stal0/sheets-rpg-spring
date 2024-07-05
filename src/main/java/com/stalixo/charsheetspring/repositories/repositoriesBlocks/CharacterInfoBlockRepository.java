package com.stalixo.charsheetspring.repositories.repositoriesBlocks;

import com.stalixo.charsheetspring.domain.subBlocks.CharacterInfoBlock;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CharacterInfoBlockRepository extends MongoRepository<CharacterInfoBlock, String> {
}
