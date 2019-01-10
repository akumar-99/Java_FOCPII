import java.util.Scanner;
public class Program2
{
    public static void main(String[] args) 
    {
        int no; //Number to check with 
        char ch;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Enter your number : ");
            no = input.nextInt();
            if (no ==1)
                System.out.println("January");
            else if (no==2)
                System.out.println("February");
            else if (no==3)
                System.out.println("March");
            else if (no==4)
                System.out.println("April");
            else if (no==5)
                System.out.println("May");
            else if (no==6)
                System.out.println("June");
            else if (no==7)
                System.out.println("July");
            else if (no==8)
                System.out.println("August");
            else if (no==9)
                System.out.println("September");
            else if (no==10)
                System.out.println("October");
            else if (no==11)
                System.out.println("November");
            else if (no==12)
                System.out.println("December");
            else if (no>12 || no<12)
                System.out.println("Sorry I need a number from 1-12.");
            System.out.print("Press Y to continue else any key to exit :");
            ch = input.next().charAt(0);
            } while (ch == 'Y' || ch == 'y');         
    }
}
