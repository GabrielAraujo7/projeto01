package att4;

import java.util.Scanner;

public class Tbuada {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Say this number one:");
		int A = s.nextInt();
		System.out.println("Say this number two:");
		int B = s.nextInt();
		
		int total = A*B;
		System.out.println("Your result is: "+total);
		

	}

}
