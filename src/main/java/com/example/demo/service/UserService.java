package com.example.demo.service;

import com.example.demo.view.UserFilterView;
import com.example.demo.view.UserFilterViewOut;
import com.example.demo.view.UserView;

import java.util.List;

public interface UserService {

    public com.example.demo.view.UserViewOut getById(long id);

    public List<UserFilterViewOut> listByFilter(UserFilterView user);

    public void updateByPost(UserView user) throws Exception;

    public void saveByPost(UserView user);

    void deleteById(Long id);
}
