package com.sapient.tdi.anno.domain;

import com.sapient.tdi.anno.CodeReview;


@CodeReview(authors = { "Amandeep" }, changeDate = "28 Nov, 2014", reviewDate="27 Nov, 2014") 
public class Employee {
	private Long id;
	private String firstName;
	private String lastName;	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Override
	public String toString() { 
		return String.format("id - %d, First name - %s, Last name - %s", id, firstName, lastName);//
	}
	
	

}
