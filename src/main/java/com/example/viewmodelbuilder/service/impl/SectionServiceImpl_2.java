package com.example.viewmodelbuilder.service.impl;

import com.example.viewmodelbuilder.entity.model.Entity1;
import com.example.viewmodelbuilder.entity.model.Entity2;
import com.example.viewmodelbuilder.repository.impl.Entity1Repository;
import com.example.viewmodelbuilder.repository.impl.Entity2Repository;
import com.example.viewmodelbuilder.service.base.SectionService;
import com.example.viewmodelbuilder.service.viewmodel.section.base.Section;
import com.example.viewmodelbuilder.service.viewmodel.section.impl.Section_2;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service("section2")
public class SectionServiceImpl_2 implements SectionService {

    private final Entity1Repository repo1;
    private final Entity2Repository repo2;

    @Override
    public Section getSection() {
        Section_2 section2 = new Section_2();
        section2.setString_1(repo1.findById(1).getString1());
        section2.setInt_2(repo2.findById(2).getInt_2());
        String testStringValue2 = repo2.findById(2).getString2();
        section2.setString_2(updateStringValue(testStringValue2));
        return section2;
    }

    private String updateStringValue(String st){
        st = "Updated String";
        return st;
    }
}
