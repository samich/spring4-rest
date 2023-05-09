package com.example.spring4rest;

public class Course {
	
	private int courseId;
	private String courseName;
	private String courseAuthor;
	
	public Course(int courseId, String courseName, String courseAuthor) {
		
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseAuthor = courseAuthor;
		
	}
	
	public int getCourseId() {
		return courseId;
	}
	
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	public String getCourseAuthor() {
		return courseAuthor;
	}
	
	public void setCourseAuthor(String courseAuthor) {
		this.courseAuthor = courseAuthor;
	}

}
