package com.stalixo.charsheetspring.config;

import com.stalixo.charsheetspring.domain.User;
import com.stalixo.charsheetspring.domain.enums.SheetsModelsEnum;
import com.stalixo.charsheetspring.domain.sheets.SheetDnD;
import com.stalixo.charsheetspring.dto.response.UserResponseDTO;
import com.stalixo.charsheetspring.repositories.SheetRepository;
import com.stalixo.charsheetspring.repositories.UserRepository;
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

    @Override
    public void run(String... args) throws Exception {

        sheetRepository.deleteAll();
        userRepository.deleteAll();

        User user1 = new User(null, "Lucas G", "lucasg@gmail.com", "12345");
        User user2 = new User(null, "Edvaldo", "edvaldo@gmail.com", "123456789");

        userRepository.saveAll(Arrays.asList(user1, user2));

        SheetDnD sheetDnD = new SheetDnD(new UserResponseDTO(user1), SheetsModelsEnum.DND);
        user2.addSheets(sheetDnD);

        userRepository.saveAll(Arrays.asList(user1, user2));
        sheetRepository.save(sheetDnD);

    }
}
