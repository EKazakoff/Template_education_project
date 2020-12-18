package com.example.demo.service;

import com.example.demo.view.organization.OrganizationFilterView;
import com.example.demo.view.organization.OrganizationView;

import java.util.List;

/**
 * The interface Organization service.
 */
public interface OrganizationService {

    /**
     * Gets by id.
     *
     * @param id the id
     * @return the by id
     */
    public OrganizationView getById(long id);

    /**
     * Update by post.
     *
     * @param organizationView the organization view
     * @throws Exception the exception
     */
    public void updateByPost(OrganizationView organizationView) throws Exception;

    /**
     * Save by post.
     *
     * @param organizationView the organization view
     */
    public void saveByPost(OrganizationView organizationView);

    /**
     * List organization list.
     *
     * @param organizationFilterView the organization filter view
     * @return the list
     */
    List<OrganizationFilterView> listOrganization(OrganizationFilterView organizationFilterView);
}
