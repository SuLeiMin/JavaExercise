package Testing;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest8 {

	public static void main(String[] args) throws IOException {
		StringBuilder sb = new StringBuilder();
		String strLine = "";
		try {
			String filename = "C:\\Users\\April\\AA\\AA.txt";
			FileWriter fw = new FileWriter(filename, true);
			fw.write("Java Exercise");
			fw.close();
			BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\April\\AA\\AA.txt"));
			while (strLine != null) {
				sb.append(strLine);
				sb.append(System.lineSeparator());
				strLine = br.readLine();
				System.out.println(strLine);
			}
			br.close();
		} catch (IOException ioe) {
			System.out.println("IOException : " + ioe.getMessage());
		} finally {
			// TODO: handle finally clause
		}

	}

}
