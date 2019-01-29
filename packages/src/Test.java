import java.util.*;
class Shape {
	void display() {
		System.out.println("Inside Shape Class");
	}
}

class Rectangle extends Shape {
	@Override
	void display() {
		System.out.println("Inside Rectangle Class");
	}
}

class Square extends Shape {
	@Override
	void display() {
		System.out.println("Inside Square Class");
	}
}

class Circle extends Shape {
	@Override
	void display() {
		System.out.println("Inside Circle Class");
	}
}

public class Test {
	public static void main(String[] args) {
		Shape s[] = new Shape[10];
		char choice = 'r';
		int i = 0;
		Scanner scn = new Scanner(System.in);
		while(choice != 'q' && i < 10) {
			System.out.print("Enter your choice : ");
			choice = scn.next().charAt(0);
			switch(choice) {
				case 'r':	s[i] = new Rectangle();
							break;
				case 's':	s[i] = new Square();
							break;
				case 'c':	s[i] = new Circle();
							break;
				default :	choice = 'q';
							break;
			}
			i++;
		}
		System.out.println("Your choices : ");
		for(i = 0; i<s.length ; i++) {
			System.out.println("Choice " + (i+1));
			if(s[i] instanceof Rectangle) {
				System.out.println("Choice Rectangle");
				s[i].display();
			} else if(s[i] instanceof Square) {
				System.out.println("Choice Square");
				s[i].display();
			} else if(s[i] instanceof Circle) {
				System.out.println("Choice Circle");
				s[i].display();
			}
			System.out.println("");
		}
	}
}