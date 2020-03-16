package contest;

import java.util.Arrays;
import java.util.Scanner;

public class bijele {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan  = new Scanner(System.in);
		int [] input = new int[6];
		String [] temp =  scan.nextLine().split(" ");
		
		for(int i =0;i<temp.length;i++) {
			int tempn = 0;
			if(i<2) {
				tempn = 1- Integer.parseInt(temp[i]);
			}
			else if(i<5) {
				tempn = 2- Integer.parseInt(temp[i]);
			}
			else {
				tempn = 8- Integer.parseInt(temp[i]);
			}
			System.out.print(tempn);
			System.out.print(" ");
		}
		
		//System.out.println(Arrays.toString(input));
		
	}

}
