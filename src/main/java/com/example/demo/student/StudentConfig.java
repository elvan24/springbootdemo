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
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student elvan = new Student(
                    "Elvan",
                    "thomaselvanli224@gmail.com",
                    LocalDate.of(2004, Month.MAY, 25),
                    20
            );

            Student ateng = new Student(
                    "Ateng",
                    "ateng14@gmail.com",
                    LocalDate.of(2024, Month.FEBRUARY, 27),
                    1
            );

            repository.saveAll(
                    List.of(elvan, ateng)
            );
        };
    }
}
