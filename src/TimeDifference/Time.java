package TimeDifference;

public class Time {
	private int hour;
	private int minute;

	void setTime(int hour, int minute) {
		this.hour = hour;
		this.minute = minute;
	}

	public int getHour() {
		return hour;
	}

	public int getMinute() {
		return minute;
	}

	void showTime() {
		System.out.println(getHour() + ":" + getMinute());
	}

	Time sum(Time time1, Time time2) {
		Time time3 = new Time();
		time3.hour = time1.getHour() + time1.getHour();
		time3.minute = time1.getMinute() + time2.getMinute();
		if (time3.minute > 60) {
			time3.hour += time3.minute / 60;
			time3.minute = time3.minute % 60;
		}
		return time3;
	}
}
