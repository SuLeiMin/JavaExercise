package Testing;

import java.util.ArrayList;

public class ArrayTest3 {

	public static void main(String[] args) {
       ArrayList<Integer> elements = new ArrayList<>();
       elements.add(10);
       elements.add(15);
       elements.add(20);

       System.out.println("Count : " + elements.size());

       elements.clear();

       System.out.println("Count : " + elements.size());

	}

}
