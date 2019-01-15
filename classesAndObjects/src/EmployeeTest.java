import java.util.*;
class Employee {
    String fName;   //First Name
    String lName;   //Last Name
    double salary;

    Employee() {
        fName = "Ashish";
        lName = "Kumar";
        salary = 20000;
    }

    Employee(String fName, String lName, double salary) {
        this.fName = fName;
        this.lName = lName;
        this.salary = salary;
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
    }
}

public class EmployeeTest {
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

        Employee e1 = new Employee();
        Employee e2 = new Employee(fName, lName, salary);
        e1.displayInfo();
        e2.displayInfo();
    }
}