package Testing;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileTest4 {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();

		String[] numbers = line.split(",");

		FileWriter p = new FileWriter("C:\\Users\\april\\Text.txt");
		try {
			for (String number : numbers) {
				//int value = Integer.parseInt(number);
				//System.out.println(value + "* 20 = " + value * 20);
				p.write(number);
			}
		} catch (NumberFormatException e) {
			System.out.println("It has error!!!");
		}

		p.close();

		System.out.println("File is created successfullly with the content");

	}

}
