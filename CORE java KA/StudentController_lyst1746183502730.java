package com.tka.controller;

import com.tka.entity.Student;
import com.tka.service.StudentService;

public class StudentController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s=new Student(1,"Gaurav",90.0f);
		Student ustudent=StudentService.updatePer(s);
		System.out.println(ustudent);
	}

}
