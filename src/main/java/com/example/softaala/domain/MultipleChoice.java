package com.example.softaala.domain;

import javax.persistence.*;
import java.util.List;


// This class returns multiple choice answers
// to the questions and assigns answers to rightful questions
@Entity
public class MultipleChoice {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long choiceid;
    private String optiona;
    private String optionb;
    private String optionc;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "multiplechoice")
    private List<Questions> questions;

    public MultipleChoice(){}

    public MultipleChoice(String optiona, String optionb, String optionc)   {
        super();
        this.optiona = optiona;
        this.optionb = optionb;
        this.optionc = optionc;
    }

    public String getOptiona() {
        return optiona;
    }

    public void setOptiona(String optiona) {
        this.optiona = optiona;
    }

    public String getOptionb() {
        return optionb;
    }

    public void setOptionb(String optionb) {
        this.optionb = optionb;
    }

    public String getOptionc() {
        return optionc;
    }

    public void setOptionc(String optionc) {
        this.optionc = optionc;
    }

    @Override
    public String toString() {
        return "MultipleChoice{" +
                "optiona='" + optiona + '\'' +
                ", optionb='" + optionb + '\'' +
                ", optionc='" + optionc + '\'' +
                '}';
    }
}
