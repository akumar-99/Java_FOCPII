import java.util.*;
class Address
{
    Scanner input = new Scanner(System.in);
    private String firstLine;
    private String secondLine;
    private int pincode;

    Address()
    {
        firstLine = "N/A";
        secondLine = "N/A";
        pincode = 0;
    }

    Address(String firstLine, String secondLine, int pincode) {
        this.firstLine = firstLine;
        this.secondLine = secondLine;
        this.pincode = pincode;
    }

    // void setAddress() {
    //     System.out.println("Enter your address");
    //     System.out.print("Line 1 : ");
    //     firstLine = input.next();
    //     System.out.print("Line 2 : ");
    //     secondLine = input.next();
    //     System.out.print("PINCODE : ");
    //     pincode = input.nextInt();
    // }

    void getAddress() {
        System.out.println("Enter your address");
        System.out.println("Line 1 : " + firstLine);
        System.out.println("Line 2 : " + secondLine);
        System.out.println("PINCODE : " + pincode);
    }
}