package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {
	@Autowired
	private StudentDao studentDao;
	@RequestMapping("/")
	public String getPage() {
		return "index.jsp";
	}
	
	@RequestMapping("/addStudent")
	public String addStudent(Student s) {
		studentDao.save(s);
		return "index.jsp";
	}
	
}
