package att3;

import java.util.Scanner;

public class Static3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Write your name please:");
		String name = s.next();
		System.out.println("Write your age please:");
		int yearsOld = s.nextInt();
		System.out.println("Write your sale please:");
		double sale = s.nextDouble();
		System.out.println("Write your sex please:");
		String sex = s.next();
		System.out.println("Write your state please:");
		String state = s.next();
		
		
		if(name.length() > 3) {
			System.out.println("Welcome "+name+ "!");
		}else {
			System.out.println("Your name is so small, Try again!");
		}
		
		if(yearsOld >= 0 && yearsOld < 150) {
			System.out.println(yearsOld+", years old? Wow you are so young!");
		}else {
			System.out.println("you Kidding me ? Try again please!");
		}
		if(sale > 0) {
			System.out.println("Ok so good sale man!");
		}else {
			System.out.println("Sale negative holy shit!Try again please!");
		}
		switch(sex) {
		case "M","m": System.out.println("You are a good man!");break;
		case "F","f": System.out.println("You are a beatiful girl!");break;
		}
		switch(state) {
		case "S","s": System.out.println("You are single?");break;
		case "C","c": System.out.println("You married?");break;
		case "V","v": System.out.println("I'm so sorry!Will should be difficulty");break;
		case "D","d":System.out.println("Damn she trade you?");break;
		default:System.out.println("Your caractere is invalid! Try again!");break;
		}
	}
	

}
