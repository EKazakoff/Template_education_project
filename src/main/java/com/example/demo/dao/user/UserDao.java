package com.example.demo.dao.user;

import com.example.demo.model.Organization;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {

    public Organization getUserById (int id);

}
