package com.example.demo.dao.organization;

import com.example.demo.model.Organization;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

/**
 * {@inheritDoc}
 */
@Repository
public class OrganizationDaoImpl implements OrganizationDao {

    private final EntityManager em;

    @Autowired
    public OrganizationDaoImpl(EntityManager em) {
        this.em = em;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Organization> all() {
        TypedQuery<Organization> query = em.createQuery("SELECT p FROM Organization p", Organization.class);
        return query.getResultList();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Organization loadById(Long id) {
        return em.find(Organization.class, id);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Organization loadByName(String name) {
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void save(Organization organization) {
        organization.setId(null);
        em.persist(organization);
    }

    @Override
    public List<Organization> loadByFilter(com.example.demo.view.OrganizationFilterView organizationFilterView) {
        CriteriaBuilder builder = em.getCriteriaBuilder();
        CriteriaQuery<Organization> criteria = builder.createQuery(Organization.class);
        Root<Organization> orgRoot = criteria.from(Organization.class);

        List<javax.persistence.criteria.Predicate> predicates = new java.util.ArrayList<javax.persistence.criteria.Predicate>();

        if (organizationFilterView.getInn() != null) {
            predicates.add(builder.equal(orgRoot.get("inn"),  organizationFilterView.getInn()));
        }
        if (organizationFilterView.getIsActive() != null) {
            predicates.add(builder.equal(orgRoot.get("isActive"), organizationFilterView.getIsActive()));
        }

        if (organizationFilterView.getName() != null) {
            predicates.add(builder.like(orgRoot.get("name"), "%" + organizationFilterView.getName() +  "%"));
        }

        criteria.where(predicates.toArray(new javax.persistence.criteria.Predicate[]{}));

        return em.createQuery(criteria).getResultList();
    }

    @Override
    public void update(Organization organization) {
        Organization organizationEntity = em.find(Organization.class, organization.getId());

        updateEntityWithNotNullFields(organization, organizationEntity);
    }



    private void updateEntityWithNotNullFields(Organization organization, Organization orgEntity) {
        orgEntity.setActive(organization.isActive() != null ? orgEntity.isActive() : orgEntity.isActive());

        orgEntity.setAddress(organization.getAddress() != null ? orgEntity.getAddress() : orgEntity.getAddress());

        orgEntity.setName(organization.getName() != null ? orgEntity.getName() : orgEntity.getName());

        orgEntity.setFullName(organization.getFullName() != null ? orgEntity.getFullName() : orgEntity.getFullName());

        orgEntity.setInn(organization.getInn() != null ? orgEntity.getInn() : orgEntity.getInn());

        orgEntity.setPhone(organization.getPhone() != null ? orgEntity.getPhone() : orgEntity.getPhone());

        orgEntity.setKpp(organization.getKpp() != null ? orgEntity.getKpp() : orgEntity.getKpp());

        orgEntity.setId(organization.getId() != null ? orgEntity.getId() : orgEntity.getId());

        orgEntity.setOffices(organization.getOffices() != null ? orgEntity.getOffices() : orgEntity.getOffices());

    }
}
