
public class MyDate
{
   private int date, month, year;
   
   public MyDate(int date, int month, int year)
   {
      this.date = date;
      this.month = month;
      this.year = year;
   }
   
   public int getDay()
   {
      return date;
   }
   
   public int getMonth()
   {
      return month;
   }
   
   public int getYear()
   {
      return year;
   }
   
   public void set(int date, int month, int year)
   {
      this.date = date;
      this.month = month;
      this.year = year;
   }
   
   public MyDate copy()
   {
      return new MyDate(date, month, year);
   }
   
   public String toString()
   {
      return date + "." + month + "." + year;
   }
}
