
package bank.management.system;

import java.awt.*;
import java.awt.event.*;
import java.util.Date;
import javax.swing.*;
import java.sql.*;
public class FastCash extends JFrame implements ActionListener{
    JButton b1,b2,b3,b4,b5,b6;
     String pinno;
    FastCash(String Pinno)
    {
      this.pinno=Pinno;
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2=i1.getImage().getScaledInstance(800, 800, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,0,800,800);
        add(image);
        JLabel text=new JLabel("SELECT WITHDRAW AMOUNT");
        text.setBounds(195,250,250,30);
        text.setForeground(Color.WHITE);
        text.setFont(new Font( "font family",Font.BOLD, 14));
         image.add(text);
        
         b1=new JButton("Rs 100");
        b1.setBounds(180,290,120,30);
        image.add(b1);
        b1.addActionListener(this);
        
        b2=new JButton("Rs 1000");
        b2.setBounds(310,290,120,30);
        b2.addActionListener(this);
        image.add(b2);
        
        
          b3=new JButton("Rs 2000");
        b3.setBounds(180,340,120,30); 
        b3.addActionListener(this);
        image.add(b3);
         
        
        b4=new JButton("Rs 5000");
        b4.setBounds(310,340,120,30); 
        b4.addActionListener(this);
        image.add(b4);
         
        
          b5=new JButton("Rs 10000");
        b5.setBounds(180,390,120,30);
        b5.addActionListener(this);
        image.add(b5);
        
        
          b6=new JButton("Back");
        b6.setBounds(310,390,120,30);
         b6.addActionListener(this);
        image.add(b6);
        setSize(800,800);
        setUndecorated(true);
        setLocation(300,0);
        setVisible(true);  
    }
          public void actionPerformed(ActionEvent ae)
    {
 
      if(ae.getSource() ==b6)
        {
            setVisible(false);
              new Transaction(pinno).setVisible(true);
        } 
      else 
        {
            String amount=((JButton)ae.getSource()).getText().substring(3);
           
           Conn c=new Conn();
            try
            {  
               
                ResultSet rs=c.s.executeQuery("select * from bank where pin='"+pinno+"'");
                int balance=0;
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
                if(ae.getSource()!= b6 && balance<Integer.parseInt(amount))
                {
                  JOptionPane.showMessageDialog(null , "Insufficient Balance");
                  return;
                } 
                Date date=new Date(); 
               String query="insert into bank Values('"+pinno+"','"+date+"','Withdraw',"+amount+")"; 
               c.s.executeUpdate(query);
               JOptionPane.showMessageDialog(null, "Rs"+amount+"Debited Sucessfully");
           setVisible(false);
            new Transaction(pinno).setVisible(true);  
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
      
        }
  }
   public static void main(String args[])
   {
      new FastCash(""); 
   }

    
}
