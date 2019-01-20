import java.util.Scanner;
class TwoDimensionalSales {
	Scanner input = new Scanner(System.in);
	int sales[][] = new int[5][4]; 	//product sold by each salesPerson;
	int sPerson;	//SalesPerson Number
	int product;	//Product Number
	int amt;		//number of product sold
	int row, col;	//loop counters table
	int personTotal[] = new int[4];	// total for each salesperson
	int productTotal = 0;			//total for each product
   
   	public void Sales()
   	{
       	System.out.print ("Enter sales person number (-1 to end) : ");
	  	sPerson = input.nextInt();
	  
	  	while (sPerson != -1)
	  	{
			System.out.print("Enter product number: ");
	        product = input.nextInt();
	       	System.out.print("Enter sales amount: ");
	        amt = input.nextInt();
			
			if (sPerson>= 1 && sPerson<=4 && product>=1 && product<=5 && amt>=0)
				sales[product-1][sPerson-1] += amt;

	        if (product>5 || sPerson>4 || amt<0)  
			    System.out.print("Invalid input!\n");
			
			System.out.print("Enter sales person number (-1 to end): ");
			sPerson = input.nextInt(); 
	  	}
	  
	  	//OUTPUT
	  	//Using printf functions of C
	  	for(col = 0; col < 4; col++)
	     	personTotal[col] = 0;
		 
	  	System.out.printf("%7s%13s%13s%13s%13s%13s\n", "Product|", "Salesperson 1|", "Salesperson 2|", "Salesperson 3|", "Salesperson 4|","Total");
	
	  	for(row = 0; row < 5; row++)
	  	{
	     	productTotal = 0;
		 	System.out.printf("%7d|", (row + 1));
		 
		 	for(col = 0; col < 4; col++)
		 	{
		    	System.out.printf("%13d|", sales[row][col]);
				productTotal += sales[row][col];
				personTotal[col] += sales[row][col];
		 	}
		 	System.out.printf("%13d|\n", productTotal);
		}
	  	System.out.printf("%7s|", "Total");
	  	for(col = 0; col < 4; col++)
	     	System.out.printf("%13d|", personTotal[col]);
	  	
	  	System.out.println();
	}
}
public class Program8 {
   	public static void main(String[] args)
   	{
      	TwoDimensionalSales sales = new TwoDimensionalSales();
	  	sales.Sales();
   	}
}