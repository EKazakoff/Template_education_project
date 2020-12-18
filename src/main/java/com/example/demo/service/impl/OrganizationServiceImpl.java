package com.example.demo.service.impl;

import com.example.demo.model.Organization;
import com.example.demo.model.mapper.MapperFacade;
import com.example.demo.dao.organization.OrganizationDao;
import com.example.demo.view.organization.OrganizationFilterView;
import com.example.demo.view.organization.OrganizationView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

/**
 * {@inheritDoc}
 */
@Service
public class OrganizationServiceImpl implements com.example.demo.service.OrganizationService {
    private final OrganizationDao dao;
    private final MapperFacade mapperFacade;

    /**
     * {@inheritDoc}
     *
     * @param dao          the dao
     * @param mapperFacade the mapper facade
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
    public void updateByPost(OrganizationView organizationView) throws Exception {
        Organization organization = mapperFacade.map(organizationView, Organization.class);
        dao.updatePost(organization);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @Transactional
    public void saveByPost(OrganizationView organizationView) {
        Organization organization = mapperFacade.map(organizationView, Organization.class);
        dao.save(organization);
    }

    @Override
    public List<OrganizationFilterView> listOrganization(OrganizationFilterView organizationFilterView) {
        List<OrganizationFilterView> resultList = new ArrayList<>();
        List<Organization> orgList = dao.loadByFilter(organizationFilterView);
        for (int i = 0; i < orgList.size(); i++) {
            resultList.add(getOrganizationView(orgList.get(i)));
        }
        return resultList;
    }

    private OrganizationFilterView getOrganizationView(Organization organization) {
        OrganizationFilterView organizationView = mapperFacade.map(organization, OrganizationFilterView.class);
        return organizationView;
    }
}


