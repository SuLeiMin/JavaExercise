package Testing;

import java.util.ArrayList;

public class ArrayTest2 {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(3);
		list.add(7);

		for(int value :list) {
			System.out.println("For 1: " + value);
		}

		for(int i = 0;i<list.size();i++) {
			System.out.println("For 2: " + list.get(i));
		}
	}

}
