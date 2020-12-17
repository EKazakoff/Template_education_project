package com.example.demo.dao.user;

import com.example.demo.model.User;
import com.example.demo.view.user.UserFilterView;
import com.example.demo.view.user.UserView;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {

    User getUserById(long id);

    List<User> loadByFilter(UserFilterView user);

    void updateByPost(UserView userView) throws Exception;

    void saveByPost(User user);
}

