
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;


public class Deposit extends JFrame implements ActionListener{
    JTextField Deposittextfield;
      JButton backButton, depositButton;
      String pinno;
    Deposit(String Pinno){
        this.pinno=Pinno;
         ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2=i1.getImage().getScaledInstance(800, 800, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,0,800,800);
        add(image);
        
         JLabel text=new JLabel("Enter the amount you want to deposit");
        text.setBounds(160,280,270,30);
        text.setForeground(Color.WHITE);
        text.setFont(new Font( "font family",Font.BOLD, 14));
        image.add(text);
        
         Deposittextfield=new JTextField();
        Deposittextfield.setFont(new Font("Raleway",Font.BOLD,14));
        Deposittextfield.setBounds(160,320,260,25);
        image.add(Deposittextfield);
        
        depositButton=new JButton("Deposit");
        depositButton.setBounds(200,440,80,30);
        image.add(depositButton);
        depositButton.addActionListener(this);
        
        backButton=new JButton("Back");
        backButton.setBounds(300,440,80,30);
        image.add( backButton);
        backButton.addActionListener(this);
        
        
        setSize(800,800);
        setUndecorated(true);
        setLocation(300,0);
        setVisible(true);
    }
     public void actionPerformed(ActionEvent ae)
     {
         if(ae.getSource() == depositButton)
         {
             String Amount=Deposittextfield.getText();
             Date date=new Date();
             if(Amount.equals(""))
             {
                JOptionPane.showMessageDialog(null, "Please enter Amount ");
             }
             else
             {
                 try{
                     Conn c=new Conn();
             String query="insert into bank Values('"+pinno+"','"+date+"','Deposit',"+Amount+")";
             c.s.executeUpdate(query);
             JOptionPane.showMessageDialog(null, "Rs"+Amount+"Deposited Suscessfully");
             setVisible(false);
             new Transaction(pinno).setVisible(true);
                 }
             catch(Exception e)
             {
                 System.out.println(e);
             }
                   
             }
   
         }
         else if(ae.getSource() == backButton)
         {
             setVisible(false);
         }
     }
       public static void main(String args[])
       {
               new Deposit("");
       }

}
