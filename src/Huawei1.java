package contest;
import java.util.Arrays;
import java.util.Scanner;

public class Huawei1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] M = new int[n][n];
		int[][] R = new int[n][n];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				int temp = sc.nextInt();
				M[i][j]=temp;
			}
		}
		int m = sc.nextInt()%4;
		//System.out.println(Arrays.deepToString(M));
		if(m==0) {
			//no change case
			print(M,n);
		}
		else if(m==1) {
			//M[i][j]=R[j][n-1-i]
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					R[j][n-1-i]=M[i][j];
				}
			}
			print(R,n);
		}
		else if(m==2) {
			//M[i][j]=R[n-1-i][n-1-j]
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					R[n-1-i][n-1-j]=M[i][j];
				}
			}
			print(R,n);
		}
		
		else if(m==3) {
			//M[i][j]=R[n-1-j][i]
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					R[n-1-j][i]=M[i][j];
				}
			}
			print(R,n);
		}
	}
	
	static void print(int[][] M,int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(M[i][j]+" ");
			}
			System.out.println();
		}
	}
	

	
}
