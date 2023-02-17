public class Passenger extends People
{

   public Passenger(String name, String address, MyDate birthday)
   {
      super(name, address, birthday);
   }

   public String toString()
   {
      return "Name: " + super.getName() + " Address: " + super.getAddress()
            + " Date of birth: " + super.getBirthday() + "\n";
   }

}
