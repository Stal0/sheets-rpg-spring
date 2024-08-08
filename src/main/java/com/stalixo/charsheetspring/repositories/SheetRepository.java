package com.stalixo.charsheetspring.repositories;

import com.stalixo.charsheetspring.domain.sheets.SheetDnD;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SheetRepository extends MongoRepository<SheetDnD, String> {

}
