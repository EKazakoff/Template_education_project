package com.example.demo.controller.office;

import com.example.demo.service.OfficeService;
import com.example.demo.view.OfficeView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @GetMapping("/update")
    public OfficeView updateOffice(@PathVariable Long id, String name, String address, int phone, boolean isActive) {

        //через EntityManager апдейтить объект


/*        try {
            if ((name != null || address != null)) {
                System.out.println("result" + ":" + "success");
            } else {
                System.out.println("result" + ":" + "error");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }*/
        return null;
    }
}



