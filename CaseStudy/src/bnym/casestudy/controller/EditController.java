package bnym.casestudy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import bnym.casestudy.entity.User;
import bnym.casestudy.repository.UserRegRepository;
import bnym.casestudy.service.UserDetailsDao;

@Controller
public class EditController {
	@Autowired
	UserDetailsDao userService;
	
	@Autowired
	UserRegRepository userRepository;
	
	@RequestMapping("/edituser")
	 public ModelAndView editApplication(@RequestParam String username) {
		User user = new User();
		user = userRepository.findByUsername(username);
		System.out.println("user firstname for edit:"+user.getFirstname());
		ModelAndView mav = new ModelAndView("edituserdetails");
		mav.addObject("userdetails", user);
		return mav;
	}
	
	 @RequestMapping(value="/saveuserdetails",method=RequestMethod.POST)
	  public ModelAndView saveuserdetails(@ModelAttribute("userdetails")User user, BindingResult result){
		  System.out.println("inside save method");
		  System.out.println("username is"+user.getUsername());
		  System.out.println("user lastname");
		  //userService.deleteUserByUsername(user.getUsername());
		  userService.saveUser(user);
		  ModelAndView model = new ModelAndView("showuserdetails");
		  User userdetails = userRepository.findByUsername(user.getUsername());
		  model.addObject("userdetails",userdetails);
		  return model;
	  }

}
