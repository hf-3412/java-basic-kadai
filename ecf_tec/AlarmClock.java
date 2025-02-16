package ecf_tec;

public class AlarmClock extends Clock {
	protected String alarmTime;
	
	public AlarmClock(String time) {
		super(time);
	}
	
	public void setAlarm(String time) {
		this.alarmTime = time;
		/* ↑「time = this.alarm;」と右左逆に記述 →　式が正常に動作しなかった。原因は「右辺を左辺へ代入するから」
		 という認識であっていますか? */
	}
	
	public void alarm() {
		if(this.time == this.alarmTime) {
			System.out.println("アラームが鳴りました！");
		}
	}
		
	
}
