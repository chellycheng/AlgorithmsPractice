package contest;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Huawei3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		ArrayList<String> sl1 = new ArrayList<String>();
		ArrayList<String> sl2 = new ArrayList<String>();
		for(int i=0;i<n;i++){
			sl1.add(sc.nextLine());
		}
		for(int i=0;i<n;i++) {
			sl2.add(sc.nextLine());
		}
		int sum = 0;
		for(int i=0;i<n;i++) {
			String s1=sl1.get(i);
			String s2=sl2.get(i);
			int p = s1.length();
			int q = s2.length();
			int M[][]= new int[p+1][q+1];
			dpcount(s1, s2, p, q, M);
			sum+=M[p][q];
		}
		
		System.out.println(sum);
	}
	
	
	static void dpcount(String a, String b, int n, int m, int[][]M) {
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=m;j++) {
				if(i==0) {
					//this is the case there is nothing for string a
					M[i][j]=j;
				}
				else if(j==0) {
					//this is the case there is nothing for string b
					M[i][j]=i;
				}
				else if(a.charAt(i-1)==b.charAt(j-1)) {
					M[i][j]=M[i-1][j-1];
				}
				else {
					M[i][j]=1+Math.min(Math.min(M[i-1][j-1], M[i-1][j]),M[i][j-1]);
				}
			}
		}
	}
	
	static void print(int[][] M,int n,int m) {
		for(int i=0;i<n;i++) {
				System.out.println(Arrays.toString(M[i]));
			}
		
	}

}
