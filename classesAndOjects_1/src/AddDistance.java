import java.util.*;
public class AddDistance
{
	public static void main(String []s)
	{
		Scanner input = new Scanner(System.in);
		Distance d1;
		Distance d2;
		Distance d3 = new Distance();
		
		System.out.println("Enter first distance: ");
		System.out.print("Enter feet: ");
		float feet1 = input.nextFloat();
		System.out.print("Enter inches: ");
		float inches1 = input.nextFloat();
		d1 = new Distance(feet1, inches1);

		System.out.println("Enter second distance: ");
		System.out.print("Enter feet: ");
		float feet2 = input.nextFloat();
		System.out.print("Enter inches: ");
		float inches2 = input.nextFloat();
		d2 = new Distance(feet2, inches2);

		
		d3.Sum(d1,d2);
	}
}