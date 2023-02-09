package com.example.viewmodelbuilder.repository.impl;

import com.example.viewmodelbuilder.entity.model.Entity2;
import org.springframework.data.repository.CrudRepository;

public interface Entity2Repository extends CrudRepository<Entity2, Integer> {
    Entity2 findById(int id);
}
