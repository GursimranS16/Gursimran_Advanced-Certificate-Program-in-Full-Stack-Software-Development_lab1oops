package com.greatlearning.emailapp.app;

import java.util.Scanner;

public class RunnerClass {
	public static void main(String[] args) {
		  
	      final String[] department= {"Technical","Human Resources","Admin","Legal"};
	      System.out.println(" Enter your First Name");
	      Scanner s= new Scanner(System.in); 
	      String firstname= s.next(); 
	      System.out.println(" Enter your last Name");
	      Scanner s1= new Scanner(System.in);
	      String lastname= s1.next(); 
	      System.out.println("Choose you department from below list:");
	      for(int j=0; j<department.length; j++)
	      {
	          System.out.println(j+1 + "." + department[j]);
	      }
	      System.out.println(" Enter your Department Number:");
	      Scanner sc= new Scanner(System.in);
	      int departmentNumber= sc.nextInt();
	      String departmentName="new";
	      
	      
	      switch (departmentNumber) {
	      case 1:
	    	  departmentName= department[0];
	        break;
	      case 2:
	    	  departmentName= department[1];
	        break;
	      case 3:
	    	  departmentName= department[2];
	        break;
	      case 4:
	    	  departmentName= department[3];
	        break;
	    }
	      
	      Employee e=new Employee(firstname, lastname);
	      e.setDeptt(departmentName);
	      
	      CredentialService cs=new CredentialService();
	      String email= cs.generateEmail(firstname, lastname, departmentName);
	      e.setEmailId(email);
	      String pass= cs.generatePassword();
	      
	      e.setPassword(pass);
	      cs.showCredentials(e);
	      
	      
	   
	      
	      
		}
}
