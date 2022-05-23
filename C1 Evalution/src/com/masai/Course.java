package com.masai;

public class Course {
	int courseId = 5514;
	String courseName = "fw_17";
	int courseFee  = 1500;
	String username = "Admin";
	String password = "1234" ;
	
	void displayCourseDetails() {
		if(username=="Admin"&&password=="1234") {
			System.out.println("valid Username or password");
		}
		else {
			System.out.println("Invalid Username or password");
		}
		
	}
	void authenticate() {
		this.username = "Admin";
		this.password = "1234";
		
	}


}
