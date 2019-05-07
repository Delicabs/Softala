package com.example.softaala.domain;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface QuestionRepository extends CrudRepository<Question, Long> {

 Question findByQuestionid(Long questionid);
}
