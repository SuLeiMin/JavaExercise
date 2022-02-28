package Testing;

import java.io.FileWriter;
import java.io.IOException;

public class FileTest9 {
	private static void CreateCsvFile(String fileName) {
		FileWriter writer = null;

		try {
			writer = new FileWriter(fileName);
			writer.append("Name");
			writer.append(',');
			writer.append("Number");
			writer.append('\n');

			writer.append("interview questions");
			writer.append(',');
			writer.append("001");
			writer.append('\n');

			writer.append("interview program");
			writer.append(',');
			writer.append("001");
			writer.append('\n');

			System.out.println("CSV FIle is created...");


		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				writer.flush();
				writer.close();

			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		String location = "C:\\User\\April\\";
		CreateCsvFile(location);

	}

}
