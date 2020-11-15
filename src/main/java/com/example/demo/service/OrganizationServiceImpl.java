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
}


