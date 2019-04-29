package com.example.softaala.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;


// This class contains all the questions and
// answers multiple choice answers assigned to the answer class
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long questionid;
    private String question;
   // private String type;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "question")
   // @JoinColumn(name = "id")
    @JsonIgnore
    private Value value;

    @OneToMany(fetch = FetchType.LAZY,
            cascade =  CascadeType.ALL,
            mappedBy = "question")
    private List<Answer> answers;



    public Question(){

    }

    public Question(String question){
        super();
        this.question = question;
      //  this.type = type;



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

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }
}
