package Testing;

import java.util.Arrays;

public class ArrayTest4 {

	public static void main(String[] args) {

		int[] array = {-1,4,0,2,7,-3};
		System.out.println("Original numeric array : "+ Arrays.toString(array));

		int min = Integer.MAX_VALUE;
		int second_min = Integer.MAX_VALUE;

		for(int i=0 ;i<array.length;i++) {
			if(array[i] == min) {
				second_min =min;
			}else if(array[i] < min) {
				second_min = min;
				min = array[i];
			}else if(array[i] <second_min) {
				second_min = array[i];
			}
		}
		System.out.println("Second Lowest number is :" + second_min);

	}

}
