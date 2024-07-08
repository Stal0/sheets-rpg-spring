package com.stalixo.charsheetspring.repositories.repositoriesBlocks;

import com.stalixo.charsheetspring.domain.blocks.AttributeBlock;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AttributeBlockRepository extends MongoRepository<AttributeBlock, String> {
}
