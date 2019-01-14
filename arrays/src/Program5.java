import java.util.*;
public class Program5 {
    public static void main(String[] args) {
        int arr1[] = new int[5];
        int arr2[] = new int[5];
        int arr3[] = new int[10];
        int i = 0;      //ARRAY1 - COUNTER
        int j = 0;      //ARRAY1 - COUNTER
        int index = 0;  //merged array - COUNTER
        Scanner input = new Scanner(System.in);

        System.out.println("Enter array 1 (10 elements) : ");
        while (i < arr1.length) {
            arr1[i] = input.nextInt();
            i++;
        }
        System.out.println("Enter array 2 (10 elements) : ");
        while (j < arr1.length) {
            arr2[j] = input.nextInt();
            j++;
        }

        i = 0;
        j = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {      
                arr3[index++] = arr1[i++];
            }
            else {
                arr3[index++] = arr2[j++];               
            }
        }
     
        while (i < arr1.length) { 
            arr3[index++] = arr1[i++];
        }
        while (j < arr2.length) {   
            arr3[index++] = arr2[j++];
        }

        index = 0;
        System.out.print("Merged Array : ");
        while (index < arr3.length) {
            System.out.print(arr3[index] + "\t");
            index++;
        }

    }
}
     
     
  
