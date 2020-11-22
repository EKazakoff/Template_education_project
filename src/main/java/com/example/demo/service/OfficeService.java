package com.example.demo.service;

import com.example.demo.view.OfficeView;

public interface OfficeService {

    public OfficeView getById(long id);

    public OfficeView listByFilter(Long id, String name, int phone, boolean isActive);

    public void updateByPost(OfficeView office);

    public OfficeView saveByPost(Long id, String name, String address, int phone, boolean iActive);

}


