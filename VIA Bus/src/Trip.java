import java.util.ArrayList;

public class Trip extends Tour {

	private String destination;

	private ArrayList<Passenger> passengers;

	public Trip(String destination) {
	   this.destination=destination;
	   passengers=new ArrayList<Passenger>();
	}

	public void setDestination(String destination) {
	   this.destination=destination;
	}

	public String getDestination() {
		return destination;
	}
	
	public void addPassenger(String name, String address, MyDate birthday)
   {
      passengers.add(new Passenger(name,address,birthday));
   }
	
	public void removePassenger(int index)
	{
	   passengers.remove(index);
	}

	public String toString() {
		return "Origin: "+super.getOrigin()+" Destination: "+destination + "Departure day: "+ super.getDepartureDay() + " Time: " + super.getDepartureTime();
	}

}
