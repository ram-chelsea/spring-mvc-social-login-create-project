package project.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import project.dm.User;
import project.security.UserValidator;
import project.service.SecurityService;
import project.service.UserService;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private SecurityService securityService;

    @Autowired
    private UserValidator userValidator;



    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public String add(@ModelAttribute("userForm") User userForm, BindingResult bindingResult, Model model) {
        userValidator.validate(userForm, bindingResult);

        if (bindingResult.hasErrors()) {
            return "registration";
        }

        userService.save(userForm);

//        securityService.autologin(userForm.getUsername(), userForm.getPasswordConfirm());

        return "/registration";
    }

    @RequestMapping(value = {"/"}, method = RequestMethod.GET)
    public
    String index() {
        return "index.html";
    }

  }

