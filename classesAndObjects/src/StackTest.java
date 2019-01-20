import java.util.*;
public class StackTest
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);        
        System.out.println("Stack Test\n");
        Stack stk = new Stack(10);  //size of stack
        char ch;
        do {
            System.out.println("\nStack Operations");
            System.out.println("1. push");
            System.out.println("2. pop");
            System.out.println("3. check empty");
            System.out.println("4. check full");
            System.out.println("5. get length");
            int choice = input.nextInt();
            switch (choice)
            {
            case 1 : stk.push();
                    break;                         
            case 2 : stk.pop();
                    break;                         
            case 3 : 
                System.out.println("Empty status = " + stk.isEmpty());
                break;                
            case 4 :
                System.out.println("Full status = " + stk.isFull());
                break;                 
            case 5 : 
                System.out.println("Space Left = " + stk.spaceLeft());
                break;                         
            default : 
                System.out.println("Wrong Entry \n ");
                break;
            }
            System.out.println("\nPress Y to continue else exit \n");
            ch = input.next().charAt(0);
        } while (ch == 'Y'|| ch == 'y');                 
    }
}