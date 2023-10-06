package att2;

import java.util.Scanner;

public class Static2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		boolean validate;
		
		do {
			System.out.println("Write your name and your password please");
			String name = s.next();
			String password = s.next();
			if(name.equals(password)) {
				validate = false;
				System.out.println("This name and password is same!");
				System.out.println("Try again!");
			}else {
				validate = true;
				System.out.println("\n ---- LOGIN SUCEFULLY ----- ");
				System.out.println("Its okay, welcome "+name);
			}
			
		}while(!validate);
		s.close();

	}

}
