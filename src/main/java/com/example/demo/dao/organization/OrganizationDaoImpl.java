package com.example.demo.dao.organization;

import com.example.demo.model.Organization;
import com.example.demo.view.OrganizationFilterView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
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
    public List<Organization> loadByFilter(OrganizationFilterView organizationFilterView) {
        CriteriaBuilder builder = em.getCriteriaBuilder();
        CriteriaQuery<Organization> criteria = builder.createQuery(Organization.class);
        Root<Organization> orgRoot = criteria.from(Organization.class);

        List<Predicate> predicates = new ArrayList<Predicate>();

        if (organizationFilterView.getInn() != null) {
            predicates.add(builder.equal(orgRoot.get("inn"),  organizationFilterView.getInn()));
        }
        if (organizationFilterView.getIsActive() != null) {
            predicates.add(builder.equal(orgRoot.get("isActive"), organizationFilterView.getIsActive()));
        }
        if (organizationFilterView.getName() != null) {
            predicates.add(builder.like(orgRoot.get("name"), "%" + organizationFilterView.getName() +  "%"));
        }

        criteria.where(predicates.toArray(new Predicate[]{}));

        return em.createQuery(criteria).getResultList();
    }

    @Override
    public void updatePost(Organization organization) throws Exception {
        Organization organizationEntity = em.find(Organization.class, organization.getId());

        updateEntityWithNotNullFields(organization, organizationEntity);
    }

    private void updateEntityWithNotNullFields(Organization organization, Organization orgEntity) throws Exception {
        if (orgEntity == null) {
            throw new Exception("Can't find organization");
        }
        orgEntity.setIsActive(organization.getIsActive() != null ? organization.getIsActive() : orgEntity.getIsActive());

        orgEntity.setAddress(organization.getAddress() != null ? organization.getAddress() : orgEntity.getAddress());

        orgEntity.setName(organization.getName() != null ? organization.getName() : orgEntity.getName());

        orgEntity.setOffices(organization.getOffices() != null ? organization.getOffices() : orgEntity.getOffices());

        orgEntity.setId(organization.getId() != null ? organization.getId() : orgEntity.getId());

        orgEntity.setKpp(organization.getKpp() != null ? organization.getKpp() : orgEntity.getKpp());

        orgEntity.setPhone(organization.getPhone() != null ? organization.getPhone() : orgEntity.getPhone());

        orgEntity.setInn(organization.getInn() != null ? organization.getInn() : orgEntity.getInn());
    }
}
