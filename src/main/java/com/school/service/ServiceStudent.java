package com.school.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.entity.StudentEntity;
import com.school.repository.SchoolRepository;
import com.school.response.Response;

@Service
public class ServiceStudent {

	
	@Autowired
	SchoolRepository schoolRepository;
	
	
	public List<StudentEntity> serviceGetAll() {
		return  schoolRepository.findAll();
	}


	public void addAll(List<StudentEntity> studententity) {
	schoolRepository.saveAll(studententity);
	}
	
	
	//inner join data
	public List<Response> commonDataInEntity(){
		return schoolRepository.commonData();
	}
	
	
	
	
	
	
}
