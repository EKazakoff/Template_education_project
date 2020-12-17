package com.example.demo.service.impl;

import com.example.demo.dao.user.UserDao;
import com.example.demo.model.User;
import com.example.demo.model.mapper.MapperFacade;
import com.example.demo.view.user.UserFilterView;
import com.example.demo.view.user.UserFilterViewOut;
import com.example.demo.view.user.UserView;
import com.example.demo.view.user.UserViewOut;
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
     * @return
     */
    @Override
    @Transactional
    public com.example.demo.view.user.UserViewOut getById(long id) {
        User user = dao.getUserById(id);
        return mapUserToView(user);
    }

    private UserViewOut mapUserToView(User user) {
        UserViewOut userViewOut = mapperFacade.map(user, UserViewOut.class);
        userViewOut.setCitizenshipCode(user.getCountry().getCode());
        userViewOut.setCitizenshipName(user.getCountry().getName());
        userViewOut.setDocDate(user.getUserDoc().getDocData());
        userViewOut.setDocName(user.getUserDoc().getDocument().getName());
        userViewOut.setDocNumber(user.getUserDoc().getDocNumber());
        return  userViewOut;
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
}
