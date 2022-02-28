package Testing;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest2 {

	public static void main(String[] args) throws IOException {

		FileReader in = null;
		FileWriter out = null;

		try {
			in = new FileReader("C:\\Users\\april\\Text.txt");
			out = new FileWriter("C:\\Users\\april\\Text2.txt");

			int c;

			while ((c = in.read()) != -1) {
				out.write(c);
			}
		} finally {
			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.close();
			}
		}
	}

}
