package com.example.softaala.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


// This class contains all the multiple choice
// answers assigned to the questions class
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
public class Answer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    //Vastauksen atribuutit, getterit & setterit

    private long id = 0;
    private String answer;

    public Answer() {
    }

    public Answer(String answer) {
        this.answer = answer;

    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "Answer{" + "id=" + id + ", Answer='" + answer + '\'' + '}';
    }
}
