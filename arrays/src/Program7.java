import java.util.*;
class Program7 {
    static Scanner input = new Scanner(System.in);
    static int arr[] = new int[5];
    static int arrCopy[] = new int[5];

    static void getInput() {
        //input from user
        for(int i=0; i<5; i++){
            System.out.print("Enter the element [" + (i+1) + "] : ");
            arr[i] = input.nextInt();
        }
    }

    static void print() {
        System.out.print("Array : ");
        for(int i=0; i<5; i++){
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }

    static void sum() {            //Sum of all elements
        int sum = 0;
        for(int i=0; i<5; i++){
            sum += arr[i];
        }
        System.out.println("Sum : " + sum);
    }

    static void sort() {
        for(int i=0; i<5; i++){
            arrCopy[i] = arr[i];
        }
        int temp;  
        for (int i=0; i<5; i++) {  
            for (int j=i+1; j<5; j++) {  
                if (arrCopy[i] > arrCopy[j]) {  
                    temp = arrCopy[i];  
                    arrCopy[i] = arrCopy[j];  
                    arrCopy[j] = temp;  
                }  
            }  
        }  
    }

    static void largestNumber() {
        sort();
        System.out.println("Largest Number : " + arrCopy[4]);
    }  
    
    static void smallestNumber() {
        sort();
        System.out.println("Smallest Number : " + arrCopy[0]);
    }

    static void largest2Number() {  //2nd largest number
        sort();
        System.out.println("2nd Largest Number : " + arrCopy[arr.length-2]);
    }

    static void alternateSum() {    //alternate elements sum
        int sum1 = 0;
        int sum2 = 0;
        for(int i=0; i<5; i++) {
            if (i%2 == 0) {
                sum1 += arr[i];
            }
            else {
                sum2 += arr[i];
            }
        }
        System.out.println("Sum1 : " + sum1);
        System.out.println("Sum2 : " + sum2);
    }

    static void evenCount() {    //Count of even numbers
        int count = 0;
        for(int i=0; i<5; i++) {
            if (arr[i]%2 == 0) {
                count++;
            }
        }
        System.out.println("Count of Even Numbers: " + count);

    }

    static void occurence() {    //occurence and its frquency
        System.out.println("Enter a number to check occurence and frequency");
        int temp = input.nextInt();
        int count = 0;
        for(int i=0; i<5; i++) {
            if (arr[i] == temp) {
                count++;
            }
        }
        if (count > 0) {
            System.out.println("Count of " + temp + ": " + count);
        }
        else {
            System.out.println("Number not in array");
        }
    }
    public static void main(String args[]){
        getInput();
        System.out.println("PRESS THE KEY CORRESPONDING TO THE FUNCTION ::");
        System.out.println("1. Print all elements");
        System.out.println("2. Sum of all elements");
        System.out.println("3. Largest Number in array");
        System.out.println("4. Smallest Number in array");
        System.out.println("5. Second Largest Number in array");
        System.out.println("6. Sum of alternate numbers");
        System.out.println("7. Count of even numbers");
        System.out.println("8. Occurence and Frequency");
        int flag;
        char counter;
        do {
            System.out.println();
            System.out.print("COMMAND  ::  ");
            flag = input.nextInt();
            switch (flag) {
                case 1  :   print();
                            break;
                case 2  :   sum();
                            break;
                case 3  :   largestNumber();
                            break;
                case 4  :   smallestNumber();
                            break;
                case 5  :   largest2Number();
                            break;
                case 6  :   alternateSum();
                            break;
                case 7  :   evenCount();
                            break;
                case 8  :   occurence();
                            break;
                default :   System.out.println("Invalid Command");
                            break;
            }
            System.out.println("Press N to exit else continue");
            counter = input.next().charAt(0);
            if (counter == 'n' || counter == 'N') {
                break;
            }
        } while(true);
    }
}