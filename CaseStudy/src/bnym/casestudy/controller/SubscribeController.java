package bnym.casestudy.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import bnym.casestudy.entity.Subscription;
import bnym.casestudy.entity.User;
import bnym.casestudy.service.UserDetailsDao;

@Controller
public class SubscribeController {
	
	@Autowired
	UserDetailsDao userService;
	
	@RequestMapping("/subscribe")
	public ModelAndView subscribe() {
		ModelAndView mav = new ModelAndView("subscribe");
		return mav;
	}
	
		
	@RequestMapping("/registeruser")
	public ModelAndView register(Model model) {
		model.addAttribute("registrationForm", new User());
		ModelAndView mav = new ModelAndView("registration");
		mav.addObject("types", Subscription.BoxType.values());
		return mav;
	}
}
