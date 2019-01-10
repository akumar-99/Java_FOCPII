import java.util.Scanner;
public class Program3 {    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Input decimal number: ");
        double x = input.nextDouble(); //1st Decimal Number
        System.out.print("Input another decimal number: ");
        double y = input.nextDouble(); //2nd Decimal Number
        x = Math.round(x * 1000); //Multiplied to round of 4th decimal place
        x = x / 1000;             //converted back to same float after round off
        y = Math.round(y * 1000);
        y = y / 1000;
        if (x == y)
        {
            System.out.println("Same up to three decimal places");
        }
        else
        {
            System.out.println("Different");
        }
    }
}