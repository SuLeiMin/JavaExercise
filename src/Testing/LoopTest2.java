package Testing;

import java.util.Scanner;

public class LoopTest2 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

		int number1,number2;
		char choice;

		do {
			System.out.print("Enter the first number ");
			number1 = console.nextInt();

			System.out.print("Enter the second number ");
			number2 = console.nextInt();

			int sum = number1+ number2;
			System.out.println("Sum of numbers: " + sum);

			System.out.print("Do you want to continue y/n ?");
			choice = console.next().charAt(0);

		}while(choice == 'y' || choice == 'Y');



	}

}
