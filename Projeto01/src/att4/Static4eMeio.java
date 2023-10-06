package att4;

import java.util.Scanner;

public class Static4eMeio {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Say what width of vector A and B");
		int [] A = new int[s.nextInt()];
		int [] B = new int[A.length];
		
		for(int i = 0 ;i< B.length;i++) {
			System.out.println("Write a number of vector: "+i);
			A[i] = s.nextInt();
			System.out.println("Write the value desire multiplic this:");
			B[i] = A[i]* s.nextInt();
		}
		for(int i = 0;i<A.length;i++) {
			System.out.println("This result of multiplication is: "+B[i]);
		}
	}

}
