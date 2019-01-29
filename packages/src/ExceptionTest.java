import java.lang.*;
class ExceptionTest {
	int a;
	int b;
	ExceptionTest(int a, int b) {
		this.a = a;
		this.b = b;
	}
	int divide() {
		return (a/b);
	}
	public static void main(String[] args) {
		ExceptionTest t1 = new ExceptionTest(33, 4);
		ExceptionTest t2 = new ExceptionTest(3, 0);
		try {
			
			System.out.println(t2.divide());
			//will not be executed, jumps to catch after getting an exception
			System.out.println("Exception Found");

		}
		catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			System.out.println(t1.divide());
		}
		System.out.println("Exception Found");
	}
}