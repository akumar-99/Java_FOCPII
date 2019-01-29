import java.util.*;
class Address {
	String line1;
	String line2;
	String city;
	String state;
	int pinCode;

	Address(String line1, String line2, String city, String state, int pinCode) {
		this.line1 = line1;
		this.line2 = line2;
		this.city = city;
		this.state = state;
		this.pinCode = pinCode;
	}

	void display() {
		System.out.println("ADDRESS\t::\t");
		System.out.println("LINE 1\t:\t" + line1);
		System.out.println("LINE 2\t:\t" + line2);
		System.out.println("CITY\t:\t" + city);
		System.out.println("STATE\t:\t" + state);
		System.out.println("PINCODE\t:\t" + pinCode);
	}
}
