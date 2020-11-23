package com.example.demo.dao.user;

import com.example.demo.model.Organization;
import com.example.demo.model.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

@Repository
public class UserDaoImpl implements UserDao {
    private final EntityManager em;

    public UserDaoImpl(EntityManager em) {
        this.em = em;
    }

    @Override
    public User getUserById(long id) {
        CriteriaBuilder builder = em.getCriteriaBuilder();
        CriteriaQuery<User> criteria = builder.createQuery(User.class);

        Root<User> user = criteria.from(User.class);
        criteria.where(builder.equal(user.get("id"), id));


        return em.createQuery(criteria).getSingleResult();
    }
}
