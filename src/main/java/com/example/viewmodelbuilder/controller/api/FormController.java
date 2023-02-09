package com.example.viewmodelbuilder.controller.api;


import com.example.viewmodelbuilder.service.base.FormSheetViewModelService;
import com.example.viewmodelbuilder.service.viewmodel.form.FormSheetViewModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FormController {

    private FormSheetViewModelService formSheetViewModelService;

    @Autowired
    public FormController(FormSheetViewModelService _formSheetViewModelService){
        formSheetViewModelService = _formSheetViewModelService;
    }

    //Method For Getting View Model
    @GetMapping("/formSheetViewModel/{id}")
    public FormSheetViewModel getFormSheetViewModel(@PathVariable("id") int id){
        return formSheetViewModelService.getFormSheetViewModel(id);
    }
}
