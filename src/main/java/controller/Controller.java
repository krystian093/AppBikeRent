package controller;

import model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.portlet.ModelAndView;

public class Controller {

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView login() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("user", new User());
        return modelAndView;
    }

    @RequestMapping(value = "signup", method = RequestMethod.GET)
    public ModelAndView signup(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("user", new User());
        modelAndView.setViewName("signup");
        return modelAndView;
    }
}

