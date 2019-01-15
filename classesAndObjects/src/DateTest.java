import java.util.*;
class Date {
    int month;
    int day;
    int year;

    Date() {
        day = 1;
        month = 1;
        year = 2000;
    }

    Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    void displayDate() {
        System.out.println("Date : " + day + "/" + month + "/" +  year);
    }
}

public class DateTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter day : ");
        int day = input.nextInt();
        System.out.print("Enter month : ");
        int month = input.nextInt();
        System.out.print("Enter year : ");
        int year = input.nextInt();

        Date d1 = new Date();
        Date d2 = new Date(day, month, year);
        d1.displayDate();
        d2.displayDate();
    }
}