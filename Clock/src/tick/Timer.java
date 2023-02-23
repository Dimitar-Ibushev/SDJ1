package tick;

public class Timer implements Runnable
{
   private GuiTemperature temp;
   private Clock clock;
   
   public Timer(GuiTemperature temp, Clock clock)
   {
      this.temp = temp;
      this.clock = clock;
   }
   
   public void run()
   {
      while(true)
      {
         temp.showClock(clock.getCurrentTime());
      }
   }
}
