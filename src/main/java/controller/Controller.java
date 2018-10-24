package controller;

import model.User;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.portlet.ModelAndView;
import service.UserService;

public class Controller {

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView login() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("user", new User());
        return modelAndView;
    }

    @RequestMapping(value = "/signup", method = RequestMethod.GET)
    public ModelAndView signup(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("user", new User());
        modelAndView.setViewName("signup");
        return modelAndView;
    }
    @RequestMapping(value = "/singup", method = RequestMethod.POST)
    public ModelAndView addNewUser(User user, BindingResult bindingResult){
        ModelAndView modelAndView = new ModelAndView();
        return modelAndView;
    }
    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public ModelAndView admin(){
        ModelAndView modelAndView = new ModelAndView();
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        User user = UserService.findUserByEmail(authentication.getName());
        modelAndView.addObject
                ("UserName", "Welcome" + user.getUserName() + " " + user.getUserLastName() + " " + user.getEmail());
        modelAndView.addObject("adminMessage", "Content Availiable Only For Users with Admin Role");
        modelAndView.setViewName("/admin");
        return modelAndView;
    }
}

