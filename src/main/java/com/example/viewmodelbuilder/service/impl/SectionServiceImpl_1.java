package com.example.viewmodelbuilder.service.impl;

import com.example.viewmodelbuilder.entity.model.Entity1;
import com.example.viewmodelbuilder.repository.impl.Entity1Repository;
import com.example.viewmodelbuilder.repository.impl.Entity2Repository;
import com.example.viewmodelbuilder.service.base.SectionService;
import com.example.viewmodelbuilder.service.viewmodel.section.base.Section;
import com.example.viewmodelbuilder.service.viewmodel.section.impl.Section_1;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service("section1")
public class SectionServiceImpl_1 implements SectionService {

    private final Entity1Repository repo1;

    @Override
    public Section getSection() {
        Section_1 section1 = new Section_1();
        section1.setString_1(repo1.findById(1).getString1());
        return section1;
    }
}
