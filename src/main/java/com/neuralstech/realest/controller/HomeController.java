package com.neuralstech.realest.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.neuralstech.realest.model.User;
import com.neuralstech.realest.service.IGenericService;

@Controller
public class HomeController {
	
	@Autowired
	private IGenericService<User> genericService;

	@RequestMapping(value="/")
	public ModelAndView home(HttpServletResponse response) throws IOException{
		//return new ModelAndView("login");
		return new ModelAndView("index");
	}
	
	@RequestMapping(value="/signup")
	public ModelAndView login(HttpServletResponse response) throws IOException{
		//return new ModelAndView("login");
		return new ModelAndView("signup");
	}
	@RequestMapping(value="/add")
	public ModelAndView add(HttpServletResponse response) throws IOException{
		//return new ModelAndView("login");
		return new ModelAndView("add_user");
	}
	
	@RequestMapping(value="/login")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		User user = new User();
		user.setId(1L);
		user.setFirstName("om");
		user.setLastName("tripathi");
		user.setEmail("tripathiom");
		user.setMobileNo(8989898989l);
		//genericService.add(user);
		return new ModelAndView("login");
	}
}
