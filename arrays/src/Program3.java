import java.util.Scanner;
public class Program3 {
    public static void main(String[ ] args) {
        int arr[]=new int [5];
        int tempInput;  //t
        int i;          //couter for  
        int j;          //counter for checking duplicate entry 
        int k;          //counter for printing
        int noOfVariables = 0;
        boolean flag = false;  
        Scanner input = new Scanner(System.in); 
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
        System.out.print("The five unique values are ");
        for(i=0;i<5;i++)
        {
            System.out.print(arr[i] + " ");
        }       
    }
}