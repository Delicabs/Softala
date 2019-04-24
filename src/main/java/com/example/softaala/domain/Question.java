package com.example.softaala.domain;

import javax.persistence.*;
import java.util.List;


// This class contains all the questions and
// answers multiple choice answers assigned to the answer class
@Entity
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long questionid;
    private String question;
    private String type;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "question")
   // @JoinColumn(name = "id")
    private List<Value> values;


    public Question(){

    }

    public Question(String question,String type){
        super();
        this.question = question;
        this.type = type;



    }

    public long getQuestionid() {
        return questionid;
    }

    public void setQuestionid(long questionid) {
        this.questionid = questionid;
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
}
