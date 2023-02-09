package com.example.viewmodelbuilder.repository.impl;

import com.example.viewmodelbuilder.entity.model.Entity2;
import com.example.viewmodelbuilder.entity.model.Entity3;
import org.springframework.data.repository.CrudRepository;

public interface Entity3Repository extends CrudRepository<Entity3, Integer> {

    Entity3 findById(int id);
}
