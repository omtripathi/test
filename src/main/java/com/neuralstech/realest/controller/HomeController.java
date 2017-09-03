package com.neuralstech.realest.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

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
		return new ModelAndView("login");
	}
}
