
package bank.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Transaction extends JFrame implements ActionListener{
     JButton b1,b2,b3,b4,b5,b6;
     String pinno;
    Transaction(String Pinno)
    {
        this.pinno=Pinno;
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2=i1.getImage().getScaledInstance(800, 800, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,0,800,800);
        add(image);
        JLabel text=new JLabel("Please select your transaction");
        text.setBounds(195,250,250,30);
        text.setForeground(Color.WHITE);
        text.setFont(new Font( "font family",Font.BOLD, 14));
        
         b1=new JButton("Deposit");
        b1.setBounds(180,290,120,30);
        image.add(b1);
        b1.addActionListener(this);
        
        b2=new JButton("Withdraw");
        b2.setBounds(310,290,120,30);
        image.add(b2);
           b2.addActionListener(this);
        
          b3=new JButton("Fast Cash");
        b3.setBounds(180,340,120,30);
        image.add(b3);
           b3.addActionListener(this);
        
        b4=new JButton("Check Balance");
        b4.setBounds(310,340,120,30);
        image.add(b4);
           b4.addActionListener(this);
        
          b5=new JButton("Pin Change");
        b5.setBounds(180,390,120,30);
        image.add(b5);
           b5.addActionListener(this);
        
          b6=new JButton("Exit");
        b6.setBounds(310,390,120,30);
        image.add(b6);
           b6.addActionListener(this);
        
        setSize(800,800);
        setUndecorated(true);
        setLocation(300,0);
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() ==b1)
        {
            setVisible(false);
            new Deposit(pinno).setVisible(true);
        }
        else if(ae.getSource() ==b2)
        {
             setVisible(false);
            new Withdraw(pinno).setVisible(true);
        }
        else if(ae.getSource() ==b3)
        {
             setVisible(false);
            new FastCash(pinno).setVisible(true);
        }
        else if(ae.getSource() ==b4)
        {
            setVisible(false);
            new CheckBalance(pinno).setVisible(true);
        }
        else if(ae.getSource() ==b5)
        {
            setVisible(false);
            new Pinchange(pinno).setVisible(true);
        }
        else if(ae.getSource() ==b6)
        {
            System.exit(0);
        }
              
        
        
    }
        
        
   public static void main(String args[])
   {
      new Transaction(""); 
   }
}
