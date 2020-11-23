package com.example.demo.controller.office;

import com.example.demo.service.OfficeService;
import com.example.demo.view.OfficeView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import java.util.List;

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

    @GetMapping("/delete/{id}")
    public void delOffice(@PathVariable Long id) {

        officeService.deleteById(id);
    }

    @DeleteMapping("/update")
    @ResponseStatus(HttpStatus.OK)
    public void updateOffice(@RequestBody @Valid OfficeView office) {
        officeService.updateByPost(office);
    }

    @PostMapping("/save")
    public void saveOffice(@RequestBody @Valid OfficeView office) {
        officeService.saveOffice(office);
    }

    @PostMapping("/list")
    public List<OfficeView> listOffice(@RequestBody @Valid OfficeView office) {
        return officeService.listOffice(office);
    }
}



