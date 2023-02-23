
public class Tenant
{
   private String name;
   private MyDate rentedFrom;
   
   public Tenant(String name)
   {
      this.name = name;
   }
   
   public String setName(String name)
   {
      return this.name = name;
   }
   
   public String getName()
   {
      return name;
   }

   public MyDate getRentedFrom()
   {
      return rentedFrom;
   }

   public void setRentedFrom(MyDate date)
   {
      rentedFrom = new MyDate(date.getDay(), date.getMonth(), date.getYear());
   }
   
   public String toString()
   {
      return "Name: " + name + "\nRented From: " + rentedFrom;
   }
   
   
}
