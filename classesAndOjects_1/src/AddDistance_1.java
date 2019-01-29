import java.util.*;
public class AddDistance_1
{
	public static void main(String []s)
	{
		Scanner input = new Scanner(System.in);
		Distance_1 d1 = new Distance_1();
		Distance_1 d2;
		Distance_1 d3 = new Distance_1();
		
		System.out.println("Enter first distance: ");
		System.out.print("Enter feet: ");
		float feet1 = input.nextFloat();
		System.out.print("Enter inches: ");
		float inches1 = input.nextFloat();
		// d1.setDistance(feet1, inches1);

		System.out.println("Enter second distance: ");
		System.out.print("Enter feet: ");
		float feet2 = input.nextFloat();
		System.out.print("Enter inches: ");
		float inches2 = input.nextFloat();
		// d2 = new Distance_1(feet2, inches2);

		d3 = d3.Sum(feet1, feet2, inches1, inches2);
		System.out.println("Feet : "+ d3.getFeet() + "	Inches : "+ d3.getInches());
		
	}
}