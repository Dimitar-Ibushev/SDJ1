
public class Test
{
   public static void main(String[] args)
   {
      ApartamentComplex complex = new ApartamentComplex("Somewhere");
      complex.add(new Room(1, 50.8));
      complex.getFirstAvailableRoom().rentTo(new Tenant("Someone"), new MyDate(5, 10, 2016));
      
      complex.add(new Apartament(2, 26.33, 4));
      complex.getFirstAvailableApartament(3).rentTo(new Tenant("Another one"), new MyDate(6, 9, 2016));
      

      System.out.println(complex.getFirstAvailableApartament(5));
      //System.out.println(complex);
   }
}
