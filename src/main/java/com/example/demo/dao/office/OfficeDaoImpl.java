package com.example.demo.dao.office;

import com.example.demo.dao.organization.OrganizationDao;
import com.example.demo.model.Office;
import com.example.demo.model.Organization;
import com.example.demo.view.office.OfficeFilterView;
import com.example.demo.view.office.OfficeView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@Repository
public class OfficeDaoImpl implements OfficeDao {
    private final EntityManager em;

    @Autowired
    public OfficeDaoImpl(EntityManager em) {
        this.em = em;
    }

    @Autowired
    private OrganizationDao organizationDao;;

    @Override
    public Office loadById(Long id) {
        return em.find(Office.class, id);
    }

    @Override
    public void update(OfficeView office) {

        Office officeEntity = em.find(Office.class, office.getId());

        updateEntityWithNotNullFields(office, officeEntity);
    }

    private void updateEntityWithNotNullFields(OfficeView office, Office officeEntity) {
        officeEntity.setActive(office.isActive() != null ? office.isActive() : officeEntity.getActive());
        officeEntity.setAddress(office.getAddress() != null ? office.getAddress() : officeEntity.getAddress());
        officeEntity.setName(office.getName() != null ? office.getName() : officeEntity.getAddress());
        officeEntity.setPhone(office.getPhone() != null ? office.getPhone() : officeEntity.getPhone());
    }

    @Override
    public void save(OfficeView office) {
        Office officeEntity = new Office();
        updateEntityWithNotNullFields(office, officeEntity);
        Organization org = organizationDao.loadById(office.getOrgId());
        officeEntity.setOrganization(org);
        em.persist(officeEntity);
    }

    @Override
    public List<Office> list(@Valid OfficeFilterView office) {
        CriteriaBuilder builder = em.getCriteriaBuilder();
        CriteriaQuery<Office> criteria = builder.createQuery(Office.class);
        Root<Office> officeRoot = criteria.from(Office.class);

        List<Predicate> predicates = new ArrayList<Predicate>();

        if (office.getName() != null) {
            predicates.add(builder.like(officeRoot.get("name"), "%" + office.getName() + "%"));
        }
        if (office.getOrgId() != null) {
            predicates.add(builder.equal(officeRoot.get("organization").get("id"), office.getOrgId()));
        }
        if (office.getPhone() != null) {
            predicates.add(builder.equal(officeRoot.get("phone"), office.getPhone()));
        }
        if (office.getActive() != null) {
            predicates.add(builder.equal(officeRoot.get("isActive"), office.getActive()));
        }

        criteria.where(predicates.toArray(new Predicate[]{}));

        return em.createQuery(criteria).getResultList();
    }
}
