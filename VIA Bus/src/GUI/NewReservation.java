package GUI;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class NewReservation extends JFrame
{
   private JPanel north;
   private JPanel main;
   private JPanel south;
   
   private JPanel center;
   private JPanel west;
   private JPanel east;
   
   private JPanel viaBus;
   private JPanel type;
   
   private JPanel originPanel;
   private JPanel destinationPanel;
   private JPanel departureDayPanel;
   private JPanel departureTimePanel;
   private JPanel typeOfBusPanel;
   private JPanel chauffeurPanel;
   private JPanel arrivalDayPanel;
   private JPanel arrivalTimePanel;
   private JPanel destinationsPanel;
   
   private ImageIcon image;
   private JLabel logo;
   private JComboBox<String> typeOfTour;
   
   private JLabel originText;
   private JLabel destinationText;
   private JLabel departureDayText;
   private JLabel departureTimeText;
   private JLabel arrivalDayText;
   private JLabel arrivalTimeText;
   private JLabel priceText;
   private JLabel typeOfBusText;
   private JLabel chauffeurText;
   
   private JComboBox<String> origin;
   private JComboBox<String> destination;
   private JComboBox<String> departureDay;
   private JComboBox<String> departureMonth;
   private JComboBox<String> departureYear;
   private JComboBox<String> departureTime;
   private JComboBox<String> arrivalDay;
   private JComboBox<String> arrivalMonth;
   private JComboBox<String> arrivalYear;
   private JComboBox<String> arrivalTime;
   private JComboBox<String> typeOfBus;
   private JComboBox<String> chauffeur;
   
   private JButton destinations;
   
   private JTextField destinationsText;
   private JTextField price;
   
   private JButton next;
   
   public NewReservation()
   {
      super("VIA Bus");
      //north panel
      north = new JPanel();
      north.setLayout(new BoxLayout(north,BoxLayout.Y_AXIS));
      
      viaBus = new JPanel();
      image = new ImageIcon("viaLogo.png");
      logo = new JLabel(image);
      viaBus.add(logo);
      
      type = new JPanel();
      typeOfTour = new JComboBox<String>();
      typeOfTour.addItem("Choose type");
      typeOfTour.addItem("Trip");
      typeOfTour.addItem("Travel");
      typeOfTour.addItem("Bus and Chauffeur");
      typeOfTour.setPreferredSize(new Dimension(150,25));
      type.add(typeOfTour);
      
      north.add(viaBus);
      north.add(type);
      
      //main panel
      main = new JPanel();
      main.setLayout(new BorderLayout());
      //main-west
      west = new JPanel();
      west.setLayout(new BoxLayout(west,BoxLayout.Y_AXIS));
      
      originPanel = new JPanel();
      originPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
      originText = new JLabel("Origin:");
      origin = new JComboBox<String>();
      originPanel.add(originText);
      originPanel.add(origin);
      
      destinationPanel = new JPanel();
      destinationPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
      destinationText = new JLabel("Destination:");
      destination = new JComboBox<String>();
      destinationPanel.add(destinationText);
      destinationPanel.add(destination);
      
      departureDayPanel = new JPanel();
      departureDayPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
      departureDayText = new JLabel("Departure day:");
      departureDay = new JComboBox<String>();
      departureMonth = new JComboBox<String>();
      departureYear = new JComboBox<String>();
      departureDayPanel.add(departureDayText);
      departureDayPanel.add(departureDay);
      departureDayPanel.add(departureMonth);
      departureDayPanel.add(departureYear);
      
      departureTimePanel = new JPanel();
      departureTimePanel.setLayout(new FlowLayout(FlowLayout.LEFT));
      departureTimeText = new JLabel("Departure time:");
      departureTime = new JComboBox<String>();
      departureTimePanel.add(departureTimeText);
      departureTimePanel.add(departureTime);
      
      
      west.add(originPanel);
      west.add(destinationPanel);
      west.add(departureDayPanel);
      west.add(departureTimePanel);
      
      //main-center
      center = new JPanel();
      center.setLayout(new BoxLayout(center,BoxLayout.Y_AXIS));
      
      typeOfBusPanel = new JPanel();
      typeOfBusPanel.setLayout(new FlowLayout(FlowLayout.LEFT));     
      typeOfBusText = new JLabel("Type of bus:");
      typeOfBus = new JComboBox<String>();
      typeOfBusPanel.add(typeOfBusText);
      typeOfBusPanel.add(typeOfBus);
      
      chauffeurPanel = new JPanel();
      chauffeurPanel.setLayout(new FlowLayout(FlowLayout.LEFT)); 
      chauffeurText = new JLabel("Chauffeur:");
      chauffeur = new JComboBox<String>();
      chauffeurPanel.add(chauffeurText);
      chauffeurPanel.add(chauffeur);
      
      arrivalDayPanel = new JPanel();
      arrivalDayPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
      arrivalDayText = new JLabel("Arrival day:");
      arrivalDay = new JComboBox<String>();
      arrivalMonth = new JComboBox<String>();
      arrivalYear = new JComboBox<String>();
      arrivalDayPanel.add(arrivalDayText);
      arrivalDayPanel.add(arrivalDay);
      arrivalDayPanel.add(arrivalMonth);
      arrivalDayPanel.add(arrivalYear);
      
      arrivalTimePanel = new JPanel();
      arrivalTimePanel.setLayout(new FlowLayout(FlowLayout.LEFT));
      arrivalTimeText = new JLabel("Arrival time:");
      arrivalTime = new JComboBox<String>();
      arrivalTimePanel.add(arrivalTimeText);
      arrivalTimePanel.add(arrivalTime);
      
      center.add(typeOfBusPanel);
      center.add(chauffeurPanel);
      center.add(arrivalDayPanel);
      center.add(arrivalTimePanel);
      
      //main-east
      east = new JPanel();
      east.setLayout(new BoxLayout(east,BoxLayout.Y_AXIS));
      
      destinationsPanel = new JPanel();
      destinationsPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
      destinations = new JButton("Destinations");
      destinations.setPreferredSize(new Dimension(200,50));
      destinationsText = new JTextField(200);
      destinationsPanel.add(destinations);
      //destinationsPanel.add(destinationsText);
      
      
      east.add(destinationsPanel);
      
      main.add(west, BorderLayout.WEST);
      main.add(center, BorderLayout.CENTER);
      main.add(east, BorderLayout.EAST);
      
      add(north, BorderLayout.NORTH);
      add(main, BorderLayout.CENTER);
      //add(south, BorderLayout.SOUTH);
      setSize(1000, 700);
      setVisible(true);
      setLocationRelativeTo(null);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setResizable(false);
   }

   public static void main(String[] args)
   {
      NewReservation nr = new NewReservation();
   }
}
