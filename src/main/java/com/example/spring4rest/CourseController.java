package com.example.spring4rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	
	@RequestMapping("/courses")
	public List<Course> getAllCourses(){
		
		Course course1 = new Course(1, "Learn AWS", "Udemy");
		Course course2 = new Course(2, "Azure Developer", "Coursera");
		Course course3 = new Course(3, "Google Cloud Engineer", "Linkedin Learning");
		
		List<Course> list = new ArrayList<>();
		list.add(course1);
		list.add(course2);
		list.add(course3);
		
		return list;		
	}

}
