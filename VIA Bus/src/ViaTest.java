
public class ViaTest
{
   public static void main(String[] args)
   {
      Chauffeur chauf1 = new Chauffeur("Dan Plamadeala", "Bulowsgade 10", new MyDate(15,12,1997));
      chauf1.setSalaryPerHour(5);
      System.out.println(chauf1);
   }

}
