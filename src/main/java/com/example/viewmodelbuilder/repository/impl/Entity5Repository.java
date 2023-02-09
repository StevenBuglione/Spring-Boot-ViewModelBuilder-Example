package com.example.viewmodelbuilder.repository.impl;

import com.example.viewmodelbuilder.entity.model.Entity2;
import com.example.viewmodelbuilder.entity.model.Entity5;
import org.springframework.data.repository.CrudRepository;

public interface Entity5Repository extends CrudRepository<Entity5, Integer> {
    Entity5 findById(int id);
}
