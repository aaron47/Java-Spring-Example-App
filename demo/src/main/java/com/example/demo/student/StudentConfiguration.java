package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfiguration {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student james = new Student(
                    "James Bond",
                    LocalDate.of(1991, Month.JANUARY, 5),
                    "james@gmail.com"
            );

            Student maria = new Student(
                    "Maria Jones",
                    LocalDate.of(2001, Month.JANUARY, 5),
                    "maria@gmail.com"
            );

            studentRepository.saveAll(
                    List.of(james, maria)
            );
        };
    }
}
