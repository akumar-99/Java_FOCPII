import java.util.*;
class Qualification {
	String qualName;
	String university;
	String institute;
	float cgpa;

	Qualification() {
		qualName = "";
		university = "";
		institute = "";
		cgpa = 0.0f;
	}

	void display() {
		System.out.println("QUALIFICATION\t:\t" + qualName);
		System.out.println("\t\t\t" + university);
		System.out.println("\t\t\t" + institute);
		System.out.println("\t\t\t" + cgpa);
	}
}