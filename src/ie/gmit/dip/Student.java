package ie.gmit.dip;

import java.util.*;

public class Student {
	private String sid;
	private String firstName;
	private String surName;
	private Date dob;
	private Course course;
	private Address address;

	public Student(String id) {
		this.sid = id;
	}

	public Student(String id, String firstName, String surName, Date dob) {
		this(id);
		this.firstName = firstName;
		this.surName = surName;
		this.dob = dob;
	}

	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", firstName=" + firstName + ", surName=" + surName + ", dob=" + dob + "]";
	}
	
	

}
