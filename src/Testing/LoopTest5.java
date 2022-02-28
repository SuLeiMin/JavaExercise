package Testing;

import java.util.Scanner;

public class LoopTest5 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

		int number;

		int firstTerm = 0;
		int secondTerm = 1;
		int thirdTerm;

		System.out.print("Enter number of terms of series : ");
		number = console.nextInt();

		System.out.print(firstTerm + " "+ secondTerm + " ");

		for(int i=3;i<=number;i++)
		{
			thirdTerm = firstTerm + secondTerm;
			System.out.print(thirdTerm + " ");
			firstTerm = secondTerm;
			secondTerm = thirdTerm;
		}

	}

}
