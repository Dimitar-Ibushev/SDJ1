
public abstract class Residence
{
   private int number;
   private double size;
   private String type;
   private Tenant rentedTo;
   
   public Residence(int number, double size, String type)
   {
      this.number = number;
      this.size = size;
      this.type = type;
      rentedTo = new Tenant("No one");
   }
   
   public int getNumber()
   {
      return number;
   }
   
   public double getSize()
   {
      return size;
   }
   
   public String getType()
   {
      return type;
   }
   
   public boolean isAvailable()
   {
      return !(rentedTo.getName().equals("None"));
   }
   
   public void rentTo(Tenant tenant, MyDate rentedFrom)
   {
      rentedTo.setName(tenant.getName());
      rentedTo.setRentedFrom(rentedFrom);
   }
   
   public Tenant getTenant()
   {
      return rentedTo;
   }
   
   public abstract int getNumberOfRooms();
   
   public String toString()
   {
      if(isAvailable())
      {
      return "Number: " + number + "\nSize: " + size + "\nType: " + type + "\nAvailable For Rent.";
      }
      else return "Number: " + number + "\nSize: " + size + "\nType: " + type + "\nTenant: " + getTenant();
   }
}
