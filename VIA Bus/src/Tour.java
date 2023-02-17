public abstract class Tour
{

   private String origin;

   private MyDate departureDay;

   private MyTime departureTime;

   private MyDate arrivalDay;

   private MyTime arrivalTime;

   private Bus typeOfBus;

   private Chauffeur chauffeur;

   private Customer customer;

   private double price;

   private Bus bus;

   public Tour()
   {
      origin="Horsens";
      departureDay = new MyDate(1,1,1);
      departureTime = new MyTime(12,0);
      arrivalDay = new MyDate(2,1,1);
      arrivalTime = new MyTime(13,0);
      typeOfBus = new Bus("minibus");
      chauffeur = new Chauffeur("_","_",new MyDate(1,1,1));
      customer = new Customer("_","_",new MyDate(1,1,1));
      price = 0;
      bus = new Bus("_");
   }

   public void setOrigin(String origin)
   {
      this.origin=origin;
   }

   public String getOrigin()
   {
      return origin;
   }

   public void setTypeOfBus(Bus typeOfBus)
   {
      this.typeOfBus=typeOfBus;
   }

   public Bus getTypeOfBus()
   {
      return typeOfBus;
   }

   public void setChauffeur(Chauffeur chauffeur)
   {
      this.chauffeur=chauffeur;
   }

   public Chauffeur getChauffeur()
   {
      return chauffeur;
   }

   public void setDepartureDay(MyDate departureDay)
   {
      this.departureDay=departureDay;
   }

   public MyDate getDepartureDay()
   {
      return departureDay;
   }

   public void setDepartureTime(MyTime departureTime)
   {
      this.departureTime=departureTime;
   }

   public MyTime getDepartureTime()
   {
      return departureTime;
   }

   public void setArrivalDay(MyDate arrivalDay)
   {
      this.arrivalDay=arrivalDay;
   }

   public MyDate getArrivalDay()
   {
      return arrivalDay;
   }

   public void setArrivalTime(MyTime arrivalTime)
   {
      this.arrivalTime=arrivalTime;
   }

   public MyTime getArrivalTime()
   {
      return arrivalTime;
   }

   public void setCustomer(Customer customer)
   {
      this.customer=customer;
   }

   public Customer getCustomer()
   {
      return customer;
   }

   public void setPrice(double price)
   {
      this.price=price;
   }

   public double getPrice()
   {
      return price;
   }

   public abstract String toString();

}
