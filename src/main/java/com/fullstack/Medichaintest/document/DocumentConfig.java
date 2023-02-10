package com.fullstack.Medichaintest.document;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
@Configuration
public class DocumentConfig {
    @Bean
    CommandLineRunner commandLineRunner(DocumentRepository repository) {
        return args -> {
            Document Timmy = new Document(123L,
                    "H33h44h4bbe",
                    "2023-12-3",
                    "This is a description");

            Document Brit = new Document(4555L,
                    "H33h44h4bbe",
                    "2022-2-5",
                    "This is a example desc");

            repository.saveAll(
                    List.of(Timmy,Brit)
            );
        };
    }
}


//List.of(
//        new Document(12345L,"3e3d34rff34f3f", LocalDate.of(2000, Month.APRIL,5), "this is the description ")

