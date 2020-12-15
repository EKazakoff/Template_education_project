package com.example.demo.service.impl;

import com.example.demo.dao.office.OfficeDao;
import com.example.demo.model.Office;
import com.example.demo.model.mapper.MapperFacade;
import com.example.demo.view.office.OfficeFilterView;
import com.example.demo.view.office.OfficeView;
import com.example.demo.view.office.OfficeViewFilterOut;
import com.example.demo.view.office.OfficeViewOut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

/**
 * {@inheritDoc}
 */
@Service
public class OfficeServiceImpl implements com.example.demo.service.OfficeService {
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
     * @return
     */
    @Override
    @Transactional
    public OfficeViewOut getById(long id) {
        return getOfficeView(dao.loadById(id));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @Transactional
    public void updateByPost(OfficeView office) {
        dao.update(office);
    }


    @Override
    @Transactional
    public void saveOffice(OfficeView office) {
        dao.save(office);
    }

    @Override
    @Transactional
    public List<OfficeViewFilterOut> listOffice(@Valid OfficeFilterView office) {
        List<OfficeViewFilterOut> resultList = new ArrayList<>();
        List<Office> offices = dao.list(office);
        for (int i = 0; i < offices.size(); i++) {
            resultList.add(getOfficeFilterView(offices.get(i)));
        }
        return resultList;
    }

    private OfficeViewFilterOut getOfficeFilterView(Office office) {
        OfficeViewFilterOut officeView = mapperFacade.map(office, OfficeViewFilterOut.class);
        return officeView;
    }

    private OfficeViewOut getOfficeView(Office office) {
        OfficeViewOut officeView = mapperFacade.map(office, OfficeViewOut.class);
        return officeView;
    }
}
