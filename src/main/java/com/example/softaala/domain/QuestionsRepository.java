package com.example.softaala.domain;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface QuestionsRepository extends CrudRepository<Question, Long> {
    List<Question> findById(@Param("question")String question);


}
