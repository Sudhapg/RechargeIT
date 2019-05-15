package bnym.casestudy.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

import bnym.casestudy.entity.Authorities;
import bnym.casestudy.entity.Subscription;
import bnym.casestudy.entity.User;
import bnym.casestudy.service.UserDetailsDao;

@Controller
public class RegistrationController {
	
	@Autowired
	UserDetailsDao userService;
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		binder.registerCustomEditor(Date.class, "expdate", new CustomDateEditor(sdf, false));
	}
	
	
	@RequestMapping(value= {"/registration"})
	public ModelAndView subscribepage() {
		ModelAndView mav = new ModelAndView("registration");
		return mav;
	}
	
	@RequestMapping(value = "/saveUser", method = RequestMethod.POST)
	  public ModelAndView saveApplication (
	  @Valid @ModelAttribute("registrationForm") User user, BindingResult
	  result) {
		  if(result.hasErrors()) { 
			  System.out.println(result.toString());
			  ModelAndView model = new ModelAndView("registration"); 
		  return model; 
	  }
		  
		  String encode = new BCryptPasswordEncoder().encode(user.getPassword());
		  user.setPassword(encode);
		  user.setEnabled(true);
		  Authorities  auth= new Authorities();
		  auth.setAuthority("ROLE_USER");
		  auth.setUser(user);
		  user.getAuthorities().add(auth);
		  if(user.getSubscription().getBoxtype()!= null) {
			 user.getSubscription().setStatus("Y");
		    
		 }else {
			 user.getSubscription().setStatus("N");
		 }
		  userService.saveUser(user);
		  	  
		  ModelAndView model =	  new ModelAndView("registersuccess"); 
		  return model; 
	  } // end /saveApplication

	@RequestMapping("/checkout")
	public ModelAndView checkout() {
		ModelAndView mav = new ModelAndView("checkout");
				return mav;
	}
	
	@RequestMapping("/cancelreg")
	public ModelAndView cancelreg(@RequestParam String username) {
		System.out.println("Username to be deleted:" +username);
		userService.deleteUserByUsername(username);
		ModelAndView mav = new ModelAndView("subscribe");
				return mav;
	}
	
}
