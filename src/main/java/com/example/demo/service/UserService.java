package com.example.demo.service;

import com.example.demo.view.user.UserFilterView;
import com.example.demo.view.user.UserFilterViewOut;
import com.example.demo.view.user.UserView;

import java.util.List;

/**
 * The interface User service.
 */
public interface UserService {

    /**
     * Gets by id.
     *
     * @param id the id
     * @return the by id
     */
    public com.example.demo.view.user.UserViewOut getById(long id);

    /**
     * List by filter list.
     *
     * @param user the user
     * @return the list
     */
    public List<UserFilterViewOut> listByFilter(UserFilterView user);

    /**
     * Update by post.
     *
     * @param user the user
     * @throws Exception the exception
     */
    public void updateByPost(UserView user) throws Exception;

    /**
     * Save by post.
     *
     * @param user the user
     */
    public void saveByPost(UserView user);

}
