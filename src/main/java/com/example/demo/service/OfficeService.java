package com.example.demo.service;

import com.example.demo.view.OfficeView;

import java.util.List;

public interface OfficeService {

    public OfficeView getById(long id);

    public OfficeView listByFilter(Long id, String name, int phone, boolean isActive);

    public void updateByPost(OfficeView office);

    public OfficeView saveByPost(Long id, String name, String address, int phone, boolean iActive);

    void deleteById(Long id);

    void saveOffice(OfficeView office);

    List<OfficeView> listOffice(OfficeView office);
}


