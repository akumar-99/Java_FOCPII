package com.ncu.assignment;
import java.util.*;
public class Qualification {
	String qualName;
	String university;
	String institute;
	float cgpa;

	public Qualification(String qualName, String university, String institute, float cgpa) {
		this.qualName = qualName;
		this.university = university;
		this.institute = institute;
		this.cgpa = cgpa;
	}

	public void display() {
		System.out.println("QUALIFICATION\t:\t");
		System.out.println("QUALIFICATION NAME\t:\t" + qualName);
		System.out.println("UNIVERSITY\t:\t" + university);
		System.out.println("INSTITUTE\t:\t" + institute);
		System.out.println("CGPA\t:\t" + cgpa);
	}
}