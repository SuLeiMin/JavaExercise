package Testing;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int num1, num2, num3 = 0;
		String operator = null;
		String choose;

		Scanner scanner = new Scanner(System.in);
		Scanner op = new Scanner(System.in);


			System.out.print("Enter first number : ");
			num1 = scanner.nextInt();

			System.out.print("Enter second number : ");
			num2 = scanner.nextInt();

			System.out.print("Enter your operator : ");
			operator = op.next();

			switch (operator) {
			case "+":
				num3 = num1 + num2;
				break;
			case "-":
				num3 = num1 - num2;
				break;
			case "*":
				num3 = num1 * num2;
				break;
			case "/":
				num3 = num1 / num2;
				break;

			}
			System.out.println("The result is : " + num3);

	}

}
