package com.example.demo.controller.office;

import com.example.demo.model.Office;
import com.example.demo.service.OfficeService;
import com.example.demo.view.OfficeView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;
import javax.validation.constraints.NotNull;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(value = "/api/office", produces = APPLICATION_JSON_VALUE)
public class OfficeController {
    private final OfficeService officeService;

    @Autowired
    public OfficeController(OfficeService officeService) {
        this.officeService = officeService;
    }

    @GetMapping("/list/{id}")
    public OfficeView getOffice(@PathVariable Long id) {
        return officeService.getById(id);
    }

    @PostMapping("/update")
    @ResponseStatus(HttpStatus.OK)
    public void updateOffice(@RequestBody OfficeView office) {

        officeService.updateByPost(office);
        //через EntityManager апдейтить объект

    }

    @PostMapping("/save")
    public OfficeView saveOffice(@PathVariable Long id, String name, String address, int phone, boolean iActive) {
        return null;
    }
}



