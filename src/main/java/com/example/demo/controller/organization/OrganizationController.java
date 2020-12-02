package com.example.demo.controller.organization;

import com.example.demo.service.OrganizationService;
import com.example.demo.view.DataView;
import com.example.demo.view.OrganizationFilterView;
import com.example.demo.view.OrganizationView;
import com.example.demo.view.ResultView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

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
    public OrganizationView getOrganization(@PathVariable Long id) {
        return organizationService.getById(id);
    }

    @PostMapping("/update")
    public ResultView updateOrganization(@RequestBody OrganizationView organizationView) {
        organizationService.updateByPost(organizationView);
        return new ResultView("success");
    }

    @PostMapping("/save")
    public ResultView saveOrganization(@RequestBody OrganizationView organizationView) {
        organizationService.saveByPost(organizationView);
        return new ResultView("success");
    }

    @PostMapping("/list")
    public DataView listOffice(@RequestBody @Valid OrganizationFilterView organizationFilterView) {
        return new DataView(organizationService.listOrganization(organizationFilterView));
    }
}




