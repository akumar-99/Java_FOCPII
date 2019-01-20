import java.util.*;
class Project{
	String name;
	Date startDate;
	Date endDate;
	String role;
	String[] responsibilities;

	Project(int s) {		//s - responsibilities length
		name = "";
		startDate = new Date();
		endDate = new Date();
		role = "";
		responsibilities = new String[s];
	}

	void display(int r) {			//loop - r=responsibilities
		System.out.println("PROJECT NAME\t:\t" + name);
		System.out.println("START DATE\t:\t" + startDate);
		System.out.println("END DATE\t:\t" + endDate);
		System.out.println("ROLE\t:\t" + role);
		System.out.println("RESPONSIBILTIES\t:\t" + responsibilities);
		for(int i=0; i<r; i++) {
			System.out.println(responsibilities[i]);
		}
	}
}
