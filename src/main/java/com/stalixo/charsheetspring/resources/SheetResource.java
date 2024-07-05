package com.stalixo.charsheetspring.resources;

import com.stalixo.charsheetspring.domain.Sheet;
import com.stalixo.charsheetspring.domain.subBlocks.CharacterInfoBlock;
import com.stalixo.charsheetspring.services.SheetService;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Method;
import java.util.List;

@RestController
@RequestMapping(value = "/sheets")
public class SheetResource {

    @Autowired
    private SheetService service;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Sheet> findById(@PathVariable String id) {
        Sheet obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

}
