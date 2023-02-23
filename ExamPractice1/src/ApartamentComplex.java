import java.util.ArrayList;


public class ApartamentComplex
{
   private String address;
   private ArrayList<Residence> residences;
   
   public ApartamentComplex(String address)
   {
      this.address = address;
      residences = new ArrayList<Residence>();
   }
   
   public int getNumberOfResidences()
   {
      return residences.size();
   }
   
   public void add(Residence residence)
   {
      residences.add(residence);
   }
   
   public Residence getResidence(int index)
   {
      return residences.get(index);
   }
   
   public Residence getResidenceByNumber(int number)
   {
      int pos = -1;
      for(int i = 0; i < residences.size(); i++)
      {
         if(residences.get(i).getNumber() == number);
         pos = i;
      }
      return residences.get(pos);
   }
   
   public Room getFirstAvailableRoom()
   {
      int pos = 10;
      for(int i = 0; i < residences.size(); i++)
      {
         if(residences.get(i).getType().equals("Room") && residences.get(i).isAvailable() == true)
         {
         pos = i;
         break;
         }
      }
      return (Room) residences.get(pos);
   }
   
   public Apartament getFirstAvailableApartament(int minRooms)
   {
      int pos = -1;
      for(int i = 0; i < residences.size(); i++)
      {
         System.out.println(residences.get(i).getType().equals("Apartament") +" "+ residences.get(i).isAvailable() +" "+ residences.get(i).getNumberOfRooms() +" "+minRooms);
         if(residences.get(i).getType().equals("Apartament") && residences.get(i).isAvailable() == true && residences.get(i).getNumberOfRooms() <= minRooms)
         {
            System.out.println("!!!!!!");
         pos = i;
         break;
         }
      }
      
      if(pos!=-1)
      return (Apartament) residences.get(pos);
      else
         return null;
   }
   
   public String toString()
   {
      String s = address + "\n";
      for(int i = 0; i < residences.size(); i++)
      {
         s += residences.get(i).toString() + "\n";
      }
      return s;
   }
}
