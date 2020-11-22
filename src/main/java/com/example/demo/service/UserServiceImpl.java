package com.example.demo.service;

import com.example.demo.dao.user.UserDao;
import com.example.demo.model.mapper.MapperFacade;
import com.example.demo.view.UserView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * {@inheritDoc}
 */
@Service
public class UserServiceImpl implements UserService {
    private final UserDao dao;
    private final MapperFacade mapperFacade;

    /**
     * {@inheritDoc}
     */
    @Autowired
    public UserServiceImpl(UserDao dao, MapperFacade mapperFacade) {
        this.dao = dao;
        this.mapperFacade = mapperFacade;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @Transactional
    public UserView getById(long id) {
        return mapperFacade.map(dao.getUserById(id), UserView.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @Transactional //определяет транзакцию в БД,работает в рамках persistence context’а. Persistence context
    //в JPA - это EntityManager. В hibernate он реализован через Session.
    public UserView listByFilter(String officeId, String firstName, String secondName, String middleName, String position, int docCode, int citizenshipCode) {
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @Transactional
    public UserView updateByPost(Long id, int officeId, String firstName, String secondName, String middleName, String position, int phone, String docName, int docNumber, String docData, int citizenshipCode, boolean isIdentified) {
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @Transactional
    public UserView saveByPost(int officeId, String firstName, String secondName, String middleName, String position, int phone, int docCode, String docName, int docNumber, String docData, int citizenshipCode, boolean isIdentified) {
        return null;
    }
}
