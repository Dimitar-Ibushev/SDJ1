package tick;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class Clock
{
   private int hour;
   private int minute;
   private int second;
   
   public Clock()
   {
      hour = 0;
      minute = 0;
      second = 0;
   }
   
   public void set(int hour, int minute, int second)
   {
      this.hour = hour;
      this.minute = minute;
      this.second = second;
   }
   
   public void tick()
   {
      if(second < 59)
      {
         second++;
      }
      else
      {
         if(minute < 59)
         {
            second = 0;
            minute++;
         }
         else
         {
            if(hour < 23)
            {
               second = 0;
               minute = 0;
               hour++;
            }
            else
            {
               second = 0;
               minute = 0;
               hour = 0;
            }
         }
      }
   }
   
   public String getCurrentTime()
   {
      SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
      return format.format(new Date(hour, minute, second));
   }
   
   public String toString()
   {
      return hour + ":" + minute + ":" + second;
   }
}
