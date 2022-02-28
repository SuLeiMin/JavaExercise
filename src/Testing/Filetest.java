package Testing;

import static java.nio.file.StandardOpenOption.*;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Filetest {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String s = " Hello World";
		byte data[] = s.getBytes();
		Path p = Paths.get("C:\\Users\\april\\Text.csv");
		try (OutputStream out = new BufferedOutputStream(
				Files.newOutputStream(p, CREATE, APPEND))) {
			out.write(data, 0, data.length);
		} catch (IOException x) {
			System.err.println(x);
		}

	}

}
