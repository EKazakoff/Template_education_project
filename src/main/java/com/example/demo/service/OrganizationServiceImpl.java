package com.example.demo.service;

import com.example.demo.model.mapper.MapperFacade;
import com.example.demo.dao.organization.OrganizationDao;
import com.example.demo.view.OrganizationView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * {@inheritDoc}
 */
@Service
public class OrganizationServiceImpl implements OrganizationService {
    private final OrganizationDao dao;
    private final MapperFacade mapperFacade;

    /**
     * {@inheritDoc}
     */
    @Autowired
    public OrganizationServiceImpl(OrganizationDao dao, MapperFacade mapperFacade) {
        this.dao = dao;
        this.mapperFacade = mapperFacade;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @Transactional
    public OrganizationView getById(long id) {
        return mapperFacade.map(dao.loadById(id), OrganizationView.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @Transactional
    public void updateByPost(OrganizationView organizationView) {
        com.example.demo.model.Organization organization = mapperFacade.map(organizationView, com.example.demo.model.Organization.class);
        dao.update(organization);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @Transactional
    public void saveByPost(OrganizationView organizationView) {
        com.example.demo.model.Organization organization = mapperFacade.map(organizationView, com.example.demo.model.Organization.class);
        dao.save(organization);
    }

    @Override
    public java.util.List<com.example.demo.view.OrganizationFilterView> listOrganization(com.example.demo.view.OrganizationFilterView organizationFilterView) {
        java.util.List<com.example.demo.view.OrganizationFilterView> resultList = new java.util.ArrayList<>();
        java.util.List<com.example.demo.model.Organization> orgList = dao.loadByFilter(organizationFilterView);
        for (int i = 0; i < orgList.size(); i++) {
            resultList.add(getOrganizationView(orgList.get(i)));
        }
        return resultList;
    }

    private com.example.demo.view.OrganizationFilterView getOrganizationView(com.example.demo.model.Organization organization) {
        com.example.demo.view.OrganizationFilterView organizationView = mapperFacade.map(organization, com.example.demo.view.OrganizationFilterView.class);
        //organizationView.setOrganizationView(mapperFacade.map(organization.getOrganization(), OrganizationView.class));
        return organizationView;
    }
}


