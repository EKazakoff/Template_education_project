package com.example.demo.service;

import com.example.demo.view.OfficeFilterView;
import com.example.demo.view.OfficeView;
import com.example.demo.view.OfficeViewFilterOut;

import javax.validation.Valid;
import java.util.List;

public interface OfficeService {

    public OfficeView getById(long id);

    public void updateByPost(OfficeView office);

    void saveOffice(OfficeView office);

    List<OfficeViewFilterOut> listOffice(@Valid OfficeFilterView office);
}


