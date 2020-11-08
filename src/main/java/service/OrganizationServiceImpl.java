package service;

import dao.organization.OrganizationDao;
import ma.glasnost.orika.MapperFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import view.OrganizationView;
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


