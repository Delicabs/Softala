package com.example.softaala.domain;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;

import java.util.List;


public interface FormRepository extends CrudRepository<Form, Long> {
    List<Form> findById(@Param("Form")String question);

}
