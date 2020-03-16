package contest;

import java.util.Scanner;

public class Aaah {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String today = scan.nextLine();
		String expected = scan.nextLine();
		if(today.length()>=expected.length()) {
			System.out.println("go");
		}
		else {
			System.out.println("no");
		}
	}

}
