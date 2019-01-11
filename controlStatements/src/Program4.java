import java.util.Scanner;
 
public class Program4 {
    public static void main (String[] args) { 
        Scanner input = new Scanner (System.in);
        char ch;    //for re running the code
        int no;     //number entered by the user
        int digit1; //1st digit of number
        int digit2; //2nd digit
        int digit3; //3rd digit
        int digit4; //4th digit
        int digit5; //5th digit   
        do {      
            System.out.print("Enter An Integeral Number Consisting of Five Digits : ");
            no = input.nextInt();
            digit5 = no % 10;
            digit4 = (no % 100)/10;
            digit3 = (no % 1000)/100;
            digit2 = (no % 10000)/1000;
            digit1 = no / 10000;
            if (no >= 10000 && no <= 99999)
            {
                System.out.println(digit1 + "   " + digit2 + "   " + digit3 + "   " + digit4 + "   " + digit5);
            }
            else
            {
                System.out.println("Integral number contains more or less digits than 5");
                continue;
            }
            
            System.out.print("Press N to EXIT else any key to continue :");
            ch = input.next().charAt(0);
            if ((ch == 'N') || (ch == 'n'))
            {
                break;
            }
        } while (true);
    }
}