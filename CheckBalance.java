
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;


public class CheckBalance extends JFrame implements ActionListener{
    JButton back;
    String pinno;  
  
    CheckBalance(String Pinno)
    {
        this.pinno=Pinno;
        setLayout(null);
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2=i1.getImage().getScaledInstance(800,800,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,0,800,800);
        add(image);
        
        
        back=new JButton("Back");
        back.setBounds(250,450,90,30);
        add(back);
        back.addActionListener(this);
          int balance=0; 
          Conn c=new Conn();
      
        try
            {  
               
                ResultSet rs=c.s.executeQuery("select * from bank where pin='"+pinno+"'");
              
                while(rs.next())
                {
                    if(rs.getString("type").equals("Deposit"))
                    {
                        balance+=Integer.parseInt(rs.getString("amount"));
                    }
                    else{
                        balance-=Integer.parseInt(rs.getString("amount"));
                    }
                }
            }
            
                catch(Exception e)
            {
                System.out.println(e);
            }
           
         JLabel text=new JLabel("Your Current Account Balance is Rs "+balance) ;
         text.setForeground(Color.WHITE);
         text.setBounds(150,280,250,40);
         image.add(text);
        
        setSize(800,800);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae)
    {
       setVisible(false);
       new Transaction(pinno).setVisible(true);
    }
    public static void main(String args[])
    {
        new CheckBalance("");
    }
}
