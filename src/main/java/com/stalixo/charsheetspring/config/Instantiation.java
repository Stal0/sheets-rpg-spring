package com.stalixo.charsheetspring.config;

import com.stalixo.charsheetspring.domain.User;
import com.stalixo.charsheetspring.domain.enums.EnumsDnD.AttributesDndEnum;
import com.stalixo.charsheetspring.domain.enums.EnumsDnD.ClassesDnDEnum;
import com.stalixo.charsheetspring.domain.enums.SheetsModelsEnum;
import com.stalixo.charsheetspring.domain.enums.EnumsDnD.SkillsDnDEnum;
import com.stalixo.charsheetspring.domain.factories.SheetFactory;
import com.stalixo.charsheetspring.domain.factories.SheetFactoryDnD;
import com.stalixo.charsheetspring.domain.sheets.SheetDnD;
import com.stalixo.charsheetspring.dto.response.UserResponseDTO;
import com.stalixo.charsheetspring.repositories.SheetDnDRepository;
import com.stalixo.charsheetspring.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@Configuration
public class Instantiation implements CommandLineRunner {

    @Autowired
    private SheetDnDRepository sheetRepository;

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {

        sheetRepository.deleteAll();
        userRepository.deleteAll();

        User user1 = new User(null, "Lucas G", "lucasg@gmail.com", "12345");
        User user2 = new User(null, "Edvaldo", "edvaldo@gmail.com", "123456789");

        userRepository.saveAll(Arrays.asList(user1, user2));

        SheetFactory sheetFactoryDnD = new SheetFactoryDnD();
        SheetDnD sheetDnD = (SheetDnD) sheetFactoryDnD.createSheet(new UserResponseDTO(user1), SheetsModelsEnum.DND);

        Map<AttributesDndEnum, Double> attributes = new HashMap<>();
        attributes.put(AttributesDndEnum.STRENGTH, 8.0);
        attributes.put(AttributesDndEnum.DEXTERITY, 14.0);
        attributes.put(AttributesDndEnum.CONSTITUTION, 12.0);
        attributes.put(AttributesDndEnum.WISDOM, 10.0);
        attributes.put(AttributesDndEnum.INTELLIGENCE, 16.0);
        attributes.put(AttributesDndEnum.CHARISMA, 15.0);
        sheetDnD.setAttributes(attributes);

        Map<SkillsDnDEnum, Boolean> proficiencies = new HashMap<>();
        proficiencies.put(SkillsDnDEnum.ARCANA, true);
        proficiencies.put(SkillsDnDEnum.STEALTH, true);
        proficiencies.put(SkillsDnDEnum.ACROBATICS, true);
        sheetDnD.setProficiencies(proficiencies);
        sheetDnD.setCharacterClass(ClassesDnDEnum.CLERIC);
        sheetDnD.setLevel(20);
        sheetDnD.setAlignment("Good");
        sheetDnD.setBackground("a cleric devoted to god");
        sheetDnD.setRace("Human");
        sheetDnD.setName("Kile Rowman");
        sheetDnD.setProficiencyBonus(2);

        Map<AttributesDndEnum, Boolean> savingThrowsProficiency = new HashMap<>();
        savingThrowsProficiency.put(AttributesDndEnum.WISDOM, true);
        savingThrowsProficiency.put(AttributesDndEnum.INTELLIGENCE, true);
        sheetDnD.setSavingThrowsProficiency(savingThrowsProficiency);
        sheetDnD.calculateProficienciesValues();

        sheetRepository.save(sheetDnD);
        user2.addSheets(sheetDnD);

        userRepository.saveAll(Arrays.asList(user1, user2));


    }
}
