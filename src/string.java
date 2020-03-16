package test;

import java.util.Arrays;
import java.util.Scanner;

public class string {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(scan.hasNext()) {
			String[] A = scan.nextLine().split(",");
			String[] B = scan.nextLine().split(",");
		
			//System.out.println(Arrays.toString(A));
			//System.out.println(Arrays.toString(B));
			int [] result = new int[B.length];
			for(int i=0;i<B.length;i++) {
				for(int j=0;j<A.length;j++) {
					result[i] += compareTo(A[j],B[i]);
				}
				
			}
			System.out.println(Arrays.toString(result));
		}

	}
	
	public int[] numSmallerByFrequency(String[] A, String[] B) {
		int [] result = new int[B.length];
		for(int i=0;i<B.length;i++) {
			int b =getOccur(B[i]);
			for(int j=0;j<A.length;j++) {
				if(getOccur(A[j])<b)
					result[i] ++;
			}
			
		}
		return result;
    }
	
	
	public static int compareTo(String s1, String s2) {
		//String one is less than string two if the smallest character 
		//return 1 if s1 smaller than s2, 0, if s2 larger or equal than the s1
		int min_oc1 = 0;
		char min_char1 = 'z'+1;
		int min_oc2 = 0;
		char min_char2 = 'z'+1;
		for(int i=0;i<s1.length();i++) {
			char c = s1.charAt(i);
			if(c<min_char1) {
				min_oc1 = 1;
				min_char1 = c;
			}
			else if(c==min_char1) {
				min_oc1 +=1;
			}
		}
		for(int i=0;i<s2.length();i++) {
			char c = s2.charAt(i);
			if(c<min_char2) {
				min_oc2 = 1;
				min_char2 = c;
			}
			else if(c==min_char2) {
				min_oc2 +=1;
				
			}
		}
		//System.out.println("1:"+ min_oc1);
		//System.out.println("2:"+min_oc2);
		if (min_oc1<min_oc2) 
			return 1;
		else 
			return 0;
		
	}
		
	public static int getOccur(String s1) {
		//String one is less than string two if the smallest character 
		//return 1 if s1 smaller than s2, 0, if s2 larger or equal than the s1
		int min_oc1 = 0;
		char min_char1 = 'z'+1;
		for(int i=0;i<s1.length();i++) {
			char c = s1.charAt(i);
			if(c<min_char1) {
				min_oc1 = 1;
				min_char1 = c;
			}
			else if(c==min_char1) {
				min_oc1 +=1;
			}
		}
		
		return min_oc1;
		
	}
		
}
