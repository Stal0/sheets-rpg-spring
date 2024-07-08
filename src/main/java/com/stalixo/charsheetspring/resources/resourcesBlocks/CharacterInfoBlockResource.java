package com.stalixo.charsheetspring.resources.resourcesBlocks;

import com.stalixo.charsheetspring.domain.blocks.CharacterInfoBlock;
import com.stalixo.charsheetspring.services.servicesBlocks.CharacterInfoBlockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/charinfo")
public class CharacterInfoBlockResource {

    @Autowired
    private CharacterInfoBlockService service;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<CharacterInfoBlock> findById(@PathVariable String id) {
        CharacterInfoBlock obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}
