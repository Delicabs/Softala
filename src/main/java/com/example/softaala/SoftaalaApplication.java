package com.example.softaala;
import com.example.softaala.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SoftaalaApplication {
    @Autowired
    private ValueRepository valueRepository;

    @Autowired
    private QuestionRepository questionRepository;

    @Autowired
    private AnswersRepository answersRepository;

    public static void main(String[] args) {
        SpringApplication.run(SoftaalaApplication.class, args);
    }

    @Bean
    public CommandLineRunner runner() {
        return (args) -> {
            Question question1 = new Question("Missä koulutusohjelmassa opiskelet?");
            questionRepository.save(question1);
            Question question2 = new Question("Missä profiilissa opiskelet/ aiot opiskelle?");
            questionRepository.save(question2);
            Question question3 = new Question("Oletko onnistunut verkostoitumaan koulussa? Esimerkiksi onko sinulla kaveriporukka, jonka kanssa ratkotte opiskeluun liittyviä pulmia");
            questionRepository.save(question3);
            Question question4 = new Question(" Oletko verkostoitunut koulun ulkopuolella IT-alan ihmisten kanssa?");
            questionRepository.save(question4);
            Question question5 = new Question("Koetko, että sukupuoli vaikuttaa opiskeluun tietojenkäsittelyn koulutusohjelmassa?");
            questionRepository.save(question5);
            Question question6 = new Question(" Työskenteletkö jo IT-alalla?");
            questionRepository.save(question6);
            Question question7 = new Question("Millaisena koet tulevaisuutesi naisena IT-alalla?");
            questionRepository.save(question7);

            Answer answer1 = new Answer("Demo",question1);
            answersRepository.save(answer1);
            Answer answer2 = new Answer("Test",question1);
            answersRepository.save(answer2);

            valueRepository.save(new Value( question1,"Radio", "Tietojenkäsittelyn päivätoteutus", "Tietojenkäsittelyn monimuoto","Avoin AMK (tietojenkäsittely)",null));
            valueRepository.save(new Value( question2,"Checkbox", "Ohjelmistotuotanto", "Digitaaliset palvelut", "ICT ja liiketoiminta","ICT infrastruktuurit"));
            valueRepository.save(new Value( question3, "Radio","Kyllä","En", null, null));
            valueRepository.save(new Value( question4, "Radio","Kyllä","En", null,null));
            valueRepository.save(new Value( question5,"Radio", "Kyllä","En",null, null));
            valueRepository.save(new Value( question6,"Radio", "Kyllä","En",null, null));
            valueRepository.save(new Value( question7,null,null,null,null,null));
        };
    }
}

