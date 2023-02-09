package com.example.viewmodelbuilder.repository.impl;

import com.example.viewmodelbuilder.entity.model.Entity2;
import com.example.viewmodelbuilder.entity.model.Entity3;
import com.example.viewmodelbuilder.entity.model.Entity4;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.repository.CrudRepository;

public interface Entity4Repository extends CrudRepository<Entity4, Integer> {
    Entity4 findById(int id);
}
