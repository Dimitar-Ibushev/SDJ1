
public class Room extends Residence
{
   public Room(int number, double size)
   {
      super(number, size, "Room");
   }
   
   public int getNumberOfRooms()
   {
      return 1;
   }
   
   public String toString()
   {
      return super.toString() + "\nNumber of Rooms: 1";
   }
}
