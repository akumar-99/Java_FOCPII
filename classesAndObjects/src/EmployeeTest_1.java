import java.util.*;
class Employee_1 {
    String name;   
    int yearOfJoining;
    double salary;
    String address;
    Scanner input = new Scanner(System.in);

    Employee_1() {
        fName = null;
        lName = null;
        salary = 0;
        address = null;
    }

    Employee_1(String name, int yearOfJoining, double salary, String address) {
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
        this.address = address;
    }

    void getInfo() {
        System.out.print("Enter First Name : ");
        fName = input.next();
        System.out.print("Enter Last Name : ");
        lName = input.next();
        double salary;
        System.out.print("Enter Monthly Salary : ");
        do {
            salary = input.nextDouble();
            if (salary > 0)
                break;
            else 
                System.out.print("Re-Enter Monthly Salary : ");
        } while (true);
        System.out.print("Enter Address : ");
        salary = input.next();

    }

    void displayInfo() {
        System.out.println();
        System.out.println("Employee Name : " + name);
        System.out.println("Year of Joining : " + yearOfJoining);
        System.out.println("Salary : " + salary);
        System.out.println("Address : " + address);
    }
}

public class EmployeeTest_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Employee_1 employee[] = new Employee_1[10];
        System.out.println("Enter Number of Employees : ");
        int eNo ;       //Number of Employees
        eNo = input.nextInt();
        for (int i=0; i<eNo; )

        

        Employee e1 = new Employee();
        Employee e2 = new Employee(fName, lName, salary);
        e1.displayInfo();
        e2.displayInfo();
    }
}