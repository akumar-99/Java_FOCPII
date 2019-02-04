package com.ncu.assignment.main;
import com.ncu.assignment.*;
import com.ncu.assignment.exception.*;
import java.util.*;
class StudentDriver {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String[] responsibilities;

		System.out.println("");
		System.out.println("ASSIGNMENT 1");
		System.out.println("ENTER YOUR DETAILS");
		System.out.print("Enter your first name\t:\t");
		String fName = input.nextLine();
		System.out.print("Enter your last name\t:\t");
		String lName = input.nextLine();

		System.out.println("");
		System.out.println("Enter your Address Details\t::\t");
		System.out.print("Enter line1\t:\t");
		String line1 = input.nextLine();
		System.out.print("Enter line2\t:\t");
		String line2 = input.nextLine();
		System.out.print("Enter city\t:\t");
		String city = input.nextLine();
		System.out.print("Enter state\t:\t");
		String state = input.nextLine();
		System.out.print("Enter pincode\t:\t");
		int pin = input.nextInt();

		Address addr = new Address(line1, line2, city, state, pin);

		System.out.println("");
		input.nextLine();
		System.out.print("Enter Date (dd/mm/yyyy)\t:\t");
		String date = input.nextLine();
		System.out.print("Enter number of skills\t:\t");
		int nSkills = input.nextInt();
		String skills[] = new String[nSkills];
		if (nSkills > 0) {
			input.nextLine();
			for (int i=0; i<nSkills; i++) {
				System.out.print("SKILL [" + (i+1) + "]\t:\t");
				skills[i] = input.nextLine();
			}
		}
		System.out.print("Enter number of qualifications\t:\t");
		int nQuals = input.nextInt();
		Qualification qual[] = new Qualification[nQuals];
		if (nQuals > 0) {
			for (int i=0; i<nQuals; i++) {
				input.nextLine();
				System.out.print("Enter qualification name\t:\t");
				String qualName = input.nextLine();
				System.out.print("Enter university name\t:\t");
				String university = input.nextLine();
				System.out.print("Enter institute name\t:\t");
				String institute = input.nextLine();
				System.out.print("Enter cgpa\t:\t");
				float cgpa = input.nextFloat();
				qual[i] = new Qualification(qualName, university, institute, cgpa);

			}
		}
		System.out.print("Enter number of projects\t:\t");
		int nProjects = input.nextInt();
		Project project[] = new Project[nProjects];
		if (nProjects > 0) {
			for (int i=0; i<nProjects; i++) {
				input.nextLine();
				System.out.print("Enter project name\t:\t");
				String name = input.nextLine();
				System.out.print("Enter start date\t:\t");
				String sDate = input.nextLine();
				System.out.print("Enter end date\t:\t");
				String eDate = input.nextLine();
				System.out.print("Enter role\t:\t");
				String role = input.nextLine();
				System.out.print("Enter number of responsibilities\t:\t");
				int nResp = input.nextInt();
				responsibilities = new String[nResp];	
				for (int j=0; j<nResp; j++) {
					responsibilities[j] = input.nextLine();
				}
				project[i] = new Project(name, sDate, eDate, role, responsibilities);

			}
		}
		input.nextLine();
		System.out.print("Enter E-Mail\t:\t");
		String eMail = input.nextLine();
		System.out.print("Enter Contact Number\t:\t");
		String contactNo = input.nextLine();
		Student s1 = new Student(fName, lName, addr, date, skills, qual, project, eMail, contactNo);
		s1.display();
	}
}
