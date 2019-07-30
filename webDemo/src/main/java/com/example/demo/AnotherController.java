package com.example.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AnotherController {
	public AnotherController() {
		System.out.println("within anotherctrller");
	}
	@RequestMapping("/")
	public String greet() {
		return "login";
	}
	@RequestMapping("/verify")
	public String verify(HttpServletRequest req) {
		String name=req.getParameter("user");
		HttpSession session=req.getSession();
		session.setAttribute("uname", name);
		return "welcome";
	}
	
	@RequestMapping("/verify2")
	public String verify2(@RequestParam("user")String name,String pass,HttpSession session) {
		session.setAttribute("uname", name);
		return "welcome";
	}
	
	
	@RequestMapping("/verify3")
	public String verify3(String user,String pass,HttpSession session) {
		session.setAttribute("uname", user);
		session.setAttribute("pass", pass);
		
		return "welcome";
	}
	
	@RequestMapping("/verify4")
	public ModelAndView verify4(Person p) {
		ModelAndView mv=new ModelAndView();
		mv.addObject("person", p);
		mv.setViewName("loggedIn");
		return mv;
	}
	
}
