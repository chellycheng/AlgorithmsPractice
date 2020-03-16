package test;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class example {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		if(n==k) {
			System.out.println(0);
		}
		else if(n>k) {
			System.out.println(n-k);
		}
		else {
			Queue<int [] > queue = new LinkedList<int [] >();
			int[] position = {n,0};
			queue.add(position);
			while(!queue.isEmpty()) {
				int[] current = queue.poll();
				int p = current[0];
				int l = current[1];
				if(p==k) {
					System.out.println(l);
					return;
				}
				int[] c1 = {p+1,l+1};
				int[] c2 = {p-1,l+1};
				int[] c3 = {2*p,l+1};
				queue.add(c1);
				queue.add(c2);
				queue.add(c3);
			}
			
		}
		
	}
	
	
//	public static int getFromMatrix(int []M, int index) {
//		if(M[index]!=0) {
//			return M[index];
//		}
//		else {
//			//fillup the matrix by looking foward
//			//say some f does this
//			if(index%2==0) {
//				int a =getFromMatrix(M, index/2);
//				int b = getFromMatrix(M, index-1);
//				int c = getFromMatrix(M,index+1);
//				M[index] = Math.min(Math.min(a, b),c);
//						
//			}
//			else {
//				M[index] = Math.min(a, b)
//			}
//			
//		}
//		
//	}
	
	

}
