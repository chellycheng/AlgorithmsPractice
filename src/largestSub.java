package test;

import java.util.Arrays;

public class largestSub {

	public static void main(String[] args) {
		int[] array = {1,4,3,2,5,1,1,1,7};
		int k = 4;
		KSubArray(array,k);

	}
	//given the assumption that all number is distinct
	public static void KSubArray(int[] array,int k) {
		int max_index = -1;
		int max = -1;
		for(int i=0; i<array.length-k+1;i++) {
			if(array[i]>max) {
				max = array[i];
				max_index = i;
			}
		}
		
		System.out.println(Arrays.toString(Arrays.copyOfRange(array, max_index, max_index+k)));
	}
}
