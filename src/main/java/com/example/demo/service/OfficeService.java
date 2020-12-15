package com.example.demo.service;

import com.example.demo.view.office.OfficeFilterView;
import com.example.demo.view.office.OfficeView;
import com.example.demo.view.office.OfficeViewFilterOut;
import com.example.demo.view.office.OfficeViewOut;

import javax.validation.Valid;
import java.util.List;

public interface OfficeService {

    public OfficeViewOut getById(long id);

    public void updateByPost(OfficeView office);

    void saveOffice(OfficeView office);

    List<OfficeViewFilterOut> listOffice(@Valid OfficeFilterView office);
}


