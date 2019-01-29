import java.util.*;
class Employee2 {
    String fName;   //First Name
    String lName;   //Last Name
    double salary;
    Address address;

    Employee2() {
        fName = "Ashish";
        lName = "Kumar";
        salary = 20000;
        address = new Address();
    }

    Employee2(String fName, String lName, double salary, String firstLine, String secondLine, int pincode) {
        this.fName = fName;
        this.lName = lName;
        this.salary = salary;
        address = new Address(firstLine, secondLine, pincode);
    }

    void yearlySalary() {
        double ySalary = salary * 12;
        System.out.println("Annual Salary : " + ySalary);
    }

    void raisedSalary() {
        double rSalary = 12 * 1.1 * salary;  //10% of x + x
        System.out.println("Raised Annual Salary : " + rSalary);
    }

    void displayInfo() {
        System.out.println();
        System.out.println("Employee Name : " + fName + " " + lName);
        yearlySalary();
        raisedSalary();
        address.getAddress();
    }
}

public class EmployeeTest_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Employee 1 values taken as default");
        System.out.println("Enter Emplyee 2 Details : ");
        System.out.print("Enter First Name : ");
        String fName = input.next();
        System.out.print("Enter Last Name : ");
        String lName = input.next();
        double salary;
        System.out.print("Enter Monthly Salary : ");
        do {
            salary = input.nextDouble();
            if (salary > 0)
                break;
            else 
                System.out.print("Re-Enter Monthly Salary : ");
        } while (true);
        System.out.println("Enter your address");
        System.out.print("Line 1 : ");
        String firstLine = input.next();
        System.out.print("Line 2 : ");
        String secondLine = input.next();
        System.out.print("PINCODE : ");
        int pincode = input.nextInt();

        Employee2 e1 = new Employee2();
        Employee2 e2 = new Employee2(fName, lName, salary, firstLine, secondLine, pincode);
        e1.displayInfo();
        e2.displayInfo();
    }
}