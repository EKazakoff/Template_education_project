package com.example.demo.controller.organization;

import com.example.demo.service.OrganizationService;
import com.example.demo.view.organization.OrganizationFilterView;
import com.example.demo.view.organization.OrganizationView;
import com.example.demo.view.ResultView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(value = "/api/organization", produces = APPLICATION_JSON_VALUE)
public class OrganizationController {
    private final OrganizationService organizationService;

    @Autowired
    public OrganizationController(OrganizationService organizationService) {
        this.organizationService = organizationService;
    }

    @GetMapping("/{id}")
    public com.example.demo.view.organization.OrganizationView getOrganization(@org.springframework.web.bind.annotation.PathVariable Long id) {
        return organizationService.getById(id);
    }

    @PostMapping("/update")
    public ResultView updateOrganization(@RequestBody @Valid OrganizationView organizationView) throws Exception {
        organizationService.updateByPost(organizationView);
        return new ResultView("success");
    }

    @PostMapping("/save")
    public ResultView saveOrganization(@RequestBody @Valid OrganizationView organizationView) {
        organizationService.saveByPost(organizationView);
        return new ResultView("success");
    }

    @PostMapping("/list")
    public java.util.List<com.example.demo.view.organization.OrganizationFilterView> listOffice(@org.springframework.web.bind.annotation.RequestBody @javax.validation.Valid OrganizationFilterView organizationFilterView) {
        return organizationService.listOrganization(organizationFilterView);
    }
}



