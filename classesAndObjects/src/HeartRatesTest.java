import java.util.*;
public class HeartRatesTest {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        HeartRate h1[]=new HeartRate[2];
        String firstName = "";
        String lastName = "";
        int day = 0;
        int month = 0;
        int year = 0;
        for(int i=0; i<=1; i++)
        {
            System.out.print("Enter First Name: ");
            firstName = input.nextLine();
            System.out.print("Enter Last Name: ");
            lastName = input.nextLine();
            System.out.println("Enter BirthDate (dd-mm-yyyy): ");
            day=input.nextInt();
            month=input.nextInt();
            year=input.nextInt();

            h1[i]=new HeartRate(firstName, lastName, day, month, year);
        }

        for (int j=0; j<2; j++) {
            System.out.printf("Name : "+ firstName + " " + lastName);
            System.out.printf("Age in years: \n", h1[j].getAge());
            System.out.println("Maximum Heartrate: "+ h1[j].maxHeartRate());
            h1[j].tarHeartRate();
        }
    }
}