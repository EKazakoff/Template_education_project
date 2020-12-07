package com.example.demo.service;

import com.example.demo.view.OrganizationFilterView;
import com.example.demo.view.OrganizationView;

import java.util.List;

public interface OrganizationService {

    public OrganizationView getById(long id);

    public void updateByPost(OrganizationView organizationView) throws Exception;

    public void saveByPost(OrganizationView organizationView);

    List<OrganizationFilterView> listOrganization(OrganizationFilterView organizationFilterView);
}
