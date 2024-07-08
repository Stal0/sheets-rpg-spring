package com.stalixo.charsheetspring.resources.resourcesBlocks;

import com.stalixo.charsheetspring.domain.blocks.AttributeBlock;
import com.stalixo.charsheetspring.dto.AttributeDTO;
import com.stalixo.charsheetspring.services.servicesBlocks.AttributeBlockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/attributes")
public class AttributeBlockResource {

    @Autowired
    private AttributeBlockService service;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<AttributeBlock>> findAll() {
        List<AttributeBlock> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<AttributeBlock> findById(@PathVariable String id) {
        AttributeBlock obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Void> setAttributeById(@RequestBody AttributeDTO attributeDTO, @PathVariable String id) {
        service.setAttributeById(id, attributeDTO);
        System.out.println(attributeDTO.getField());
        System.out.println(attributeDTO.getValue());
        return ResponseEntity.noContent().build();
    }
}
