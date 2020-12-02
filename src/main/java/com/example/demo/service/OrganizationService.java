package com.example.demo.service;

import com.example.demo.view.OfficeView;
import com.example.demo.view.OrganizationView;

public interface OrganizationService {

    public OrganizationView getById(long id);

    public void updateByPost(OrganizationView organizationView);

    public void saveByPost(OrganizationView organizationView);

    java.util.List<com.example.demo.view.OrganizationFilterView> listOrganization(com.example.demo.view.OrganizationFilterView organizationFilterView);
}
