import java.util.Scanner;
public class Program7
{
    public static void main(String[] args) {
	    int rows;	//Number of rows
	    int i, j, k;		//for loops
	    int number;		//for start of Pascal's triangle
	    char ch; 	//for re run
		Scanner input = new Scanner(System.in);
		do {
			System.out.print("Enter Number of Rows : ");
			rows = input.nextInt();
			for(i=0; i<rows; i++)
			{
				for(j=rows; j>i; j--)
				{
					System.out.print(" ");
				}
	            number = 1;
				for(k=0; k<=i; k++)
				{
					 System.out.print(number + " ");
	                 number = number * (i-k) / (k+1);
				}
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