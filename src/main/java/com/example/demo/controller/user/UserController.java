package com.example.demo.controller.user;

import com.example.demo.service.UserService;
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

/**
 * The type User controller.
 */
@RestController
@RequestMapping(value = "/api/user", produces = APPLICATION_JSON_VALUE)
public class UserController {
    private final UserService userService;

    /**
     * Instantiates a new User controller.
     *
     * @param userService the user service
     */
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    /**
     * Gets user.
     *
     * @param id the id
     * @return the user
     */
    @GetMapping("/{id}")
    public UserViewOut getUser(@PathVariable Long id) {
        return userService.getById(id);
    }

    /**
     * Update office result view.
     *
     * @param userView the user view
     * @return the result view
     * @throws Exception the exception
     */
    @PostMapping("/update")
    @ResponseStatus(HttpStatus.OK)
    public ResultView updateOffice(@RequestBody @Valid UserView userView) throws Exception {
        userService.updateByPost(userView);
        return new ResultView("success");
    }

    /**
     * Save office result view.
     *
     * @param office the office
     * @return the result view
     */
    @PostMapping("/save")
    public ResultView saveOffice(@RequestBody @Valid UserView office) {
        userService.saveByPost(office);
        return new ResultView("success");
    }

    /**
     * List office java . util . list.
     *
     * @param user the user
     * @return the java . util . list
     */
    @PostMapping("/list")
    public java.util.List<com.example.demo.view.user.UserFilterViewOut> listOffice(@org.springframework.web.bind.annotation.RequestBody @javax.validation.Valid UserFilterView user) {
        return userService.listByFilter(user);
    }
}



