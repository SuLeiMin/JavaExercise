package Testing;

public class InheritanceTest {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		two g = new two();
		g.print_geek();
		g.print_for();
		g.print_geek();
	}

}
class one{
	public void print_geek() {
		System.out.println("Geeks");
	}


}

class two extends one{
	public void print_for() {
		System.out.print("For");
	}
}