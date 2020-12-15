package com.example.demo.dao.organization;

import com.example.demo.model.Organization;
import com.example.demo.view.organization.OrganizationFilterView;

import java.util.List;

/**
 * DAO для работы с Organization
 */

public interface OrganizationDao {

    /**
     * Получить все объекты Organization
     *
     * @return
     */
    List<Organization> all();

    /**
     * Получить Organization по идентификатору
     *
     * @param id
     * @return
     */
    Organization loadById(Long id);

    /**
     * Сохранить Organization
     *
     * @param organization
     */
    void save(Organization organization);

    List<Organization> loadByFilter(OrganizationFilterView organizationFilterView);

    void updatePost(Organization organization) throws Exception;
}