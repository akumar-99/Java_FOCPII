import java.io.*;
public class FileDemo {
    public static void main(String[] args) {
        File f = null;
        String strs = "C:\\College\\Java_FOCPII\\FileHandling\\files\\file.txt";
        // exception necessary
        try {
            // create new file
            f = new File(strs);
            String a = f.getAbsolutePath(); 
            
            // prints absolute path and length
            System.out.print("\n" + a);
            System.out.print("\nLength = " + f.length());
        }
        catch (Exception e) {
            // if any I/O error occurs
            e.printStackTrace();
        }
    }
}
