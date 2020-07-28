package com.cts.pss.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.cts.pss.dao.UserDao;
import com.cts.pss.entity.User;
import com.cts.pss.service.SearchQuery;
import com.cts.pss.service.UserServiceImpl;

@Controller
@SessionAttributes("sessionUser")
public class LoginController {
	
	@Autowired
	UserServiceImpl userServiceImpl;
	
	@Autowired
	UserDao userdao;
	
	@RequestMapping("/")
	public String login() {
		
		return "Login";
	}
	
	@ModelAttribute("sessionUser")
	public User getUser() {
		return new User();
	}
	
	@RequestMapping("/validateUser")
	public String validateUser(@ModelAttribute("sessionUser") User user, Model model) {
		
		String viewName = "Login";
		
		 User userObj = userServiceImpl.searchByUserNameAndPassword(user.getUserName(), user.getPassword());
		
		 System.out.println(userObj);
		 if (userObj == null) {

             model.addAttribute("errorMsg", "Invalid User Name/Password");
             return viewName;
		 }else {
			 model.addAttribute("user", userObj);
			 model.addAttribute("searchQuery", new SearchQuery());
			 viewName = "UserHome";
		 }

		
		return viewName;
	}
	
	@RequestMapping("/index")
	private String index() {
		
		return "Index";
	}
	
	@RequestMapping("/search")
	private String search() {
		
		return "SearchFlight";
	}
	
	@RequestMapping("/user")
	private String userHome() {
		
		return "UserHome";
	}

	
	@RequestMapping("")
	private String userRegister() {
		
		return "CheckIn";
	}
}
