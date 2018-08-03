package TimeDifference;

public class TimeTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Time time1 = new Time();
		Time time2 = new Time();
		time1.setTime(12, 63);
		time2.setTime(11, 13);
		System.out.println("First Time is");
		time1.showTime();
		System.out.println("Second Time is");
		time2.showTime();
		Time time3 = new Time();
		time3 = time3.sum(time1, time2);
		System.out.println("After Sum Time is");
		time3.showTime();
	}
}