package Testing;

public class StarTest {

	public static void main(String[] args) {
		int i,j,k,rows = 0;
		for (i=1; i<=5; i++)
        {
            // Print space in decreasing order
            for ( j=5; j>i; j--)
            {
                System.out.print(" ");
            }
            // Print star in increasing order
            for ( k=1; k<=i; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
	}

}
