package att4;

import java.util.Scanner;

public class Static4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		// vetores criados A e B com 5 posições;
		int[] A = new int[5];		
		int [] B = new int[5];
		
		// metodo for para pegar o que foi digitado por no A e depois espelhar no B;
		for(int i = 0;i < B.length;i++) {
			
			System.out.println("Write your value: "+ i);
			A[i] = s.nextInt();
			B[i] = A[i];

		}
		// forma de organização para mostrar o vetor A com metodo for;
		System.out.println("\n ----- 'Vector A' CREATE SUCEFULLY ----- ");
		for(int i = 0;i<A.length;i++) {
			System.out.println("Position "+(i+1)+":"+" "+A[i]);
		
		}
		}
			
		
	}


