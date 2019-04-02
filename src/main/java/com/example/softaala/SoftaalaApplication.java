package com.example.softaala;

import com.example.softaala.domain.FormRepository;
import com.example.softaala.domain.Questions;
import com.example.softaala.domain.QuestionsRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SoftaalaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SoftaalaApplication.class, args);
    }

    @Bean
    public CommandLineRunner books(FormRepository formRepository, QuestionsRepository questionsRepository) {
        return (args) -> {

          // Form form1 = new Form("Testi kyssäri, oletko supersankari?");
           //formRepository.save(form1);

            Questions question1 = new Questions("Tämä on kysymys 1");
            Questions question2 = new Questions("tämä on kysymys 2");
            questionsRepository.save(question1);
            questionsRepository.save(question2);

        };

    }
}

