import java.util.*;

class dateOfBirth{
    int day;
    int month;
    int year;
    dateOfBirth(int d,int m,int y)
    {
        day=d;
        month=m;
        year=y;
    }
}

class HeartRate {
    String firstName;
    String lastName;
    dateOfBirth d;
    
    HeartRate(String firstName, String lastName,int month, int date, int year ) {
        this.firstName = firstName;
        this.lastName = lastName;
        d = new dateOfBirth(date, month, year);
        
    }

    void setFirstName(String FName) {
        this.firstName = firstName;
    }
    
    String getFirstName() {
        return firstName;
    }

    void setLastName(String lastName) {
        this.lastName = lastName;
        }

    String getlastName() {
        return lastName;
    }
    
    int getAge(){
        return (2019-d.year);
    }

    int maxHeartRate() {
        return 220 - getAge();
    }

    public void tarHeartRate(){
    System.out.print("Target Heart Rate Range: " + (maxHeartRate() * 0.5) + " to "+ (maxHeartRate() * 0.85));
    }
}