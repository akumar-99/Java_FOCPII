import java.util.*;
class Employee_1 {
    String name;   
    int yearOfJoining;
    double salary;
    String address;
    Scanner input = new Scanner(System.in);

    Employee_1() {
        name = null;
        yearOfJoining = 0000;
        salary = 0.0;
        address = null;
    }

    Employee_1(String name, int yearOfJoining, double salary, String address) {
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
        this.address = address;
    }

    public void getInfo() {
        System.out.print("Enter Name : ");
        name = input.next();
        System.out.print("Enter Year of Joining : ");
        yearOfJoining = input.nextInt();
        System.out.print("Enter Monthly Salary : ");
        do {
            salary = input.nextDouble();
            if (salary > 0)
                break;
            else 
                System.out.print("Re-Enter Monthly Salary : ");
        } while (true);
        System.out.print("Enter Address : ");
        address = input.next();
    }

    void displayInfo() {
        System.out.println(name + "\t\t" + yearOfJoining + "\t" + address);
    }
}

public class EmployeeTest_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Employee_1 employee[] = new Employee_1[10];
        System.out.println("Enter Number of Employees : ");
        int eNo ;       //Number of Employees
        eNo = input.nextInt();
        for (int i=0; i<eNo; i++) {
            employee[i] = new Employee_1();
            employee[i].getInfo();
        }
        System.out.println("Employee\tName\tYear of Joining\tAddress");
        for (int i=0; i<eNo; i++) {
            employee[i].displayInfo();
        }
    }
}