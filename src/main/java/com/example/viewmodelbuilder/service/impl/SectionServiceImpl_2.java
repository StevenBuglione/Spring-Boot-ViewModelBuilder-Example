package com.example.viewmodelbuilder.service.impl;

import com.example.viewmodelbuilder.entity.model.Entity1;
import com.example.viewmodelbuilder.entity.model.Entity2;
import com.example.viewmodelbuilder.repository.impl.Entity1Repository;
import com.example.viewmodelbuilder.repository.impl.Entity2Repository;
import com.example.viewmodelbuilder.service.base.SectionService;
import com.example.viewmodelbuilder.service.viewmodel.section.base.Section;
import com.example.viewmodelbuilder.service.viewmodel.section.impl.Section_2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("section2")
public class SectionServiceImpl_2 implements SectionService {

    private Entity1Repository repo1;
    private Entity2Repository repo2;

    @Autowired
    public SectionServiceImpl_2(Entity1Repository _repo1, Entity2Repository _repo2){
        repo1 = _repo1;
        repo2 = _repo2;
    }

    @Override
    public Section getSection() {
        Section_2 section2 = new Section_2();
        section2.setString_1(repo1.findById(1).getString1());
        section2.setInt_2(repo2.findById(2).getInt_2());
        section2.setString_2(repo2.findById(2).getString2());
        return section2;
    }
}
