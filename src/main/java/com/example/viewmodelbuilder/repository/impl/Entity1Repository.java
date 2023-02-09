package com.example.viewmodelbuilder.repository.impl;

import com.example.viewmodelbuilder.entity.model.Entity1;
import org.springframework.data.repository.CrudRepository;

public interface Entity1Repository extends CrudRepository<Entity1, Integer> {

    Entity1 findById(int id);
}
