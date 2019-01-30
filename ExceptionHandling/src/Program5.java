import java.lang.*;
class CheckArgumentException extends Exception {
    CheckArgumentException(String n) {
        super(n);
    }
}
class Program4 {
    static boolean isNumeric(String s) {  
        return s != null && s.matches("[-+]?\\d*\\.?\\d+");  //Using regular expressions
    }  
    public static void main(String args[])
    {
        try {
            if (args.length<5) {
                throw new CheckArgumentException("Num<5");
            }
            int sum = 0;
            int num;
            for (int i=0; i<args.length; i++) {
                // //parsing string value to int
                // num = Integer.parseInt(args[i]);
                // sum = sum + num;
                if (isNumeric(args[i])) {
                    num = Integer.parseInt(args[i]);
                    sum += num;
                }
                else
                    throw new CheckArgumentException("Command line argument should be of integer type");
            }
            System.out.println("SUM = " + sum);
        }
        catch(CheckArgumentException e) {
            System.out.println(e.getMessage());
        }
        // catch(NumberFormatException e1) {
        //     System.out.println(e1.getMessage() + " not an integer");
        // }
    }
}