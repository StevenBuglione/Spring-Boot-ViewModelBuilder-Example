package com.example.viewmodelbuilder.service.impl;

import com.example.viewmodelbuilder.service.base.FormSheetViewModelService;
import com.example.viewmodelbuilder.service.base.SectionService;
import com.example.viewmodelbuilder.service.viewmodel.form.FormSheetViewModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class FormSheetViewModelServiceImpl implements FormSheetViewModelService {

    private SectionService _section1;
    private SectionService _section2;


    @Autowired
    public FormSheetViewModelServiceImpl(SectionService section1, SectionService section2){
        _section1 = section1;
        _section2 = section2;
    }

    public FormSheetViewModel getFormSheetViewModel(int id) {
        FormSheetViewModel viewModel = new FormSheetViewModel();
        viewModel.addSection(_section1.getSection());
        viewModel.addSection(_section2.getSection());
        return viewModel;
    }
}
