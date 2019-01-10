import java.util.Scanner;
public class Program8 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int count;
        int count2;
        char ch;
        do {
            System.out.print("Input the number : ");
            int no = input.nextInt();  //Number of max alphabet from user
            count = 1;
            count2 = 1;
            ch = 'A';
            for (int i=1; i < (no*2); i++) 
            {
                for (int spc=no-count2; spc>0; spc--)   
                {
                    System.out.print(" ");  
                }
                if (i < no) 
                {
                    count2++;
                } 
                else 
                {
                    count2--;
                }
                for (int j=0; j<count; j++) 
                {
                    System.out.print(ch);    
                    if (j < count/2) 
                    {
                        ch++;
                    } 
                    else 
                    {
                        ch--;
                    }
                }
                if (i<no)
                {
                    count = count+2;
                } 
                else
                {
                    count = count-2;
                }
                ch = 'A';

                System.out.println();
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