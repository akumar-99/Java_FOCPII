import java.util.Scanner;
import java.lang.Math;
public class Quadratic_Equation
{
    public static void main(String[] args) 
      {
        int a; //Coefficient of x^2
        int b; //Coefficient of x
        int c; //Constant
        double root1, root2, d; 
        Scanner input = new Scanner(System.in);
        System.out.println("Given quadratic equation:ax^2 + bx + c");
        System.out.print("Enter a:");
        a = input.nextInt();
        System.out.print("Enter b:");
        b = input.nextInt();
        System.out.print("Enter c:");
        c = input.nextInt();
        System.out.println("Given quadratic equation:" + a + "x^2 + " + b + "x + " + c);
        d = b * b - 4 * a * c;
        if (d > 0)
        {
            System.out.println("Real and Unequal Roots");
            root1 = ( - b + Math.sqrt(d)) / (2 * a);
            root2 = ( - b - Math.sqrt(d)) / (2 * a);
            System.out.println("First root is: " + root1);
            System.out.println("Second root is: " + root2);
        }
        else if (d == 0)
        {
            System.out.println("Real and Equal Roots");
            root1 = ( - b + Math.sqrt(d)) / (2 * a);
            System.out.println("Root: " + root1);
        }
        else
        {
            System.out.println("Roots are imaginary");
        }
    }
}