package Testing;

public class Inheritence {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		MountainBike mb = new MountainBike(3,100,25);
		System.out.print(mb.toString());
	}

}

class Bicycle{
	public int gear;
	public int speed;

	public Bicycle(int gear,int speed)
	{
		this.gear = gear;
		this.speed = speed;

	}

	public void applyBrake(int decrement) {
		speed -= decrement;
	}

	public String toString() {
		return("No of gears are " + gear + "\n" + "speed of bicycle is "+ speed);
	}
}

class MountainBike extends Bicycle{

	public int seatHeight;

	public MountainBike(int gear,int speed,int starHeight) {
		super(gear,speed);
		seatHeight = starHeight;
	}

	public void setHeight(int newValue) {
		seatHeight = newValue;
	}

	@Override public String toString() {
		return (super.toString()+"\nseat height is "+seatHeight);
	}

}
