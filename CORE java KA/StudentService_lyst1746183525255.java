package com.tka.service;

import com.tka.entity.Student;

public class StudentService {
	
	public static Student updatePer(Student s)
	{
		//getter is used for retrieving the old percentage
		//setter is used for updating the new percentage
		s.setStudper(s.getStudper()+5);
		return s;
	}

}
