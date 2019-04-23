package com.example.softaala.domain;

import javax.persistence.*;
import java.util.List;


// This class contains all the questions and
// answers multiple choice answers assigned to the answer class
@Entity
public class Question {
    //Kysymysten atribuutit, setterit & getterit

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String question;
    private String type;
    private List<Value> values;


    @OneToMany(cascade = CascadeType.ALL, mappedBy = "answer")
    private List<Answer> answers;
    public Question(){

    }

    public Question(String question,String type, List<Value> values){
        this.question = question;
        this.type = type;
        this.values = values;

    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Value> getValues() {
        return values;
    }

    public void setValues(List<Value> values) {
        this.values = values;
    }

    @Override
    public String toString() {
        return "Question{" + "id=" + id + ", question='" + question + '\'' + ", type='" + type + '\'' + ", values=" + values + '}';
    }
}
