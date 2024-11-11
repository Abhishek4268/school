package com.school.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="school_contact_details")
public class SchoolContactdetailsEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="student_id")
	private int studentid;
	@Column(name="phone")
	private int phone;
	@Column(name="isprimary")
	private char isPrimary;
	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public char getIsPrimary() {
		return isPrimary;
	}
	public void setIsPrimary(char isPrimary) {
		this.isPrimary = isPrimary;
	}
	
	//getters and setters
	
	
	
}
