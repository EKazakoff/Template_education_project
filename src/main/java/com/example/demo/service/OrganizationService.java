package com.example.demo.service;

import com.example.demo.view.OfficeView;
import com.example.demo.view.OrganizationView;

public interface OrganizationService {

    public OrganizationView getById(long id);

    public OrganizationView listByFilter(String name, int inn, boolean isActive);

    public OrganizationView updateByPost(Long id, String name, String fullOrgName, int inn, int kpp, String address, int phone, boolean iActive);

    public OrganizationView saveByPost(String name, String fullOrgName, int inn, int kpp, String address, int phone, boolean iActive);

}

