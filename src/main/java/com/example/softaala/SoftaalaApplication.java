package com.example.softaala;

import com.example.softaala.domain.Form;
import com.example.softaala.domain.FormRepository;
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
    public CommandLineRunner books(FormRepository formRepository) {
        return (args) -> {

            Form form1 = new Form("Testi kyssäri, oletko supersankari?");
            formRepository.save(form1);
        };

    }
}