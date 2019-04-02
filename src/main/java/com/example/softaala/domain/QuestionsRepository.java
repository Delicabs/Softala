package com.example.softaala.domain;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface QuestionsRepository extends CrudRepository<Questions, Long> {
    List<Questions> findById(@Param("question")String question);


}
