import java.io.*;
import java.util.*;
class Student {
    int sNo;
    String fName;
    float cgpa;
    char grade;
    Scanner input = new Scanner(System.in);

    void setStudent() {
        System.out.print("Enter Serial No : ");
        sNo = input.nextInt();
        System.out.print("Enter First Name : ");
        fName = input.next();
        System.out.print("Enter CGPA : ");
        cgpa = input.nextFloat();
        System.out.print("Enter grade : ");
        grade = input.next().charAt(0);
    }

    public String toString() {
        return sNo + "\t" + fName + "\t" + cgpa + "\t" + grade + "\n"; 
    }

    void getStudent() {
        System.out.print("Serial No : " + sNo);
        System.out.print("First Name : " + fName);
        System.out.print("CGPA : " + cgpa);
        System.out.print("garde : " + grade);
    }
}
class StudentTest {

    static void input() {
        File f = null;
        try {
            f = new File("C:\\College\\Java_FOCPII\\FileHandling\\files\\student.txt");
            FileWriter fout = new FileWriter(f);
            BufferedWriter bout= new BufferedWriter(fout);
            Student s[] = new Student[5];
            for (int i=0; i<5; i++) {
                s[i] = new Student();
                s[i].setStudent();
                bout.write(s[i].toString());
                bout.newLine();
            }
            
            bout.close();
        }        
        catch (Exception e) {
        // if any I/O error occurs
            e.printStackTrace();
        }
    }

    static void output() {
        File f=null;
        try {
            f = new File("C:\\College\\Java_FOCPII\\FileHandling\\files\\student.txt");
            FileReader fin = new FileReader(f);
            BufferedReader bin= new BufferedReader(fin);
            String sr;
            System.out.println("The contents of the file are: ");
            System.out.println("S.No\tName\tCGPA\tgrade");
            while((sr=bin.readLine())!=null){
                System.out.println(sr);
            } 
        }
        catch (Exception e) {
        // if any I/O error occurs
            e.printStackTrace();
        }
        
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch;
        char c;
        do {
            System.out.print("COMMAND :: ");
            ch = input.next().charAt(0);
            switch(ch) {
                case 'i' : input();
                        break;
                case 'o' : output();
                        break;
                default : System.out.println("INVALID");
            }
            System.out.print("Press y to continue");
            c = input.next().charAt(0);
        } while (c=='y');
        
    }
}


