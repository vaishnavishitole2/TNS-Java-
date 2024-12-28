package DayTwo.TNS;

import java.util.Scanner;

public class WhileDemo {
		// TODO Auto-generated method stub
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);

	        int number = 0;
	        while (number >= 0) {
	            System.out.println("Enter a number (negative number to quit):");
	            number = scanner.nextInt();

	            if (number >= 0) {
	                System.out.println("You entered: " + number);
	            }
	        }

	        System.out.println("You entered a negative number. Exiting...");

	}

}
