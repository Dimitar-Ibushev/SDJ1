package GUI;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Welcome extends JFrame
{
   private JPanel viaBus;
   private JPanel buttons;

   private JLabel logo;
   private ImageIcon image;

   private JButton newReservation;
   private JButton displayReservations;

   public Welcome()
   {
      super("VIA Bus");
      
      //VIA Bus logo
      viaBus = new JPanel();
      image = new ImageIcon("viaLogo.png");
      logo = new JLabel(image);
      viaBus.add(logo);

      //button Panel
      buttons = new JPanel();
      //create buttons
      newReservation = new JButton("NEW RESERVATION");
      displayReservations = new JButton("DISPLAY RESERVATIONS");
      //set size
      newReservation.setPreferredSize(new Dimension(250,50));
      displayReservations.setPreferredSize(new Dimension(250,50));
      //add action
      newReservation.addActionListener(new Button());    
      displayReservations.addActionListener(new Button());
      //add buttons to panel
      buttons.add(newReservation);
      buttons.add(displayReservations);
      
      add(viaBus, BorderLayout.NORTH);
      add(buttons, BorderLayout.CENTER);
      setSize(1000, 700);
      setVisible(true);
      setLocationRelativeTo(null);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
   
   private class Button implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         if (e.getSource() == newReservation)
         {
            NewReservation nr = new NewReservation();
            dispose();
         }
         else if (e.getSource() == displayReservations)
         {
            JOptionPane.showMessageDialog(null,"Display reservations");
         }
      }
   }

}
