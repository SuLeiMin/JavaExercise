package Testing;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		double num = 0;
		double x = 1;

		Scanner sc = new Scanner(System.in);
		System.out.println("Input the number(n) you want to calculate the average: ");
		int n = sc.nextInt();

		while (x <= n) {

			System.out.println("Input number " + "(" + (int) x + ")" + ":");
			num += sc.nextInt();//input number to calculate average number
			x += 1;//count or loop

		}

		double avgn = (num / n);

		System.out.println("Average:" + avgn);
	}

}
