package com.example.demo.controller.organization;

import com.example.demo.model.Organization;
import com.example.demo.service.OrganizationService;
import com.example.demo.service.OrganizationServiceImpl;
import com.example.demo.view.OrganizationView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(value = "/api/organization", produces = APPLICATION_JSON_VALUE)
public class OrganizationController {
    private final OrganizationService organizationService;

    @Autowired
    public OrganizationController(OrganizationService organizationService) {
        this.organizationService = organizationService;
    }

    @GetMapping("/list/{id}")
    public OrganizationView getOrganization(@PathVariable  Long id) {
        return organizationService.getById(id);
    }

    @PostMapping("/update")
    public OrganizationView updateOrganization(@PathVariable Long id, String name, String fullOrgName, int inn, int kpp, String address, int phone, boolean iActive) {
        return null;
    }

    @PostMapping("/save")
    public OrganizationView saveOrganization(@PathVariable String name, String fullOrgName, int inn, int kpp, String address, int phone, boolean iActive) {
        return null;
    }
}



