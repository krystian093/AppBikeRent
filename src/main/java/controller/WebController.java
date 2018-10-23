package controller;

import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.portlet.ModelAndView;
import service.BikeService;
import service.RentService;
import service.UserService;

public class WebController {

    @Autowired
    private UserService userService;

    @Autowired
    private BikeService bikeService;

    @Autowired
    private RentService rentService;

    @Autowired

    public WebController(UserService userService) {this.userService = userService; }

    @GetMapping(value = "/addUser")
    public ModelAndView addUser(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("user",new User());
        modelAndView.setViewName("addUser");
        return modelAndView;
    }
    @PostMapping(value = "/addUser")
    public ModelAndView addUser(User user, BindingResult bindingResult){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("addUser");
        return modelAndView;
    }

}
