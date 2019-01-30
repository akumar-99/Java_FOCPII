import java.lang.*;
class ExceptionTest1 {
	int a;
	int b;
	ExceptionTest1(int a, int b) {
		this.a = a;
		this.b = b;
	}
	int divide() {
		return (a/b);
	}
	public static void main(String[] args) {
		ExceptionTest1 t1 = new ExceptionTest1(33, 4);
		ExceptionTest1 t2 = new ExceptionTest1(3, 0);
		try {
			// to print our message, overrides catch default msg
			// if (t2.b == 0) {
			// 	throw new ArithmeticException("b cannot be equal to zero");
			// }
			System.out.println(t2.divide());
		}
		catch (ArithmeticException expt) {
			System.out.println(expt.getMessage());
			System.out.println(t1.divide());
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}

		System.out.println("Exception Found");
	}
}