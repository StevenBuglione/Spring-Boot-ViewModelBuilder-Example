package com.example.viewmodelbuilder.service.impl;

import com.example.viewmodelbuilder.service.base.FormSheetViewModelService;
import com.example.viewmodelbuilder.service.base.SectionService;
import com.example.viewmodelbuilder.service.viewmodel.form.FormSheetViewModel;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@RequiredArgsConstructor
@Service
public class FormSheetViewModelServiceImpl implements FormSheetViewModelService {

    private final SectionService section1;
    private final SectionService section2;


    public FormSheetViewModel getFormSheetViewModel(int id) {
        FormSheetViewModel viewModel = new FormSheetViewModel();
        viewModel.addSection(section1.getSection());
        viewModel.addSection(section2.getSection());
        return viewModel;
    }
}
