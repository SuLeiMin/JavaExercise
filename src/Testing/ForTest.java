package Testing;

public class ForTest {

	static int count;

	static int[] getElements() {
		int[] array = new int[3];
		array[0] = count++;
		array[1] = count++;
		return array;
	}

	public static void main(String[] args) {
		for (int value : getElements()) {
			System.out.println(value);
		}

	}

}
