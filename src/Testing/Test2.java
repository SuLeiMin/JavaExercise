package Testing;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter input number - ");
		int a = sc.nextInt();

		for (int i = 1; i <= 10; i++) {

			System.out.println(a + " x " + i + " = " + (a * i));
		}
	}

}
