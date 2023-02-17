public class MyTime {

	private int minutes;

	private int hours;

	public MyTime(int hours, int minutes) {
	   this.hours = hours;
	   this.minutes = minutes;
	}

	public void setHours(int hours) {
	   this.hours = hours;
	}

	public int getHours() {
		return hours;
	}

	public void setMinutes(int minutes) {
	   this.minutes = minutes;
	}

	public int getMinutes() {
		return minutes;
	}

	public String toString() {
		return hours + ":" + minutes;
	}

}
