package com.example.softaala;

import com.example.softaala.domain.Question;
import com.example.softaala.domain.QuestionRepository;
import com.example.softaala.domain.Value;
import com.example.softaala.domain.ValueRepository;
import org.springframework.beans.factory.annotation.Autowired;
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
//asdasd

@SpringBootApplication
public class SoftaalaApplication {
    @Autowired
    private ValueRepository valueRepository;

    @Autowired
    private QuestionRepository questionRepository;





    public static void main(String[] args) {
        SpringApplication.run(SoftaalaApplication.class, args);

    }

    @Bean
    public CommandLineRunner runner() {
        return (args) -> {

          // Form form1 = new Form("Testi kyssäri, oletko supersankari?");
           //formRepository.save(form1);

            // These are the repositories for multiple choice options in answers assigned to questions
            // Also for testing, this may not be the final solution, changes may apply etc.
            // As the project matures, remove gibberish and replace with actual options


      //Value value1 = new Value("vaihtoehto 1","oletko homo","oletko perseen reikä");


            Value value1 = new Value("paskaa","paskaaaaa","paskaa");
           valueRepository.save(value1);

            /*List<Value> values = new ArrayList<>();
            values.add(value1); */


            Question question1 = new Question("paskaa", "persettä");
            questionRepository.save(question1);


            // Example questions for testing and displaying in heroku

             //valueRepository.save(new Value("paaska", "vittu", "perse", null));
           // Question question2 = new Question("Missä profiilissa opiskelet / aiot opiskella? ");
         //   Question question3 = new Question("Oletko onnistunut verkostoitumaan koulussa? Esimerkiksi onko sinulla kaveriporukka, jonka kanssa ratkotte opiskeluun liittyviä pulmia?",);


           // questionRepository.save(question2);
         //   questionRepository.save(question3);




        };

    }

}

