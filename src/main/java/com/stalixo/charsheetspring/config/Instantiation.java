package com.stalixo.charsheetspring.config;

import com.stalixo.charsheetspring.domain.Sheet;
import com.stalixo.charsheetspring.domain.subBlocks.CharacterInfoBlock;
import com.stalixo.charsheetspring.repositories.SheetRepository;
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
    private CharacterInfoBlockRepository infoBlockRepository;

    @Override
    public void run(String... args) throws Exception {

        sheetRepository.deleteAll();
        infoBlockRepository.deleteAll();

        Sheet sheet1 = new Sheet(null, "Bob, o Anão");
        Sheet sheet2 = new Sheet(null, "Carla, a Clériga");

        sheetRepository.saveAll(Arrays.asList(sheet1, sheet2));

        CharacterInfoBlock infoBlock = new CharacterInfoBlock(null, "Bob Augusto", "M", )

    }
}
