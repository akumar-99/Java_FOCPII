import java.util.*;
class Distance_1 {
	static private float feet;
	static private float inches;

	Distance_1() {
		feet = 0.0f;
		inches = 0.0f;
	}

	Distance_1(float feet, float inches) {
		this.feet = feet;
		this.inches = inches;
		System.out.print("DONE");
	}
	
	void setFeet(float feet) {
		this.feet = feet;
	}

	void setInches(float inches) {
		this.inches = inches;
	}

	// Asked by question to overload
	// static void setDistance(float feet1, float inches1) {	
	// 	feet = feet1;
	// 	inches = inches1;
	// }

	float getFeet() {
		return feet;
	}

	float getInches() {
		return inches;	
	}
	
	static Distance_1 Sum(float feet1, float feet2, float inches1, float inches2)
	{
		Distance_1 d3 = new Distance_1();
		d3.inches = inches1 + inches2;
		d3.feet = (int)(feet1 + feet2 + (d3.inches/12));
		d3.inches = (int)(d3.inches%12);
		return d3;
	}
}