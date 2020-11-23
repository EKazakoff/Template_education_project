package com.example.demo.service;

import com.example.demo.dao.office.OfficeDao;
import com.example.demo.model.mapper.MapperFacade;
import com.example.demo.view.OfficeView;
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

/*    private static final EntityManager entityManager;

    static {
        try {
            EntityManagerFactory factory = Persistence.createEntityManagerFactory("AccountsUnit");
            entityManager = factory.createEntityManager();
        } catch (Throwable ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }*/

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

    /**
     * {@inheritDoc}
     */
    @Override
    @Transactional //определяет транзакцию в БД,работает в рамках persistence context’а. Persistence context
    //в JPA - это EntityManager. В hibernate он реализован через Session.
    public OfficeView listByFilter(Long id, String name, int phone, boolean isActive) {
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @Transactional
    public void updateByPost(OfficeView office) {
        // view -> model

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
        dao.list(office).forEach( office1 -> {
            resultList.add(mapperFacade.map(office1, OfficeView.class));
        });
        return resultList;
    }
}
