package com.example.demo.controller.user;

import com.example.demo.service.UserService;
import com.example.demo.view.DataView;
import com.example.demo.view.ResultView;
import com.example.demo.view.user.UserFilterView;
import com.example.demo.view.user.UserView;
import com.example.demo.view.user.UserViewOut;
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

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(value = "/api/user", produces = APPLICATION_JSON_VALUE)
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{id}")
    public UserViewOut getUser(@PathVariable Long id) {
        return userService.getById(id);
    }

    @PostMapping("/update")
    @ResponseStatus(HttpStatus.OK)
    public ResultView updateOffice(@RequestBody @Valid UserView userView) throws Exception {
        userService.updateByPost(userView);
        return new ResultView("success");
    }

    @PostMapping("/save")
    public ResultView saveOffice(@RequestBody @Valid UserView office) {
        userService.saveByPost(office);
        return new ResultView("success");
    }

    @PostMapping("/list")
    public DataView listOffice(@RequestBody @Valid UserFilterView user) {
        return new DataView(userService.listByFilter(user));
    }
}



