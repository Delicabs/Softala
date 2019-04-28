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



            Question question1 = new Question("Missä koulutusohjelmassa opiskelet?");
            questionRepository.save(question1);
            Question question2 = new Question("Missä profiilissa opiskelet opiskelet?");
            questionRepository.save(question2);
            Question question3 = new Question("Oletko onnistunut verkostoitumaan koulussa? Esimerkiksi onko sinulla kaveriporukka, jonka kanssa ratkotte opiskeluun liittyviä pulmia");
            questionRepository.save(question3);
            Question question4 = new Question(" Oletko verkostoitunut koulun ulkopuolella IT-alan ihmisten kanssa?");
            questionRepository.save(question4);
            Question question5 = new Question(" Työskenteletkö jo IT-alalla?");
            questionRepository.save(question5);



            //Question question2 = new Question("")



            valueRepository.save(new Value( question1,"radio", "tieto"));
            valueRepository.save(new Value( question2,"check box", "tieto"));
            valueRepository.save(new Value( question3, null,null));
            valueRepository.save(new Value( question4, null,null));
            valueRepository.save(new Value( question5, null,null));




            //valueRepository.save(new Value("Olenko homo", "olenko lesbo", "olenko astronautti", question1));
          //  questionRepository.save(question1);




            /*Question question1 = new Question("onko sulla iso","perse");
            questionRepository.save(question1); */



            // Example questions for testing and displaying in heroku

             //valueRepository.save(new Value("paaska", "vittu", "perse", null));
           // Question question2 = new Question("Missä profiilissa opiskelet / aiot opiskella? ");
         //   Question question3 = new Question("Oletko onnistunut verkostoitumaan koulussa? Esimerkiksi onko sinulla kaveriporukka, jonka kanssa ratkotte opiskeluun liittyviä pulmia?",);


           // questionRepository.save(question2);
         //   questionRepository.save(question3);




        };

    }

}

