import java.util.Scanner;

public class Static {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		boolean noteValid;
		
		
		do {
			System.out.println("Write your note values here:");
			int x = s.nextInt();
			
			if(x >= 0 && x <= 10) {
				noteValid = true;
				System.out.println("Okay this note so good!");
			}else {
				noteValid = false;
				System.out.println("Its not okay");
			}
			
			}while(!noteValid);
		s.close();
		}

	}

	
	

		



		
	


