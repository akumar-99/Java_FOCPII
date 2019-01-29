import java.util.*;
class TestVehicle{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		switch(N){
			case 2 	: 	Bike b = new Bike();
						b.display();
						break;
			case 4 	: 	Car c = new Car();
						c.display();
						break;
			default : 	Vehicle v = new Vehicle();
						v.display();
		}
	}
}