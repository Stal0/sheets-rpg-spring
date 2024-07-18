package com.stalixo.charsheetspring.config;

import com.stalixo.charsheetspring.domain.Sheet;
import com.stalixo.charsheetspring.domain.User;
import com.stalixo.charsheetspring.domain.enums.SheetsModels;
import com.stalixo.charsheetspring.domain.blocks.AttributeBlock;
import com.stalixo.charsheetspring.domain.blocks.CharacterInfoBlock;
import com.stalixo.charsheetspring.domain.factories.AttributeFactory;
import com.stalixo.charsheetspring.dto.request.UserRequestDTO;
import com.stalixo.charsheetspring.repositories.SheetRepository;
import com.stalixo.charsheetspring.repositories.UserRepository;
import com.stalixo.charsheetspring.repositories.repositoriesBlocks.AttributeBlockRepository;
import com.stalixo.charsheetspring.repositories.repositoriesBlocks.CharacterInfoBlockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class Instantiation implements CommandLineRunner {

    @Autowired
    private SheetRepository sheetRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private CharacterInfoBlockRepository infoBlockRepository;

    @Autowired
    private AttributeBlockRepository attributeBlockRepository;

    @Override
    public void run(String... args) throws Exception {

        sheetRepository.deleteAll();
        infoBlockRepository.deleteAll();
        userRepository.deleteAll();
        attributeBlockRepository.deleteAll();

        User user1 = new User(null, "Lucas G", "lucasg@gmail.com");
        User user2 = new User(null, "Edvaldo", "edvaldo@gmail.com");

        Sheet sheet1 = new Sheet(null, "Bob, o Anão", new UserRequestDTO(user1), SheetsModels.fromValue("DND"));
        Sheet sheet2 = new Sheet(null, "Carla, a Clériga", new UserRequestDTO(user2), SheetsModels.fromValue("OTHER"));

        System.out.println(sheet1.getSheetsModels().name());

        CharacterInfoBlock infoBlock = new CharacterInfoBlock(null, "Bob Augusto", "Anão", 1.72);
        CharacterInfoBlock infoBlock1 = new CharacterInfoBlock(null, "Carla Maria", "Elfo", 1.52);


        AttributeBlock attribute1 = AttributeFactory.createBlock(sheet1.getId(), sheet1.getSheetsModels());
        AttributeBlock attribute2 = AttributeFactory.createBlock(sheet2.getId(), sheet2.getSheetsModels());

        sheet1.addBlock(infoBlock);
        sheet2.addBlock(infoBlock1);
        sheet1.addBlock(attribute1);
        sheet2.addBlock(attribute2);


        attributeBlockRepository.saveAll(Arrays.asList(attribute1, attribute2));

        userRepository.saveAll(Arrays.asList(user1, user2));

        sheetRepository.saveAll(Arrays.asList(sheet1, sheet2));

        infoBlockRepository.saveAll(Arrays.asList(infoBlock, infoBlock1));
    }
}
