package kadai_015;

public class Car_Chapter15 {
	private int gear;
	private int speed;
	
	public Car_Chapter15(int gear, int speed) {
		this.gear  = gear;
		this.speed = speed;
	}

	public void gearChange(int afterGear) {
		gear = afterGear;
		System.out.println("ギア" + gear + "から" + afterGear + "に切り替えました");
		switch(gear) {
		case 1  -> speed = 10;
		case 2  -> speed = 20;
		case 3  -> speed = 30; 
		case 4  -> speed = 40;
		case 5  -> speed = 50;
		default -> speed = 10;
		}
	}
	
	public void run() {
		System.out.println("速度は時速" + speed + "kmです");
	}
}
