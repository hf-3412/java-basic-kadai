package kadai_015_03;

public class Car_Chapter15 {
	private int gear  = 1;
	private int speed = 10;

	public void gearChange(int afterGear) {
		if(gear != afterGear) {
			System.out.println("ギア" + gear + "から" + afterGear + "に切り替えました");
			gear = afterGear;
			speed = switch(gear) {
				case 2  -> 20;
				case 3  -> 30; 
				case 4  -> 40;
				case 5  -> 50;
				default -> 10;
			};
		} else {
			System.out.println("ギア：" + gear + "／切替えなし");
		}
	}
	
	public void run() {
		System.out.println("速度は時速" + speed + "kmです");
	}
}
