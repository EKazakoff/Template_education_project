package com.example.demo.service.impl;

import com.example.demo.dao.user.UserDao;
import com.example.demo.model.User;
import com.example.demo.model.mapper.MapperFacade;
import com.example.demo.view.UserFilterView;
import com.example.demo.view.UserFilterViewOut;
import com.example.demo.view.UserView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

/**
 * {@inheritDoc}
 */
@Service
public class UserServiceImpl implements com.example.demo.service.UserService {
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

    @Override
    @Transactional
    public List<UserFilterViewOut> listByFilter(UserFilterView user) {
        List<UserFilterViewOut> resultList = new ArrayList<>();
        List<User> orgList = dao.loadByFilter(user);
        for (int i = 0; i < orgList.size(); i++) {
            resultList.add(getUserView(orgList.get(i)));
        }
        return  resultList;
    }

    private UserFilterViewOut getUserView(User user) {
        UserFilterViewOut userView = mapperFacade.map(user, UserFilterViewOut.class);
        return userView;
    }

    @Override
    @Transactional
    public void updateByPost(UserView userView) throws Exception {
        //User user = mapperFacade.map(userView, User.class);
        dao.updateByPost(userView);
    }

    @Override
    @Transactional
    public void saveByPost(UserView userView) {
        User user = mapperFacade.map(userView, User.class);
        dao.saveByPost(user);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        dao.deletebyId(id);
    }
}
