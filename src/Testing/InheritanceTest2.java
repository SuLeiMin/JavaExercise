package Testing;

public class InheritanceTest2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		three g = new three();
		g.print_geek();
		g.print_for();
		g.print_geek();
	}

}
class AA{
	public void print_geek() {
		System.out.print("Geeks");
	}
}
class BB extends AA{
	public void print_for() {
		System.out.println("for");
	}
}

class three extends BB{
	public void print_geek() {
		System.out.println("Geeks");
	}
}

