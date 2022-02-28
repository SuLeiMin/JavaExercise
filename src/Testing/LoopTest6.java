package Testing;

public class LoopTest6 {

	public static void main(String[] args) {
		double grades[] = {12.3,3.5,4.5,6.5};
		int i;

		for(i = 0;i<4;i++) {
			if(grades[i]<12.3) {
				System.out.println("Grades number " + i + " is "+ grades[i]);
			}
		}


	}

}
