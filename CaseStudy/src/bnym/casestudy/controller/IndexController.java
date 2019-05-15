package bnym.casestudy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import bnym.casestudy.entity.Authorities;
import bnym.casestudy.entity.User;
import bnym.casestudy.service.UserDetailsDao;

@Controller
public class IndexController {

	@Autowired
	UserDetailsDao userService;

	@RequestMapping(value = { "/", "/home", "/index" })
	public ModelAndView home() {
		System.out.println("Hello There!");
		ModelAndView mav = new ModelAndView("index");
		userService.addAdmin();
		return mav;

	}

	@RequestMapping(value = { "/login" })
	public ModelAndView loginpage() {
		ModelAndView mav = new ModelAndView("login");
		return mav;
	}
}
