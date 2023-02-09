package com.example.viewmodelbuilder.service.viewmodel.form;

import com.example.viewmodelbuilder.service.viewmodel.section.base.Section;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;


@Setter
@Getter
public class FormSheetViewModel {
    private ArrayList<Section> formViewModel;
    public FormSheetViewModel(){
        this.formViewModel = new ArrayList<>();
    }
    public void addSection(Section section){
        this.formViewModel.add(section);
    }
}
