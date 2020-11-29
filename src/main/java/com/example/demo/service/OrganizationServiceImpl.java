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
    public OrganizationView listByFilter(String name, int inn, boolean isActive) {
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @Transactional
    public OrganizationView updateByPost(Long id, String name, String fullOrgName, int inn, int kpp, String address, int phone, boolean iActive) {
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @Transactional
    public OrganizationView saveByPost(String name, String fullOrgName, int inn, int kpp, String address, int phone, boolean iActive) {
        return null;
    }
}


