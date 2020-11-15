package com.example.demo.service;

import com.example.demo.dao.office.OfficeDao;
import com.example.demo.model.mapper.MapperFacade;
import com.example.demo.view.OfficeView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * {@inheritDoc}
 */
@Service
public class OfficeServiceImpl implements OfficeService {
    private final OfficeDao dao;
    private final MapperFacade mapperFacade;

    /**
     * {@inheritDoc}
     */
    @Autowired
    public OfficeServiceImpl(OfficeDao dao, MapperFacade mapperFacade) {
        this.dao = dao;
        this.mapperFacade = mapperFacade;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @Transactional
    public OfficeView getById(long id) {

        return mapperFacade.map(dao.loadById(id), OfficeView.class);
    }
}
