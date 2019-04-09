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
//asdkhaghdfjasdhngfkö
// Testi et Daniel näkee


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

            Questions question1 = new Questions("Missä koulutusohjelmassa opiskelet?",null, null);
            Questions question2 = new Questions("Missä profiilissa opiskelet / aiot opiskella?", null,null);
            Questions question3 = new Questions("Oletko onnistunut verkostoitumaan koulussa? Esimerkiksi onko sinulla kaveriporukka, jonka kanssa ratkotte opiskeluun liittyviä pulmia?",null, null);
            Questions question4 = new Questions("Oletko verkostoitunut koulun ulkopuolella IT-alan ihmisten kanssa?", null,null);
            Questions question5 = new Questions("Työskenteletkö jo IT-alalla?", null,null);
            questionsRepository.save(question1);
            questionsRepository.save(question2);
            questionsRepository.save(question3);
            questionsRepository.save(question4);
            questionsRepository.save(question5);



        };

    }
}

