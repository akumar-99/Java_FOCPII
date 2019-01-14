import java.util.Scanner;
public class Program4 {
    static int arr[]=new int [5];
    static int tempInput;  
    static int i;          //couter for  
    static int j;          //counter for checking duplicate entry 
    static int k;          //counter for printing
    static int noOfVariables = 0;  
    static boolean flag = false;   
    static Scanner input = new Scanner(System.in); 

    static void getInputAndCheck(){
        //input from user and check
        System.out.println("Enter 5 unique values between 10 & 100 : ");
        for(i=0; i<5; i++)
        {  
            tempInput = input.nextInt();
            if(tempInput>=10 && tempInput<=100)
            { 
                for(j=0; j<noOfVariables; j++)
                {
                    if(arr[j]==tempInput)  
                    flag = true;
                }
                if (flag)
                {
                    System.out.println("Duplicate value found retry");
                    flag = false;
                    i--;
                    continue;      
                }
                else
                {
                    arr[i]=tempInput;
                    noOfVariables++;
                }
            }
            else
            {
                System.out.println("Value must be in between 10 & 100");      
                i--;
            }   
        }
    }

    static void printElements(){
        //Print all elements
        System.out.print("The five unique values are ");
        for(i=0;i<5;i++)
        {
            System.out.print(arr[i] + " ");
        }     
    }

    
    public static void main(String[ ] args) {
        getInputAndCheck();
        printElements();   
    }
}