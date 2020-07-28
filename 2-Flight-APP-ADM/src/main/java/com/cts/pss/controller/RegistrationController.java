package com.cts.pss.controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.cts.pss.dao.UserDao;
import com.cts.pss.entity.User;

@Controller
public class RegistrationController {
	
	@Autowired
	UserDao userDao;
	
	@RequestMapping("/regForm")
	private String registration() {
		
		return "UserRegistration";
	}

	@RequestMapping("/registerUser")
	private String registerUser(@ModelAttribute User user, Model model) {
		
		String viewName = "Login";
		System.out.println("username--" + user.getUserName());
		System.out.println("passenger--" + user.getPassenger());
		System.out.println("firstname--" + user.getPassenger().getFirst_name());
		System.out.println("firstname--" + user.getPassenger().getMobile_number());
		System.out.println("------------------------------------------------------------------");
		
		User userObj = new User();
		if (user!=null) {
			user.setLoginTime(LocalDateTime.now());
			userObj = userDao.findById(user.getUserName()).orElse(null);
		}
		if (userObj== null) {
			userDao.save(user);
		}else {
			 viewName = "UserRegister";
			 model.addAttribute("errorMsg", "User Id " + user.getUserName() + " Already taken");
			 model.addAttribute("user", user);
             return viewName;
		}
		
		return viewName;
	}
	
}
