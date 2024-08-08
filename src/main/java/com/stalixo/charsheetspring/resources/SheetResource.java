package com.stalixo.charsheetspring.resources;

import com.stalixo.charsheetspring.domain.sheets.Sheet;
import com.stalixo.charsheetspring.domain.sheets.SheetDnD;
import com.stalixo.charsheetspring.services.SheetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/sheets")
public class SheetResource {

    @Autowired
    private SheetService service;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<SheetDnD>> findAll() {
        List<SheetDnD> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<SheetDnD> findById(@PathVariable String id) {
        SheetDnD obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Void> delete(@PathVariable String id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

  //  @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
  //  public ResponseEntity<Void> update(@PathVariable String id, @RequestBody String )

}
