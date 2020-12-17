package com.example.demo.service;

import com.example.demo.view.user.UserFilterView;
import com.example.demo.view.user.UserFilterViewOut;
import com.example.demo.view.user.UserView;

import java.util.List;

public interface UserService {

    public com.example.demo.view.user.UserViewOut getById(long id);

    public List<UserFilterViewOut> listByFilter(UserFilterView user);

    public void updateByPost(UserView user) throws Exception;

    public void saveByPost(UserView user);

}
