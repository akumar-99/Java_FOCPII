import java.util.*;
class Project{
	String name;
	String startDate;
	String endDate;
	String role;
	String[] responsibilities;

	Project(String name, String startDate, String endDate, String role, String[] responsibilities) {
		this.name = name;
		this.startDate = startDate;
		this.endDate = endDate;
		this.role = role;
		this.responsibilities = responsibilities;

	}

	void display() {			
		System.out.println("PROJECT NAME\t:\t" + name);
		System.out.println("START DATE\t:\t" + startDate);
		System.out.println("END DATE\t:\t" + endDate);
		System.out.println("ROLE\t:\t" + role);
		System.out.println("RESPONSIBILTIES\t::");
		for(int i=0; i<responsibilities.length; i++) {
			System.out.println(responsibilities[i]);
		}
	}
}
