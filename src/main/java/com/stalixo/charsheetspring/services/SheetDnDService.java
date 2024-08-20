package com.stalixo.charsheetspring.services;

import com.stalixo.charsheetspring.domain.enums.EnumsDnD.AttributesDndEnum;
import com.stalixo.charsheetspring.domain.enums.EnumsDnD.ClassesDnDEnum;
import com.stalixo.charsheetspring.domain.enums.EnumsDnD.SkillsDnDEnum;
import com.stalixo.charsheetspring.domain.sheets.SheetDnD;
import com.stalixo.charsheetspring.repositories.SheetDnDRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class SheetDnDService implements SheetService<SheetDnD> {

    @Autowired
    private SheetDnDRepository repo;

    @Override
    public List<SheetDnD> getAllSheets() {
        return repo.findAll();
    }

    @Override
    public SheetDnD createSheet(SheetDnD sheet) {
        return repo.insert(sheet);
    }

    @Override
    public SheetDnD getSheetById(String id) {
        Optional<SheetDnD> obj = repo.findById(id);
        obj.orElseThrow();
        return obj.get();
    }

    public SheetDnD updateBasicInfo(String id, String name, String race, ClassesDnDEnum classDnD, int level, String alignment, String background, Double experiencePoints) {
        SheetDnD existingSheet = repo.findById(id).orElseThrow(() -> new RuntimeException("Sheet not found"));
        existingSheet.setName(name);
        existingSheet.setRace(race);
        existingSheet.setCharacterClass(classDnD);
        existingSheet.setLevel(level);
        existingSheet.setAlignment(alignment);
        existingSheet.setBackground(background);
        existingSheet.setExperiencePoints(experiencePoints);
        return repo.save(existingSheet);
    }

    public SheetDnD updateAttributesInfo(String id, Map<AttributesDndEnum, Double> attributes , Map<SkillsDnDEnum, Boolean> proficiencies, Map<AttributesDndEnum, Boolean> savingThrowsProficiency, Map<SkillsDnDEnum, Integer> proficienciesValues, int inspiration, int proficiencyBonus, int passiveWisdom) {
        SheetDnD existingSheet = repo.findById(id).orElseThrow(() -> new RuntimeException("Sheet not found"));
        existingSheet.setAttributes(attributes);
        existingSheet.setProficiencies(proficiencies);
        existingSheet.setSavingThrowsProficiency(savingThrowsProficiency);
        existingSheet.setProficienciesValues(proficienciesValues);
        existingSheet.setInspiration(inspiration);
        existingSheet.setProficiencyBonus(proficiencyBonus);
        existingSheet.setPassiveWisdom(passiveWisdom);
        existingSheet.calculateProficienciesValues();
        return repo.save(existingSheet);
    }

    public SheetDnD updateCombatInfo(String id, int armorClass, int initiative, double speed, String hitDice, Boolean[] successes, Boolean[] failures) {
        SheetDnD existingSheet = repo.findById(id).orElseThrow(() -> new RuntimeException("Sheet not found"));
        existingSheet.setArmorClass(armorClass);
        existingSheet.setInitiative(initiative);
        existingSheet.setSpeed(speed);
        existingSheet.setHitDice(hitDice);
        existingSheet.setSuccesses(successes);
        existingSheet.setFailures(failures);
        return repo.save(existingSheet);
    }

    public SheetDnD updateEquipsAndOthers(String id, List<String> attacksAndConjuration, List<String> proficienciesAndLanguage, List<String> equipments, List<String> featuresAndTraits) {
        SheetDnD existingSheet = repo.findById(id).orElseThrow(() -> new RuntimeException("Sheet not found"));
        existingSheet.setAttacksAndConjuration(attacksAndConjuration);
        existingSheet.setProficienciesAndLanguage(proficienciesAndLanguage);
        existingSheet.setEquipments(equipments);
        existingSheet.setFeaturesAndTraits(featuresAndTraits);
        return repo.save(existingSheet);
    }

    public SheetDnD updatePersonalityTraits(String id, String personalityTraits, String ideals, String bounds, String flaws) {
        SheetDnD existingSheet = repo.findById(id).orElseThrow(() -> new RuntimeException("Sheet not found"));
        existingSheet.setPersonalityTraits(personalityTraits);
        existingSheet.setIdeals(ideals);
        existingSheet.setBonds(bounds);
        existingSheet.setFlaws(flaws);
        return repo.save(existingSheet);
    }

    @Override
    public void deleteSheet(String id) {
        repo.findById(id);
        repo.deleteById(id);
    }

    private void updateData(SheetDnD sheet, SheetDnD obj) {
        sheet.setName(obj.getName());
    }
}
