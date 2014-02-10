package com.piddubnyi.taskmanager.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.piddubnyi.taskmanager.services.LoginService;

@Controller
public class LoginController {
	
	@Autowired
	private LoginService loginService;

	@RequestMapping(value="/login", method=RequestMethod.POST)
	public ModelAndView login(@RequestParam String userName,@RequestParam String password) {
		ModelAndView res = new ModelAndView();
		if(loginService.validateUser(userName,password)){
			res.setViewName("mainPage");	
		}else{
			res.setViewName("loginfailedPage");
		}
		return res;
	};

}
