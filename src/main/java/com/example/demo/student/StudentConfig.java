package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args ->{
           Student beril = new Student(
                    "Beril",
                    "berilevliyaoglu@gmail.com",
                    LocalDate.of(2000, Month.OCTOBER, 30),
                   22
            );
            Student toprak = new Student(
                    "Toprak",
                    "toprakbulut@gmail.com",
                    LocalDate.of(2000, Month.OCTOBER, 13),
                    22
            );

            repository.saveAll(List.of(beril, toprak));

        };
    }
}
