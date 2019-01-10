import java.util.Scanner;
public class Program4 {
    public static void main(String[] Strings) {
    	Long min, year, month, day;
    	//Number of days in a month has been takes as 28 by default
        Scanner input = new Scanner(System.in);
        System.out.print("Input the number of minutes: ");
        min = input.nextLong();
        year = min / (60 * 24 * 28 * 12);
		month = (min % (60 * 24 * 28 * 12)) / (60*24*28);
		day = ((min % (60 * 24 * 28 * 12)) % (60*24*28)) / (60*24);
        System.out.println(min + " minutes is approximately " + year + " years " + month + "months and" + day + " days ");
    }
}
