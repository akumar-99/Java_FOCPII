import java.util.*;
class TestMyTime {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		MyTime time = new MyTime();
		int loop;
		do {
			System.out.print("ENTER CHOICE :: ");
			int ch = in.nextInt();
			switch(ch) {
				case 1 	: 	int hour = in.nextInt();
							int minute = in.nextInt();
							int second = in.nextInt();
							time.setTime(hour, minute, second);
							break;
				case 2 	:	System.out.println("TIME :: " + time.toString());
							break;
				case 3	:	time.nextSecond();
							break;
				case 4	:	time.previousSecond();
							break;
				default :	System.out.println("Wrong Input");
							break;
			}
			//Testing cased 3,4 replacable by similar ones and checked
			System.out.print("PRESS 1 to repeat ");
			loop = in.nextInt();
		} while(loop == 1);
	}
}