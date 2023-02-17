import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyDate {

	private int day;

	private int month;

	private int year;
	
	public MyDate(int day, int month, int year) {
	   this.day = day;
	   this.month = month;
	   this.year = year;
	}

	public void setDay(int day) {
	   this.day = day;
	}

	public void setMonth(int month) {
	   this.month = month;
	}

	public void setYear(int year) {
	   this.year = year;
	}

	public int getDay() {
		return day;
	}

	public int getMonth() {
		return month;
	}

	public int getYear() {
		return year;
	}
	
	public String today()
	{
	   DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	   Date date = new Date();
	   return dateFormat.format(date);
	}

	public String toString() {
		return day + "." + month + "." + year;
	}

}
