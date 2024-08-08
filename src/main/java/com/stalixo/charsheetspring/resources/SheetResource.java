package com.stalixo.charsheetspring.resources;

import com.stalixo.charsheetspring.domain.sheets.SheetDnD;
import com.stalixo.charsheetspring.services.SheetDnDService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/sheets")
public class SheetResource {

    @Autowired
    private SheetDnDService service;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<SheetDnD>> findAll() {
        List<SheetDnD> list = service.getAllSheets();
        return ResponseEntity.ok().body(list);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<SheetDnD> findById(@PathVariable String id) {
        SheetDnD obj = service.getSheetById(id);
        return ResponseEntity.ok().body(obj);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Void> delete(@PathVariable String id) {
        service.deleteSheet(id);
        return ResponseEntity.noContent().build();
    }

  //  @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
  //  public ResponseEntity<Void> update(@PathVariable String id, @RequestBody String )

}
