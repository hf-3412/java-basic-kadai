package ecf_tec;

public class Main {
	public static void main(String[] args) {
		Clock clock = new Clock("10:30");
		clock.showTime();
		
		AlarmClock alarmClock = new AlarmClock("14:30");
		alarmClock.showTime();
		alarmClock.setAlarm("14:00");
		alarmClock.alarm();
		alarmClock.setAlarm("14:30");
		alarmClock.alarm();
		
		AlarmClock alarmClock2 = new AlarmClock("12:00");
		alarmClock2.showTime();
		alarmClock2.setAlarm("12:00");
		alarmClock2.alarm();
		
	}
}
