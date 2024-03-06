
package bank.management.system;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Pinchange extends JFrame implements ActionListener{
    
    JPasswordField PINChangetextfield, Retextfield;
     JButton change,back;
    String pinno;
   
    Pinchange(String Pin)
    {
       this.pinno=Pin;
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2=i1.getImage().getScaledInstance(800, 800, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,0,800,800);
        add(image);
        
         JLabel text=new JLabel("CHANGE YOUR PIN");
        text.setBounds(210,270,250,30);
        text.setForeground(Color.WHITE);
        text.setFont(new Font( "font family",Font.BOLD, 14));
         image.add(text);
         
          JLabel pintext=new JLabel("Enter New PIN:");
        pintext.setBounds(140,310,250,30);
        pintext.setForeground(Color.WHITE);
        pintext.setFont(new Font( "font family",Font.BOLD, 14));
         image.add(pintext);
         
           
         PINChangetextfield=new JPasswordField();
         PINChangetextfield.setFont(new Font("Raleway",Font.BOLD,12)); 
         PINChangetextfield.setBounds(270,310,180,25);
        image.add(  PINChangetextfield);
                 
                  JLabel Repintext=new JLabel("Re-Enter New PIN:");
        Repintext.setBounds(140,370,250,30);
        Repintext.setForeground(Color.WHITE);
        Repintext.setFont(new Font( "font family",Font.BOLD, 14));
         image.add(Repintext);
         
        Retextfield=new JPasswordField();
         Retextfield.setFont(new Font("Raleway",Font.BOLD,12));
         Retextfield.setBounds(270,370,180,25);
        image.add(  Retextfield);
        
        change=new JButton("Change");
        change.setBounds(210,450,90,30);
        image.add(change);
        change.addActionListener(this);
                
         back=new JButton("Back");
        back.setBounds(310,450,90,30);
        image.add(back);
        back.addActionListener(this);
        
         setSize(800,800);
        setUndecorated(true);
        setLocation(300,0);
        setVisible(true); 
        
    }
    
    public void actionPerformed(ActionEvent ae)
            
    { if(ae.getSource() ==change)
        {
               try {
            String npin=PINChangetextfield.getText();
            String rpin=Retextfield.getText();
            if(!npin.equals(rpin))
            {
                JOptionPane.showMessageDialog(null, "Incorrect");
               return;
            }
            if(npin.equals(""))
            {
                JOptionPane.showMessageDialog(null,"Please Enter Pin");
                return;
            }
            if(rpin.equals(""))
            {
                JOptionPane.showMessageDialog(null,"Please Re-enter Pin");
                return; 
            }
            Conn c=new Conn();
            String query1="Update bank set pin='"+npin+"'where pin ='"+pinno+"'";
            String query2="Update login set pin='"+npin+"'where pin ='"+pinno+"'";
             String query3="Update SignUpThree set pin='"+npin+"'where pin ='"+pinno+"'";
             c.s.executeUpdate(query1);
             c.s.executeUpdate(query2);
             c.s.executeUpdate(query3);
             JOptionPane.showMessageDialog(null,"Pin changed sucessfully");
             setVisible(false);
             new Transaction(pinno).setVisible(true);
             
            
        }
        
        catch (Exception e)
        {
            System.out.println(e);
        }
  }
        else if(ae.getSource() ==back)
        {
            setVisible(false);
            new Transaction(pinno).setVisible(true);
            
        }
     
    }
     public static void main(String args[])
   {
      new Pinchange(""); 
   }
}
