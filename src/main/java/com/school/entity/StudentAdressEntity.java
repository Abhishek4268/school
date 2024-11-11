package com.school.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="student_adress")
public class StudentAdressEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="studentadressid")
	private int studentAdressId;
	@Column(name="adress_line")
	private String adressLine1;
	@Column(name="adress_line2")
	private String adressLine2;
	@Column(name="city")
	private String city;
	@Column(name="state")
	private String state;
	@Column(name="zip")
	private Integer zip;
	@Column(name="studentid")
	private Integer studentId;
	
	//getter and setters
	public String getAdressLine1() {
		return adressLine1;
	}
	public int getStudentAdressId() {
		return studentAdressId;
	}
	public void setStudentAdressId(int studentAdressId) {
		this.studentAdressId = studentAdressId;
	}
	public void setAdressLine1(String adressLine1) {
		this.adressLine1 = adressLine1;
	}
	public String getAdressLine2() {
		return adressLine2;
	}
	public void setAdressLine2(String adressLine2) {
		this.adressLine2 = adressLine2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getZip() {
		return zip;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}
	
	//setters and getters
	
	
	
	
}
