import java.util.*;
public class PointTest {
	public static void main(String[] args) {
		double x;
		double y;
		Scanner input = new Scanner(System.in);
		Point p1 = new Point();
		Point p2 = new Point();

		System.out.println("POINT 1 :: ");
		System.out.print("Enter x :: ");
		x = input.nextDouble();
		System.out.print("Enter y :: ");
		y = input.nextDouble();
		p1 = new Point(x,y);

		System.out.println("POINT 2 :: ");
		System.out.print("Enter x :: ");
		x = input.nextDouble();
		p2.setX(x);
		System.out.print("Enter y :: ");
		y = input.nextDouble();
		p2.setY(y);

		System.out.println("POINT 1 :: " + p1.getX() + ", " + p1.getY());
		System.out.println("POINT 2 :: " + p2.getX() + ", " + p2.getY());

		double distance = p1.Distance(p2);
		System.out.println("DISTANCE :: " + distance);
	}	
}