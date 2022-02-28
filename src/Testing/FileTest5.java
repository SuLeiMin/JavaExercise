package Testing;

import java.util.regex.Pattern;

public class FileTest5 {

	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("\\W+");
		String line = "cat;dog--ABC";

		long t1 = System.currentTimeMillis();

		for (int i = 0; i < 100000; i++) {
			String[] values = pattern.split(line);
			if (values.length != 3) {
				System.out.println(false);
			}
		}
		long t2 = System.currentTimeMillis();

		// Version 2: use String split method.
		for (int i = 0; i < 1000000; i++) {

			String[] values = line.split("\\W+");
			if (values.length != 3) {
				System.out.println(false);
			}
		}

		long t3 = System.currentTimeMillis();

		// ... Benchmark results.
		System.out.println(t2 - t1);

	}

}
