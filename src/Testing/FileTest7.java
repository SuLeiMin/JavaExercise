package Testing;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileTest7 {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder();
		String strLine = "";
		String str_data = "";
		try {
			BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\April\\AA\\AA.txt"));
			while (strLine != null) {
				if (strLine == null)
					break;
				str_data += strLine;
				strLine = br.readLine();

			}
			System.out.println(str_data);
			br.close();
		} catch (FileNotFoundException e) {
			System.err.println("File not found");
		} catch (IOException e) {
			System.err.println("Unable to read the file.");
		}
	}

}
