package com.example.demo.dao.user;

import com.example.demo.model.User;
import com.example.demo.view.UserFilterView;
import com.example.demo.view.UserView;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {

    User getUserById(long id);

    List<User> loadByFilter(UserFilterView user);

    void deletebyId(Long id);

    void updateByPost(UserView userView) throws Exception;

    void saveByPost(User user);
}

