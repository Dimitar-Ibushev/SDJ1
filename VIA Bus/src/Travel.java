import java.util.ArrayList;

public class Travel extends Tour {

	private ArrayList<TravelDestination> destinations;

	private ArrayList<Passenger> passengers;

	public Travel() {
	   destinations=new ArrayList<TravelDestination>();
	   passengers=new ArrayList<Passenger>();
	}

	public void addDestination(String city, MyDate arrivalDay, MyTime arrivalTime) {
		destinations.add(new TravelDestination(city,arrivalDay,arrivalTime));
	}
	
	public void removeDestination(int index)
	{
	   destinations.remove(index);
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
		return "Origin: "+super.getOrigin()+" Destination: "+destinations + "Departure day: "+ super.getDepartureDay() + " Time: " + super.getDepartureTime();
	}

}
