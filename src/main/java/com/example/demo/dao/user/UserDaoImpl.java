package com.example.demo.dao.user;

import com.example.demo.model.User;
import com.example.demo.view.user.UserFilterView;
import com.example.demo.view.user.UserView;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

/**
 * The type User dao.
 */
@Repository
public class UserDaoImpl implements UserDao {
    private final EntityManager em;

    /**
     * Instantiates a new User dao.
     *
     * @param em the em
     */
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

    @Override
    public List<User> loadByFilter(UserFilterView user) {

        CriteriaBuilder builder = em.getCriteriaBuilder();
        CriteriaQuery<User> criteria = builder.createQuery(User.class);
        Root<User> userRoot = criteria.from(User.class);

        List<Predicate> predicates = new ArrayList<Predicate>();

        if (user.getFirstName() != null) {
            predicates.add(builder.like(userRoot.get("firstName"), "%" + user.getFirstName() +  "%"));
        }
        if (user.getLastName() != null) {
            predicates.add(builder.like(userRoot.get("lastName"), "%" + user.getLastName() +  "%"));
        }
        if (user.getMiddleName() != null) {
            predicates.add(builder.like(userRoot.get("middleName"), "%" + user.getMiddleName() +  "%"));
        }
        if (user.getPosition() != null) {
            predicates.add(builder.equal(userRoot.get("position"), user.getPosition()));
        }
        if (user.getOfficeId() != null) {
            predicates.add(builder.equal(userRoot.get("office").get("id"), user.getOfficeId()));
        }
        if (user.getDocCode() != null) {
            predicates.add(builder.equal(userRoot.get("docCode"),  user.getDocCode() ));
        }
        if (user.getCitizenshipCode() != null) {
            predicates.add(builder.equal(userRoot.get("citizenshipCode"), user.getCitizenshipCode()));
        }

        criteria.where(predicates.toArray(new Predicate[]{}));

        return em.createQuery(criteria).getResultList();
    }



    @Override
    public void updateByPost(UserView userView) throws Exception {
        User userEntity = em.find(User.class, userView.getId());

        updateEntityWithNotNullFields(userView, userEntity);
    }

    private void updateEntityWithNotNullFields(UserView userView, User orgEntity) throws Exception {
        if (orgEntity == null) {
            throw new Exception("Can't find organization");
        }
        orgEntity.setFirstName(userView.getFirstName() != null ? userView.getFirstName() : orgEntity.getFirstName());
        orgEntity.setSecondName(userView.getSecondName() != null ? userView.getSecondName() : orgEntity.getSecondName());
        orgEntity.setMiddleName(userView.getMiddleName() != null ? userView.getMiddleName() : orgEntity.getMiddleName());
        orgEntity.setId(userView.getId() != null ? userView.getId() : orgEntity.getId());
        orgEntity.setPosition(userView.getPosition() != null ? userView.getPosition() : orgEntity.getPosition());
    }

    @Override
    public void saveByPost(User user) {
        user.setId(null);
        em.persist(user);
    }
}
