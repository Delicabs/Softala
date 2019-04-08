package com.example.softaala.domain;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AnswersRepository extends CrudRepository<Answer, Long> {
    List<Answer> findById(@Param("Answer")String answers);

}