package kadai_015_03;

public class CarExec_Chapter15 {

	public static void main(String[] args) {
		Car_Chapter15 benz = new Car_Chapter15();
		
		benz.gearChange(3);
		benz.run();
		benz.gearChange(2);
		benz.run();
		benz.gearChange(2);
		benz.run();
	}
}
