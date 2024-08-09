package com.stalixo.charsheetspring.resources;

import com.stalixo.charsheetspring.domain.enums.ClassesDnDEnum;
import com.stalixo.charsheetspring.domain.sheets.SheetDnD;
import com.stalixo.charsheetspring.dto.sheets.dnd.*;
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
        SheetDnD sheet = service.getSheetById(id);
        return ResponseEntity.ok().body(sheet);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Void> delete(@PathVariable String id) {
        service.deleteSheet(id);
        return ResponseEntity.noContent().build();
    }

    @RequestMapping(value = "/{id}/basic", method = RequestMethod.PUT)
    public ResponseEntity<Void> update(@PathVariable String id, @RequestBody SheetDndBasicInfoDTO sheet) {
        service.updateBasicInfo(id, sheet.getName(), sheet.getRace(), sheet.getClassDnD(), sheet.getLevel(), sheet.getAlignment(), sheet.getBackground(), sheet.getExperiencePoints());
        return ResponseEntity.noContent().build();
    }

    @RequestMapping(value = "/{id}/attributes", method = RequestMethod.PUT)
    public ResponseEntity<Void> updateAttributes(@PathVariable String id, @RequestBody SheetDndAttributesInfoDTO dto) {
        service.updateAttributesInfo(id, dto.getAttributes(), dto.getProficiencies(), dto.getSavingThrowsProficiency(),
                dto.getProficienciesValues(), dto.getInspiration(), dto.getProficiencyBonus(), dto.getPassiveWisdom());
        return ResponseEntity.noContent().build();
    }

    @RequestMapping(value = "/{id}/combat", method = RequestMethod.PUT)
    public ResponseEntity<Void> updateCombatInfo(@PathVariable String id, @RequestBody SheetDndCombatInfoDTO dto) {
        service.updateCombatInfo(id, dto.getArmorClass(), dto.getInitiative(), dto.getSpeed(), dto.getHitDice(),
                dto.getSuccesses(), dto.getFailures());
        return ResponseEntity.noContent().build();
    }

    @RequestMapping(value = "/{id}/equips", method = RequestMethod.PUT)
    public ResponseEntity<Void> updateEquipsAndOthers(@PathVariable String id, @RequestBody SheetDndEquipsAndOthersDTO dto) {
        service.updateEquipsAndOthers(id, dto.getAttacksAndConjuration(), dto.getProficienciesAndLanguage(),
                dto.getEquipments(), dto.getFeaturesAndTraits());
        return ResponseEntity.noContent().build();
    }

    @RequestMapping(value = "/{id}/personality", method = RequestMethod.PUT)
    public ResponseEntity<Void> updatePersonalityTraits(@PathVariable String id, @RequestBody SheetDndPersonalityTraitsDTO dto) {
        service.updatePersonalityTraits(id, dto.getPersonalityTraits(), dto.getIdeals(), dto.getBonds(), dto.getFlaws());
        return ResponseEntity.noContent().build();
    }



}
