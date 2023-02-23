package tick;



public class Show implements Runnable
{
   private Clock clock;
   
   public Show(Clock clock)
      {
         this.clock = clock;
      }
   
   public void run()
      {
         while(true)
         {
            clock.tick();
            System.out.println(clock);
            try
            {
               Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {
               e.printStackTrace();
            }
         }
      }
}
