import java.util.*;

class Student {
	String firstName;
	String lastName;
	Address addr;
	Date dob;		//Date of Birth
	String[] skills;
	Qualification[] qual;
	Project[] projects;
	String eMail;
	String contactNo;

	Student(int s, int q, int p) {		//lengths :: s-skills, q-qual, p-projects
		firstName = "";
		lastName = "";
		addr = new Address();
		dob = new Date();		//Date of Birth
		skills = new String[s];
		qual = new Qualification[q];
		projects = new Project[p];
		eMail = "";
		contactNo = "";
	}

	Student(int s, int q) {		//lengths :: s-skills, q-qual
		firstName = "";
		lastName = "";
		addr = new Address();
		dob = new Date();		//Date of Birth
		skills = new String[s];
		qual = new Qualification[q];
		eMail = "";
		contactNo = "";
	}

	void display(int s, int q, int p) {		//lengths :: s-skills, q-qual, p-projects
		System.out.println("NAME\t:\t" + firstName + " " + lastName);
		addr.display();
		System.out.println("DATE OF BIRTH\t:\t" + dob);
		System.out.println("SKILLS\t:" + skills);
		for(int i=0; i<s; i++) {
			System.out.println(skills[i]);
		}
		qual[q].display();
		projects[p].display();
		System.out.println("E-MAIL\t:\t" + eMail);
		System.out.println("CONTACT NO.\t:\t" + contactNo);

	}
}
