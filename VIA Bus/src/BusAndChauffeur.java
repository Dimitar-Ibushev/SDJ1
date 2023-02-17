public class BusAndChauffeur extends Tour {

	public BusAndChauffeur() {
	   
	}

	public String toString() {
	   return "Origin: "+super.getOrigin()+"Departure day: "+ super.getDepartureDay() + " Time: " + super.getDepartureTime() + "Arrival day: "+super.getArrivalDay();
	}

}
