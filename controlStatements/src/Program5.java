import java.util.Scanner;
import java.lang.Math;
public class Program5 {
    public static void main (String[] args) { 
        Scanner input = new Scanner (System.in);
        int i; 			//for loop
        int n;			//number of terms
        double x;		//for equation
        double sum=1;	//for result of equation  
        System.out.println("EQUATION :: 1+x+x^2/2+x^3/3+...+x^n/n");
        System.out.println("Enter value of x :");
        x = input.nextDouble();
        System.out.println("Enter number of terms,n :");
        n = input.nextInt();
        for (i=1; i<=n; ++i){
			sum += Math.pow(x,i) / i;
        }
        System.out.println("Sum of the EQUATION = " + sum);
    }
}