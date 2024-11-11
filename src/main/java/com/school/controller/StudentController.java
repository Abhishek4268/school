package com.school.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.school.entity.StudentEntity;
import com.school.response.Response;
import com.school.service.ServiceStudent;

@RestController
public class StudentController {

	@Autowired
	ServiceStudent serviceStudent;
	
	@GetMapping("/api/student/all")
	public List<StudentEntity> getAll()
	{	
		return serviceStudent.serviceGetAll();
	}

	@PostMapping("/api/student/add")
	public void addData(@RequestBody List<StudentEntity> studententity) {
		serviceStudent.addAll(studententity);
	}

	@GetMapping("/api/innerjoin")
	public List<Response> innerjoin(){
		return serviceStudent.commonDataInEntity();
	}
	
	
	}
	
	
	
	
	
	

