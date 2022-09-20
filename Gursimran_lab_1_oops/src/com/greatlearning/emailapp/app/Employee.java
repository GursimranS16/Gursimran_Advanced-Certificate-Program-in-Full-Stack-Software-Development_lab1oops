package com.greatlearning.emailapp.app;
import java.util.Arrays;
import java.util.*;  

public class Employee {
 static String firstName;
	 static String lastName;
	  String dept;
	 String emailId;
	 String password;
	
	public Employee(String fname,String lname)
	{
		this.firstName=fname;
		this.lastName=lname;
	}

	public String getDeptt() {
		return dept;
	}

	public void setDeptt(String deptt) {
		this.dept = deptt;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public static String getFirstName() {
		return firstName;
	}

	public static void setFirstName(String firstName) {
		Employee.firstName = firstName;
	}

	public static String getLastName() {
		return lastName;
	}

	public static void setLastName(String lastName) {
		Employee.lastName = lastName;
	}
	
	
}
