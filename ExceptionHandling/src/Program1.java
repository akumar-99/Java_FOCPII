import java.lang.*;
class Test {
    char a;
    public void set(char a) {
        this.a = a;
    }
}
class Program1
    {
        static void divide() {
            int num1 = 1;
            int num2 = 0;
            int output = num1/num2;
            System.out.println ("Result: "+ output);
        }

        static void array() {
            int arr[] = new int[3];
            for(int i = 5; i >= 0; i--) {
            System.out.println("The value of array is" + arr[i]);
            }
        }

        static void parse() {
            int num = Integer.parseInt("XYZ");
            System.out.println(num);      
        }

        static void length() {
            String str = "a";
            System.out.println (str.length());    
        }

        // static void setError() {
        //     Test p = new Test();
            
        //     p.set(1);
        // }



        public static void main(String args[])
        {
            try{
                length();
            }
            catch(ArithmeticException e1){
                System.out.println(e1.getMessage());
            }
            catch(ArrayIndexOutOfBoundsException e2){
                System.out.println(e2.getMessage());
            }
            catch(NumberFormatException e3){
                System.out.println(e3.getMessage());
            }
            catch(NullPointerException e4){
                System.out.println(e4.getMessage());
            }
            catch(IllegalArgumentException e5){
                System.out.println(e5.getMessage());
        }
    }
}