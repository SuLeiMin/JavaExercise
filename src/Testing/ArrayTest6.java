package Testing;

public class ArrayTest6 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Student[] arr = new Student[5];

		arr[0] = new Student(1,"amaa");
		arr[1] = new Student(2,"vaiba");
		arr[2] = new Student(3,"shikar");
		arr[3] = new Student(4,"darmesh");
		arr[4] = new Student(5,"mohit");



		for (int i = 0; i < arr.length; i++) {
			System.out.println("Element at index " + i + ":" + arr[i].roll_no + " "+ arr[i].name);
		}

	}

}

class Student {
	public int roll_no;
	public String name ;
	Student (int roll_no,String name){
		this.roll_no = roll_no;
		this.name = name;
	}
}