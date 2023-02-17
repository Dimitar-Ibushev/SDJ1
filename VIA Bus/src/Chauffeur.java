public class Chauffeur extends People
{

   private String wish;

   private double salaryPerHour;
   
   public Chauffeur(String name, String address, MyDate birthday)
   {
      super(name, address, birthday);
      this.wish=wish;
      this.salaryPerHour=salaryPerHour;
   }

   public Chauffeur(String name, String address, MyDate birthday, String wish, double salaryPerHour)
   {
      super(name, address, birthday);
      this.wish=wish;
      this.salaryPerHour=salaryPerHour;
   }
   
   public void setWish(String wish)
   {
      this.wish=wish;
   }
   
   public String getWish()
   {
      return wish;
   }
   
   public void setSalaryPerHour(double salaryPerHour)
   {
      this.salaryPerHour=salaryPerHour;
   }
   
   public double getSalaryPerHour()
   {
      return salaryPerHour;
   }

   public boolean isAvailable()
   {
      return false;
   }

   public String toString()
   {
      return "Name: "+super.getName()+" Salary per hour: "+getSalaryPerHour()+"$ Wish: "+getWish();
   }

}
