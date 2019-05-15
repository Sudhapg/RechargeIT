package bnym.casestudy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


import bnym.casestudy.entity.User;
import bnym.casestudy.repository.UserRegRepository;
import bnym.casestudy.service.UserDetailsDao;

@Controller
public class ManageAccountController {
	@Autowired
	UserDetailsDao userService;
	
	@Autowired
	UserRegRepository userRepository;
	
	@RequestMapping("/manageaccount")
	public ModelAndView manageAccount() {
		//Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
	//	String currentPrincipalName = authentication.getName();
		//userService.findUserByusername(currentPrincipalName);
		//System.out.println("Username"+currentPrincipalName);
		ModelAndView mav = new ModelAndView("manageaccount");
		// mav.addObject("msg","welcome"+currentPrincipalName);
		return mav;
	}
	
	
	
	@RequestMapping("/getuserdetails")
	public ModelAndView getUserDetails(@RequestParam String username, RedirectAttributes redir) {
		try {
		User user = new User();
		System.out.println("inside getuserdetails method");
		System.out.println("username is"+username);
		user = userRepository.findByUsername(username);
		System.out.println("user firstname"+user.getFirstname());
		if(user != null) {
			ModelAndView mav = new ModelAndView("showuserdetails");
			mav.addObject("userdetails",user);
			return mav;
		}else {
			ModelAndView mav = new ModelAndView("redirect:/manageaccount");
			redir.addFlashAttribute("noRecord","No record found!");
			return mav;
		}
		}catch(Exception e) {
			ModelAndView mav = new ModelAndView("redirect:/manageaccount");
			mav.addObject("msg","No Record found!");
			redir.addFlashAttribute("noRecord","No record found!");
			return mav;
		}
		
	}

}
