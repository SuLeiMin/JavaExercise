package Testing;

import java.util.ArrayList;

public class ArrayTest {

	public static void main(String[] args) {
		int[] ids = {-3,0,100};

		ArrayList<Integer> values = new ArrayList<>();
		for (int id:ids) {
			values.add(id);
		}
		System.out.println(values);
		System.out.println(values.size());
		System.out.println(ids.length);
	}

}
