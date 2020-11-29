package com.example.demo.service;

import com.example.demo.dao.office.OfficeDao;
import com.example.demo.model.Office;
import com.example.demo.model.Organization;
import com.example.demo.model.mapper.MapperFacade;
import com.example.demo.view.OfficeView;
import com.example.demo.view.OrganizationView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

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
        return getOfficeView(dao.loadById(id));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @Transactional
    public OfficeView listByFilter(Long id, String name, int phone, boolean isActive) {
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @Transactional
    public void updateByPost(OfficeView office) {

        dao.update(office);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @Transactional
    public OfficeView saveByPost(Long id, String name, String address, int phone, boolean iActive) {
        return null;
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        dao.deletebyId(id);
    }

    @Override
    @Transactional
    public void saveOffice(OfficeView office) {
        dao.save(office);
    }

    @Override
    @Transactional
    public List<OfficeView> listOffice(OfficeView office) {
        List<OfficeView> resultList = new ArrayList<>();
        List<Office> offices = dao.list(office);
        for (int i = 0; i < offices.size(); i++) {
            resultList.add(getOfficeView(offices.get(i)));
        }
        return resultList;
    }

    private OfficeView getOfficeView(Office office) {
        OfficeView officeView = mapperFacade.map(office, OfficeView.class);
        officeView.setOrganizationView(mapperFacade.map(office.getOrganization(), OrganizationView.class));
        return officeView;
    }
}
