package com.ncu.assignment;
import java.util.*;

public class Student {
	String firstName;
	String lastName;
	Address addr;
	String dob;		//Date of Birth
	String[] skills;
	Qualification[] qual;
	Project[] projects;
	String eMail;
	String contactNo;

	public Student(String firstName, String lastName, Address addr, String dob, String[] skills, Qualification[] qual, Project[] projects, String eMail, String contactNo) {		//lengths :: s-skills, q-qual, p-projects
		this.firstName = firstName;
		this.lastName = lastName;
		this.addr = addr;
		this.dob = dob;		//Date of Birth
		this.skills = skills;
		this.qual = qual;
		this.projects = projects;
		this.eMail = eMail;
		this.contactNo = contactNo;
	}

	public Student(String firstName, String lastName, Address addr, String dob, String[] skills, Qualification[] qual, String eMail, String contactNo) {		//lengths :: s-skills, q-qual, p-projects
		this.firstName = firstName;
		this.lastName = lastName;
		this.addr = addr;
		this.dob = dob;		//Date of Birth
		for (int i=0; i<skills.length; i++) {
			this.skills[i] = skills[i];
		}
		for (int j=0; j<qual.length; j++) {
			this.qual[j] = qual[j];
		}
		this.eMail = eMail;
		this.contactNo = contactNo;
	}

	public void display() {		
		System.out.println("");
		System.out.println("STUDENT DETAILS");
		System.out.println("NAME\t:\t" + firstName + " " + lastName);
		addr.display();
		System.out.println("DATE OF BIRTH\t:\t" + dob);
		System.out.println("SKILLS\t::");
		for(int i=0; i<skills.length; i++) {
			System.out.println(skills[i]);
		}
		for(int i=0; i<qual.length; i++) {
			qual[i].display();
		}
		for(int i=0; i<projects.length; i++) {
			projects[i].display();
		}
		
		System.out.println("E-MAIL\t:\t" + eMail);
		System.out.println("CONTACT NO.\t:\t" + contactNo);

	}
}
