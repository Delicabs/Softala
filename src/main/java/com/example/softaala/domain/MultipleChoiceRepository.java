package com.example.softaala.domain;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MultipleChoiceRepository extends CrudRepository<MultipleChoice, Long> {
    List<MultipleChoice> findById(long choiceid);
}
