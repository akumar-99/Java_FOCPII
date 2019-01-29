import java.util.*;
class Address {
    String line1;
    String line2;
    int pincode;

    Address(String line1, String line2, int pincode) {
        this.line1 = line1;
        this.line2 = line2;
        this.pincode = pincode;
    }

    void display() {
        System.out.println("ADDRESS :");
        System.out.println(line1);
        System.out.println(line2);
        System.out.println(pincode);
    }
}
class Employee {
    String fName;   //First Name
    String lName;   //Last Name
    double salary;
    Address addr;

    Employee() {
        fName = "Ashish";
        lName = "Kumar";
        salary = 20000;
        addr = null;
    }

    Employee(String fName, String lName, double salary, String line1, String line2, int pincode) {
        this.fName = fName;
        this.lName = lName;
        this.salary = salary;
        addr = new Address(line1, line2, pincode);
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
        addr.display();
    }
}

public class EmployeeTest_2_HW {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Employee 1 values taken as default");
        System.out.println("Enter Emplyee 2 Details : ");
        System.out.print("Enter First Name : ");
        String fName = input.next();
        System.out.print("Enter Last Name : ");
        String lName = input.next();
        System.out.print("Enter Line 1 : ");
        String line1 = input.next();
        System.out.print("Enter Line 2 : ");
        String line2 = input.next();
        System.out.print("Enter PINCODE : ");
        int pincode = input.nextInt();
        double salary;
        System.out.print("Enter Monthly Salary : ");
        do {
            salary = input.nextDouble();
            if (salary > 0)
                break;
            else 
                System.out.print("Re-Enter Monthly Salary : ");
        } while (true);

        Employee e1 = new Employee();
        Employee e2 = new Employee(fName, lName, salary, line1, line2, pincode);
        e1.displayInfo();
        e2.displayInfo();
    }
}