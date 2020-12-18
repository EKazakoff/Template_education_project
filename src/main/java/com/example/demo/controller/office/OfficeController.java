package com.example.demo.controller.office;

import com.example.demo.service.OfficeService;
import com.example.demo.view.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

/**
 * The type Office controller.
 */
@RestController
@RequestMapping(value = "/api/office", produces = APPLICATION_JSON_VALUE)
public class OfficeController {
    private final OfficeService officeService;

    /**
     * Instantiates a new Office controller.
     *
     * @param officeService the office service
     */
    @Autowired
    public OfficeController(OfficeService officeService) {
        this.officeService = officeService;
    }

    /**
     * Gets office.
     *
     * @param id the id
     * @return the office
     * @throws Exception the exception
     */
    @GetMapping("/{id}")
    public com.example.demo.view.office.OfficeViewOut getOffice(@PathVariable Long id) throws Exception {
        return officeService.getById(id);
    }

    /**
     * Update office result view.
     *
     * @param office the office
     * @return the result view
     */
    @PostMapping("/update")
    @ResponseStatus(HttpStatus.OK)
    public ResultView updateOffice(@RequestBody @Valid com.example.demo.view.office.OfficeView office) {
        officeService.updateByPost(office);
        return new ResultView("success");
    }

    /**
     * Save office result view.
     *
     * @param office the office
     * @return the result view
     */
    @PostMapping("/save")
    public ResultView saveOffice(@RequestBody @Valid com.example.demo.view.office.OfficeView office) {
        officeService.saveOffice(office);
        return new ResultView("success");
    }

    /**
     * List office list.
     *
     * @param office the office
     * @return the list
     */
    @PostMapping("/list")
    public List<com.example.demo.view.office.OfficeViewFilterOut> listOffice(@RequestBody @Valid com.example.demo.view.office.OfficeFilterView office) {
        return officeService.listOffice(office);
    }
}




