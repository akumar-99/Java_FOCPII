import java.util.*;
class Program2 {
    static Scanner in = new Scanner(System.in);
    static int num[] = new int[10];
    static int rowCounter = 0;
    static int searchElement = 0;
    static int searchIndex = -1;
    static void getInput(){
        //input from user
        for(rowCounter=0;rowCounter<num.length;rowCounter++){
            System.out.print("Enter the element [" + (rowCounter+1) + "] : ");
            num[rowCounter] = in.nextInt();
            System.out.println();
        }
    }

    static void searchElements(){
        //Ask for element to be searched
        System.out.print("Enter the Element to be searched : ");
        searchElement = in.nextInt();
    }

    static void displayElement(){
        //print the array
        System.out.println("Elements in the array are : ");
        for(rowCounter=0;rowCounter<num.length;rowCounter++){
            System.out.print(num[rowCounter] + "\t");
        }
        System.out.println();
    }

    static void findElement(){
        //search for the element
        boolean flag = false;
        for(rowCounter=0; rowCounter<num.length; rowCounter++){
            if(num[rowCounter] == searchElement){
                flag = true;
                searchIndex = rowCounter;
                break;
            }
        }
        if(flag) {
            System.out.println("Element found at index location : " + (searchIndex));
        }
        else {
            System.out.println("Element found at index location : " + (searchIndex));
        }
    }

    public static void main(String args[]){
        getInput();
        searchElements();
        displayElement();
        findElement();
    }
}