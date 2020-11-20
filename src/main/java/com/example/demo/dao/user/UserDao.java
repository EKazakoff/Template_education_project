package com.example.demo.dao.user;

import com.example.demo.model.Organization;
import com.example.demo.model.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {

    public User getUserById (long id);
}
