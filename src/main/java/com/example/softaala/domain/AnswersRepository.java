package com.example.softaala.domain;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AnswersRepository extends CrudRepository<Form, Long> {
    List<Form> findById(@Param("Answers")String answers);

}