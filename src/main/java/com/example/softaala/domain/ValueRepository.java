package com.example.softaala.domain;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ValueRepository extends CrudRepository<Value, Long> {
    List<Value> findById(@Param("value")String value);
}
