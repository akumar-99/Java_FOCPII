import java.util.*;
class Address {
	String line1;
	String line2;
	String city;
	String state;
	int pinCode;

	Address() {
		line1 = "";
		line2 = "";
		city = "";
		state = "";
		pinCode = 0;
	}

	void display() {
		System.out.println("ADDRESS\t:\t" + line1);
		System.out.println("\t\t\t" + line2);
		System.out.println("\t\t\t" + city);
		System.out.println("\t\t\t" + state);
		System.out.println("\t\t\t" + pinCode);
	}
}
