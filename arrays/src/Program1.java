import java.util.*;
public class Program1 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int arr[] = new int[10];
        int sno;    //searchNumber
        boolean flag = false;
        int i;      //rowCounter
        int j = -1;      //searchLocation
        for (i=0; i<arr.length; i++) {  
            arr[i] = input.nextInt();
        }  
        System.out.print("Enter the number you wish to search : ");
        sno = input.nextInt();
        for (i=0; i<arr.length; i++) { 
            if (arr[i] == sno) {
                flag = true;
                j = i;
                break;
            }
            else {
                flag = false;
            }
        }
        System.out.print("ARRAY IS : "); 
        for (i=0; i<arr.length; i++) { 
            System.out.print(arr[i] + "\t");
        }  
        System.out.println(); 
        if (flag) {
            System.out.print("Index is : " + j);
        }
        else {
            System.out.print("Index is : " + j);
        }
    }
}