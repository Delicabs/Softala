package com.example.softaala.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;


// This class contains all the multiple choice
// answers assigned to the questions class
//@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})

public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long answerid;
    private String answer;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "questionid")
    @JsonIgnore
    private Question question;

    public Answer() {
    }

    public Answer(String answer) {
        this.answer = answer;
    }
    public Answer(String answer, Question question) {
        this.answer = answer;
        this.question = question;
    }

    public long getId() {
        return answerid;
    }

    public void setId(long id) {
        this.answerid = answerid;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public long getAnswerid() {
        return answerid;
    }

    public void setAnswerid(long answerid) {
        this.answerid = answerid;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    @Override
    public String toString() {
        return "Answer{" +
                "answerid=" + answerid +
                ", answer='" + answer + '\'' +
                ", question=" + question +
                '}';
    }
}
