package com.stalixo.charsheetspring.resources.resourcesBlocks;

import com.stalixo.charsheetspring.domain.User;
import com.stalixo.charsheetspring.domain.subBlocks.AttributeBlock;
import com.stalixo.charsheetspring.services.servicesBlocks.AttributeBlockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/attributes")
public class AttributeBlockResource {

    @Autowired
    private AttributeBlockService service;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<AttributeBlock> findById(@PathVariable String id) {
        AttributeBlock obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}
