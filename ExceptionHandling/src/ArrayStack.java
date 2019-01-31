import java.util.*;
import java.lang.*;
class ArrayStack {
    Scanner input = new Scanner(System.in);
    int arr[];
    int top;    //index of top element
    int size;   //total size of stack
    int len;    //number of var in stack
    
    public ArrayStack(int n)
    {
        size = n;
        len = 0;
        arr = new int[size];
        top = -1;
    }

    boolean isEmpty()   //check empty stack
    {
        return top == -1;
    }

    boolean isFull()    //check full stack
    {
        return top == size-1 ;        
    }

    int spaceLeft()        //space left in stack
    {
        return size-len;
    }

    void push()
    {
        try {
            if(top+1>= size) 
                throw new Exception ("Stack full");
            if(top+1 < size ) {
                System.out.println("Enter integer element to push");
                int i = input.nextInt();
                arr[++top] = i;
                len++ ;
            }   
        }   catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }

    void pop()
    {   
        try {
            if(isEmpty())
                throw new Exception ("Empty Stack");
            else {
                len--;
                System.out.println("arr[top--]"); 
            }
        }   catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }    
}
