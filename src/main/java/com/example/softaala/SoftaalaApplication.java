package com.example.softaala;

import com.example.softaala.domain.FormRepository;
import com.example.softaala.domain.Questions;
import com.example.softaala.domain.QuestionsRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

//testi_homma2
//testi_homma
// Testi Niilolle --
//testi niilo
//testi testi testi tämä on testi terveisin Erkki
//Testi Jontte 1 2 3
//Testees


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

            Questions question1 = new Questions("Tämä on kysymys 1","Oletko koskaan juonut kaljaa?", "");
            Questions question2 = new Questions("tämä on kysymys 2", "Hei oletko sinä syönyt pizzaa?","Oletko vegaani");
            questionsRepository.save(question1);
            questionsRepository.save(question2);

        };

    }
}

