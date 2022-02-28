package Testing;

class Addition{
	public static int i=0;

	Addition(){
		i++;
	}
	public static int get() {
		return i;
	}
	public int m1() {
		System.out.println("Inside the method m1 by object of GFG class");
		this.m2();
		return 1;
	}

	public void m2() {
		System.out.println("In method m2 came from  method m1");
	}
}
public class MethodTest {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Addition add = new Addition();

		int i = add.m1();

		System.out.println("Control returned after method m1 : " + i);

		int objects = Addition.get();

		System.out.print("No of instances created till now :");

		System.out.println(objects);
	}

}
