import java.lang.*;
class Program2 {
	public static void main(String[] args) {
		try {
			throw new Exception("ERROR");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Reached finally");
		}
	}
}