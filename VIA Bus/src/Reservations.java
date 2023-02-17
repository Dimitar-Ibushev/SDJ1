import java.util.ArrayList;

public class Reservations {

	private ArrayList<Trip> trips;

	private ArrayList<Travel> travels;

	private ArrayList<BusAndChauffeur> busAndChauffeurs;

	public Reservations() {
	   trips = new ArrayList<Trip>();
	   travels = new ArrayList<Travel>();
	   busAndChauffeurs=new ArrayList<BusAndChauffeur>();
	}
	
	public void addTrip(String destination)
	{
	   trips.add(new Trip(destination));
	}
	
	public void removeTrip(int index)
	{
	   trips.remove(index);
	}
	
	public void addTravel()
   {
      travels.add(new Travel());
   }
   
   public void removeTravel(int index)
   {
      travels.remove(index);
   }
   
   public void addBusAndChauffeur()
   {
      busAndChauffeurs.add(new BusAndChauffeur());
   }
   
   public void removeBusAndChauffeur(int index)
   {
      busAndChauffeurs.remove(index);
   }
   
   public ArrayList<Trip> tripsToString()
   {
      return trips;
   }
   
   public ArrayList<Travel> travelsToString()
   {
      return travels;
   }
   
   public ArrayList<BusAndChauffeur> busAndChauffeursToString()
   {
      return busAndChauffeurs;
   }

}
