package att4;

import java.util.Scanner;

public class Static5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Write your vector A width:");
		int [] A = new int [s.nextInt()];
		int [] B = new int[A.length];
		
		for(int i = 0;i<B.length;i++) {
			System.out.println("Say one number for ["+(i)+"] position:");
			A[i] = s.nextInt();
			B[i] = A[i]*A[i];
			
		}
		for(int i =0; i < A.length;i++) {
			System.out.println("Your result of position "+i+": "+B[i]);
		}
	}

}
