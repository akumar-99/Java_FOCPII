import java.util.Scanner;

public class Program9
{
   	public static void main(String[] args)
   	{
      	Scanner input = new Scanner(System.in);
		int grades[][] = new int[10][5];		//grades of each student in each subject
		int nSubjects = 0;					//no of subjects opted
		int nStudent = 0;					//Student number selected
		double avgStudent = 0.0;			//Average grade of a student
		double avgSubject[] = new double[5];			//Average of a subject
		int row;
		int col;

		System.out.print("Enter Student number (-1 to exit): ");	//Overwrite possible if rentered Student number
		nStudent = input.nextInt();
		while (nStudent != -1) {
			if (nStudent<-1 || nStudent>10) {
			System.out.println("Invalid Input");
			}
			else {
				System.out.print("Enter number of subject (2 to 5): ");	
				nSubjects = input.nextInt();
				if (nSubjects<2 || nSubjects>5) {
					System.out.println("Invalid Input");
				}
				else {
					System.out.println ("Enter Grades :: ");
					for (int i=0; i<nSubjects; i++) {
						System.out.print("Subject " + (i+1) + " : ");
						grades[nStudent-1][i] = input.nextInt();
					}
				}	
			}
			System.out.print("Enter Student number (-1 to exit): ");
			nStudent = input.nextInt();
		}

		//OUTPUT
	  	//Using printf functions of C
	  	// for(col = 0; col<5; col++)
	   //   	avgSubject[col] = 0;
		 
	  	System.out.printf("%7s%9s%9s%9s%9s%9s%15s\n", "Student|", "Subject 1|", "Subject 2|", "Subject 3|", "Subject 4|", "Subject 5|","Student Average");
		int nOfStudents = 0;
	  	for(row = 0; row<10; row++)
	  	{
	     	avgStudent = 0;
		 	System.out.printf("%7d|", (row + 1));
		 	for(col = 0; col<5; col++)
		 	{
		    	System.out.printf("%9d|", grades[row][col]);
				if (grades[row][col] != 0) {
					avgStudent += grades[row][col];
					nOfStudents = col;
				}
		 	}
		 	avgStudent = avgStudent/(nOfStudents+1);
		 	System.out.printf("%15f|\n", avgStudent);
		}

		for(col = 0; col<5; col++)
	  	{
	     	int i = 0;
		 	for(row = 0; row<10; row++)
		 	{
				if (grades[col][row] != 0) {
					avgSubject[row] += grades[row][col];
					i++;
				}
		 	}
		 	avgSubject[row] = avgSubject[row]/(i);
		}

	  	System.out.printf("%7s|", "Average");
	  	for(col = 0; col < 5; col++) {
	     	System.out.printf("%9f|", avgSubject[col]);
	  	}
	  	System.out.println();	
   	}
}