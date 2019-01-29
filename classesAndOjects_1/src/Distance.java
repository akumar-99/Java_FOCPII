import java.util.*;
class Distance
{
	private float feet;
	private float inches;

	Distance() {
		feet = 0;
		inches = 0;
	}

	Distance(float feet, float inches) {
		this.feet = feet;
		this.inches = inches;
	}
	
	void setFeet(float feet) {
		this.feet = feet;
	}

	void setInches(float inches) {
		this.inches = inches;
	}

	//Asked by question to overload
	void setDistance(float feet, float inches) {	
		this.feet = feet;
		this.inches = inches;
	}

	void getFeet() {
		System.out.println("Feet : "+ feet);
	}

	void getInches() {
		System.out.println("Inches : "+ inches);
	}
	
	void Sum(Distance d1, Distance d2)
	{
		inches = d1.inches + d2.inches;
		feet = (int)(d1.feet + d2.feet + (inches/12));
		inches = (int)(inches%12);
		System.out.print("SUM :: ");
		System.out.println("Feet : "+ feet + "	Inches : "+ inches);
	}
}