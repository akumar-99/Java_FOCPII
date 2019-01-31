import java.io.*;
import java.util.*;
class FileDemo1 {
   	public static void main(String[] args) {
	  	File f = null;
	  	try {
			f = new File("C:\\College\\Java_FOCPII\\FileHandling\\files\\file1.txt");
			FileWriter fout = new FileWriter(f);
			BufferedWriter bout= new BufferedWriter(fout);
			Scanner sc = new Scanner(System.in);
			System.out.print("\nEnter a String:");
			// while(sc.hasNext()){
			// 	bout.write(sc.nextLine());
			// 	bout.newLine();
			// }
			while(sc.hasNext()){
				String temp = sc.nextLine();
				if(temp.equals("exit")) {
        			break;
    			}
				bout.write(temp);
				bout.newLine();

			}
			bout.close();
		}        
		catch (Exception e) {
		// if any I/O error occurs
			e.printStackTrace();
		}
	}
}
