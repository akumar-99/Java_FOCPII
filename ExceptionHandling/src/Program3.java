import java.lang.*;
class Test {
	void display()
	{
		System.out.println("NOPE");
	}
}

class Program3 {
	public static void main(String[] args) {
		Test t = null;
		try {
			t.display();
		} catch(NullPointerException e) {
			System.err.println("Caught NullPointerException");	//prefer e.getMessage
		} 
	}	
}