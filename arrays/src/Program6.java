import java.util.*;
public class Program6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] arr = new int[10][5];   //columns = width = 5
        int nRows;
        int nColumns;
        System.out.print("Enter number of rows : ");
        nRows = input.nextInt();
        System.out.print("Enter number of columns : ");
        nColumns = input.nextInt();
        System.out.println("Total elements : " + (nRows*nColumns));
        System.out.println("Enter 2-digit numbers : ");
        for(int i=0; i<nRows; i++) {
            for(int j=0; j<nColumns; j++) {
                int temp = input.nextInt();
                if (temp < 100 && temp > -100) {
                    arr[i][j] = temp;
                }
                else {
                    j--;
                }
            }
        }

        System.out.println("Entered 2-D Array is : ");
        for(int i=0; i<nRows; i++) {
            for(int j=0; j<nColumns; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

        for(int i=0; i<nRows; i++) {
            for(int j=0; j<nColumns; j++) {
                if (arr[i][j]%2 != 0) {
                    arr[i][j] *= 2;
                }
                else {
                    continue;
                }
            }
        }

        System.out.println("Updated 2-D Array is : ");
        for(int i=0; i<nRows; i++) {
            for(int j=0; j<nColumns; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }


    }
}
     
     
  
