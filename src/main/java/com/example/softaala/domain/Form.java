package com.example.softaala.domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Form {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    //Formin atribuutit, setterit & getterit


    private long id;
    private String Question;

    public Form(){
    }
    public Form(String question) {
        Question = question;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {

        this.id = id;
    }

    public String getQuestion() {
        return Question;
    }

    public void setQuestion(String question) {
        Question = question;
    }

    @Override
    public String toString() {
        return "Form{" + "id=" + id + ", Question='" + Question + '\'' + '}';
    }
}
