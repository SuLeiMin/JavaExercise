package Testing;

import java.io.File;
import java.io.FilenameFilter;

public class FileTest6 {

	public static void main(String[] args) {

		File file = new File("C:\\Users\\April\\AA");
		String[] list = file.list(new FilenameFilter() {

			public boolean accept(File dir, String name) {
				if (name.toLowerCase().endsWith(".txt")) {
					return true;
				} else {
					return false;
				}
			}
		});

		for (String name : list) {
			System.out.println(name);
		}
	}

}
