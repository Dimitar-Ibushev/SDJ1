public class TravelDestination {

	private String city;

	private MyDate arrivalDay;

	private MyTime arrivalTime;
	

	public TravelDestination(String city, MyDate arrivalDay, MyTime arrivalTime) {
	   this.city=city;
	   this.arrivalDay=arrivalDay;
	   this.arrivalTime=arrivalTime;
	}

	public void setArrivalDay(MyDate arrivalDay) {
	   this.arrivalDay=arrivalDay;
	}

	public MyDate getArrivalDay() {
		return arrivalDay;
	}

	public void setArrivalTime(MyTime arrivalTime) {
	   this.arrivalTime=arrivalTime;
	}

	public MyTime getArrivalTime() {
		return arrivalTime;
	}

	public String toString() {
		return "City: "+city+" Arrival day: "+arrivalDay+" Time: "+arrivalTime;
	}

}
