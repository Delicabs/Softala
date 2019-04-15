package com.example.softaala;

import com.example.softaala.domain.MultipleChoice;
import com.example.softaala.domain.MultipleChoiceRepository;
import com.example.softaala.domain.Questions;
import com.example.softaala.domain.QuestionsRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


//hieman kommentointia -nile
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
    public CommandLineRunner questions(QuestionsRepository questionsRepository, MultipleChoiceRepository mrepo) {
        return (args) -> {

          // Form form1 = new Form("Testi kyssäri, oletko supersankari?");
           //formRepository.save(form1);

            //Monivalintakyssärit
            MultipleChoice mchoice1 = new MultipleChoice("asd","asdd","asdd");
            MultipleChoice mchoice2 = new MultipleChoice("a","aasdfdf","dsads");
            mrepo.save(mchoice1);
            mrepo.save(mchoice2);

            //Kysymysvaihtoehdot id:n mukaisesti
            Questions question1 = new Questions("Missä koulutusohjelmassa opiskelet?",mchoice1);
            Questions question2 = new Questions("Missä profiilissa opiskelet / aiot opiskella?", mchoice2);
            Questions question3 = new Questions("Oletko onnistunut verkostoitumaan koulussa? Esimerkiksi onko sinulla kaveriporukka, jonka kanssa ratkotte opiskeluun liittyviä pulmia?",null);
            Questions question4 = new Questions("Oletko verkostoitunut koulun ulkopuolella IT-alan ihmisten kanssa?", null);
            Questions question5 = new Questions("Työskenteletkö jo IT-alalla?", null);
            questionsRepository.save(question1);
            questionsRepository.save(question2);
            questionsRepository.save(question3);
            questionsRepository.save(question4);
            questionsRepository.save(question5);



        };

    }
}

