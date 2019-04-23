package com.example.softaala;

import com.example.softaala.domain.Question;
import com.example.softaala.domain.QuestionsRepository;
import com.example.softaala.domain.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

//testi_homma2
//testi_homma
// Testi Niilolle --
//testi niilo
//testi testi testi tämä on testi terveisin Erkki
//Testi Jontte 1 2 3
//Testees
//asdkhaghdfjasdhngfkö
// Testi et Daniel näkee
//asdasd

@SpringBootApplication
public class SoftaalaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SoftaalaApplication.class, args);

    }

    @Bean
    public CommandLineRunner questions(QuestionsRepository questionsRepository) {
        return (args) -> {

          // Form form1 = new Form("Testi kyssäri, oletko supersankari?");
           //formRepository.save(form1);

            // These are the repositories for multiple choice options in answers assigned to questions
            // Also for testing, this may not be the final solution, changes may apply etc.
            // As the project matures, remove gibberish and replace with actual options

       List<Value> values = new ArrayList<>();
       Value value1 = new Value("vaihtoehto 1");
            Value value2 = new Value("vaihtoehto 2");
            Value value3 = new Value("vaihtoehto 666");
            values.add(value1);
            values.add(value2);
            values.add(value3);

            // Example questions for testing and displaying in heroku
            Question question1 = new Question("Missä koulutusohjelmassa opiskelet?","Radio", values);
           // Question question2 = new Question("Missä profiilissa opiskelet / aiot opiskella? ");
         //   Question question3 = new Question("Oletko onnistunut verkostoitumaan koulussa? Esimerkiksi onko sinulla kaveriporukka, jonka kanssa ratkotte opiskeluun liittyviä pulmia?",);

            questionsRepository.save(question1);
           // questionsRepository.save(question2);
         //   questionsRepository.save(question3);




        };

    }

}

