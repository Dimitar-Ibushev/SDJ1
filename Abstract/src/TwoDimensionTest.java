
public class TwoDimensionTest
{
   public static void main(String[] args)
   {
      Rectangle r1 = new Rectangle(5, 6, 3, 4);
      Circle c1 = new Circle(5, 6, 7);
      TwoDimensionalShape r2 = new Rectangle(5, 6, 3, 4);
      TwoDimensionalShape c2 = new Circle(5, 6, 7);
      
      System.out.println(r1.getArea());
      System.out.println(r2.getArea());
      System.out.println(c1.getArea());
      System.out.println(c2.getArea());
   }
}
