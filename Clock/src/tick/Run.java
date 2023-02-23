package tick;

public class Run
{
   public static void main(String[] args)
   {
      Clock clock = new Clock();
      clock.set(5, 3, 4);
      Temperature temp = new Temperature();
      Show showClock = new Show(clock);
      Update updateClock = new Update(clock);
      Thread showClockThread = new Thread(showClock);
      Thread updateClockThread = new Thread(updateClock);
      GuiTemperature view = new GuiTemperature(temp, clock);
      view.setVisible(true);
      //Timer timer = new Timer(view, clock);
      Thread updateGUI = new Thread(view);
      showClockThread.start();
      updateClockThread.start();
      updateGUI.start();
      System.out.println("MAIN ENDED");
      

   }
}
