package ecf_tec;

public class Clock {
	protected String time;
	
	public Clock(String time) {
		this.time = time;
	}
	
	public void showTime() {
		System.out.println(this.time + "です。");
	}
}
