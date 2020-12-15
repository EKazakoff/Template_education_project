package com.example.demo.controller.organization;

import com.example.demo.service.OrganizationService;
import com.example.demo.view.DataView;
import com.example.demo.view.organization.OrganizationFilterView;
import com.example.demo.view.organization.OrganizationView;
import com.example.demo.view.ResultView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
    public DataView getOrganization(@PathVariable Long id) {
        return new DataView(organizationService.getById(id));
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
    public DataView listOffice(@RequestBody @Valid OrganizationFilterView organizationFilterView) {
        return new DataView(organizationService.listOrganization(organizationFilterView));
    }
}



