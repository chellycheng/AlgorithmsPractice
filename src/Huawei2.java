package contest;

import java.util.Scanner;
import java.util.ArrayList;
public class Huawei2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		ArrayList<String>  list = new ArrayList<String>();
		division(n,k,"",list);
		int ways = list.size();
		System.out.println(ways);
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}
	
	public static void division(int n, int k, String path,ArrayList<String> l) {
		if(n==0&&k==1) {
			//the division finished for a path
			l.add(path);
			//System.out.println("Check here");
			return;
		}
		if(n>0){
			//all the stuff gives to the last one
			division(n-1,k,path+"*",l);
		}
		if(k>1){
			//nothing is divided
			division(n,k-1,path+"|",l);
		}
		
	}
}
