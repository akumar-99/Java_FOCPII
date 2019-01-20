//Instead pair, point used
//Set methods deinition ignored
import java.util.*;
public class PairTest {
	static double x;
	static double y;
	static Scanner input = new Scanner(System.in);
	static Point temp = new Point();
	static Point pArr[] = new Point[5];
	static void sort() {
		for (int i=0; i<pArr.length; i++) {
			for (int j=i+1; j<pArr.length; j++) {
				if(pArr[i].getY() > pArr[j].getY()) {
					temp = pArr[i];  
                    pArr[i] = pArr[j];  
                    pArr[j] = temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		

		for (int i=0; i<pArr.length; i++) {
			System.out.println("POINT [" + i + "] :: ");
			System.out.print("Enter x :: ");
			x = input.nextDouble();
			System.out.print("Enter y :: ");
			y = input.nextDouble();
			pArr[i] = new Point(x,y);
		}
		sort();
		System.out.println("PAIR ARRAY :: ");
		for (int i=0; i<pArr.length; i++) {
			System.out.print("(" + pArr[i].getX() + ", " + pArr[i].getY() + "), ");
		}
		
	}	
}

