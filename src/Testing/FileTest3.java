package Testing;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileTest3 {

	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\April\\Text.txt"));

		while (true) {
			String line = reader.readLine();
			if (line == null) {
				break;
			}
			String[] parts = line.split(",");
			for (String part : parts) {
				System.out.println(part);
			}
			System.out.println();
		}
		reader.close();

	}

}
