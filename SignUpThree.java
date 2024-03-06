
package bank.management.system;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;



public class SignUpThree extends JFrame implements ActionListener {
    JRadioButton r1,r2,r3,r4;
    JCheckBox b1 , b2, b3 , b4 , b5, b6, b7;
    JButton submit , cancel;
    String Formno;
   
    SignUpThree(String Formno)
    {
        this.Formno=Formno;
        setLayout(null);
     JLabel  AccountDetail =new JLabel("Page 3:Account Detail");
     AccountDetail.setFont(new Font("font family",Font.BOLD,28));
     AccountDetail.setBackground(Color.WHITE);
     AccountDetail.setBounds(200, 40, 300,40);     
     add(AccountDetail);
     
      JLabel  AccountType =new JLabel("Account Type");
     AccountType.setFont(new Font("font family",Font.BOLD,18));
      AccountDetail.setBackground(Color.WHITE);
     AccountType.setBounds(100, 140, 150,30);     
     add(AccountType);
     
      r1 =new JRadioButton("Saving Account");
       r1.setBackground(Color.WHITE);
    r1.setFont(new Font("font family",Font.BOLD,16));
     r1.setBounds(100, 180, 150,40);     
     add(r1);
     
      r2 =new JRadioButton("Fixed Deposite Account");
      r2.setBackground(Color.WHITE);
    r2.setFont(new Font("font family",Font.BOLD,16));
     r2.setBounds(350, 180, 250,40);     
     add(r2);
 
     
      r3 =new JRadioButton("Current Account");
      r3.setBackground(Color.WHITE);
    r3.setFont(new Font("font family",Font.BOLD,16));
     r3.setBounds(100, 230, 160,40);     
     add(r3);
     
      r4 =new JRadioButton("Recurring Deposite Account");
       r4.setBackground(Color.WHITE);
    r4.setFont(new Font("font family",Font.BOLD,16));
     r4.setBounds(350, 230, 250,40);     
     add(r4);
     ButtonGroup r=new ButtonGroup();
     r.add(r3);
     r.add(r4);
     r.add(r1);
     r.add(r2);
     
     JLabel card =new JLabel("Card Number:");
     card.setFont(new Font("font family",Font.BOLD,16));
      card.setBackground(Color.WHITE);
     card.setBounds(100, 300, 150,30);     
     add(card);
    
      JLabel number=new JLabel("XXXX-XXXX-XXXX-2345");
     number.setFont(new Font("font family",Font.BOLD,16));
     number.setBackground(Color.WHITE);
      number.setBounds(300, 300, 250,30);     
     add( number);
     
     JLabel CardDetail=new JLabel("(Your 16 digit card no)");
    CardDetail.setFont(new Font("font family",Font.BOLD,10));
   CardDetail.setBackground(Color.WHITE);
      CardDetail.setBounds(100, 320, 250,30);     
     add(  CardDetail);
     
     JLabel pin =new JLabel("Pin Number:");
     pin.setFont(new Font("font family",Font.BOLD,18));
      pin.setBackground(Color.WHITE);
     pin.setBounds(100, 360, 150,30);     
     add(pin);
    
      JLabel pnumber=new JLabel("XXXX");
     pnumber.setFont(new Font("font family",Font.BOLD,18));
      pnumber.setBackground(Color.WHITE);
      pnumber.setBounds(300, 360, 250,30);     
     add( pnumber);
     
    JLabel pinDetail=new JLabel("(Your 4 digit pin)");
    pinDetail.setFont(new Font("font family",Font.BOLD,10));
     pinDetail.setBackground(Color.WHITE);
     pinDetail.setBounds(100, 380, 250,30);     
     add(  pinDetail);
     
     JLabel services=new JLabel("Services Required:");
    services.setFont(new Font("font family",Font.BOLD,18));
     services.setBackground(Color.WHITE);
      services.setBounds(100, 430, 250,30);     
     add(   services);
     
     b1=new JCheckBox("ATM CARD");
    b1.setFont(new Font("font family",Font.BOLD,16));
     b1.setBackground(Color.WHITE);
     b1.setBounds(100, 470, 150,30);
     add(b1);
     
     b2=new JCheckBox("Internet Banking");
    b2.setFont(new Font("font family",Font.BOLD,16));
     b2.setBackground(Color.WHITE);
     b2.setBounds(300, 470, 200,30);
     add(b2);
     
     b3=new JCheckBox("Mobile Banking");
    b3.setFont(new Font("font family",Font.BOLD,16));
     b3.setBackground(Color.WHITE);
     b3.setBounds(100, 520, 200,30);
     add(b3);
     
     b4=new JCheckBox("EMAIL AND SMS Alerts");
    b4.setFont(new Font("font family",Font.BOLD,16));
   b4.setBackground(Color.WHITE);
     b4.setBounds(300, 520, 250,30);
     add(b4);
     
     b5=new JCheckBox("Cheque Book");
    b5.setFont(new Font("font family",Font.BOLD,16));
    b5.setBackground(Color.WHITE);
     b5.setBounds(100, 570, 200,30);
     add(b5);
     
     b6=new JCheckBox("E-Statement");
    b6.setFont(new Font("font family",Font.BOLD,16));
     b6.setBackground(Color.WHITE);
     b6.setBounds(300, 570, 200,30);
     add(b6);
     
      b7=new JCheckBox("Hereby Decision that the above entered details are correct to the best of my knowledge");
    b7.setFont(new Font("font family",Font.BOLD,12));
   b7.setBackground(Color.WHITE);
     b7.setBounds(80, 610, 530,30);
     add(b7);
      submit=new JButton("Submitt");
        submit.setBounds(500,640,90,30);
         add(submit);
         submit.addActionListener(this);
         
        cancel=new JButton("Cancel");
       cancel.setBounds(380,640,90,30);
         add(cancel);
        cancel.addActionListener(this);
     
     
     
    getContentPane().setBackground(Color.WHITE);
     add(AccountDetail);
     setSize(750,750);
       setLocation(300,0);
       setVisible(true);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() ==submit)
        {
          String  AccountType=null;
          if(r1.isSelected())
          {
              AccountType="Saving Account";
          }
          else if (r2.isSelected())
          {
              AccountType="Fixed Deposite Account";
          }
          else if(r3.isSelected())
          {
              AccountType="Current Account";
        }
          else if (r4.isSelected())
          {
             AccountType="Recurring Deposite Account";
          }
        else if (ae.getSource() ==cancel)
        {
           
        }
     Random random = new Random();
     String cardNumber=" "+Math.abs((random.nextLong()%90000000L)+3456355600000000L);
     String pinNumber= " "+Math.abs((random.nextLong()%9000L)+1000);
     String Services="";
     if(b1.isSelected())
     {
         Services="ATM CARD";
     }
     else if(b2.isSelected())
     {
         Services=Services+"Internet Banking";
     }
    else if(b3.isSelected())
     {
         Services=Services+"E-Statement";
     }
    else if(b4.isSelected())
     {
         Services=Services+"Mobile Banking";
     }
    else  if(b5.isSelected())
     {
         Services=Services+"EMAIL AND SMS Alerts";
     }
    else if(b6.isSelected())
     {
         Services=Services+"Cheque Book";
     }
     try{
         if(AccountType.equals(""))
         {
             JOptionPane.showMessageDialog(null,"Account Type is Required");
         }
         else {
              Conn c=new Conn();
              String query="insert into SignUpThree Values( '"+Formno+"'  ,'"+AccountType+"','"+cardNumber+"','"+pinNumber+"','"+Services+"')"; 
              String query2="insert into login values('"+Formno+"'  ,'"+cardNumber+"',"+pinNumber+")";
         c.s.executeUpdate(query); 
         c.s.executeUpdate(query2); 
         JOptionPane.showMessageDialog(null, "Card no:"+cardNumber+"\n Pin:"+pinNumber);
         setVisible(false);
         new Deposit(pinNumber).setVisible(true);
         }
        
     }
     catch(Exception e)
     {
         System.out.println(e);
     }
        }
        else if(ae.getSource() ==cancel)
        {
             setVisible(false);
             new Login().setVisible(true);
        }
    }
    
    
    public static void main(String args[])
    {
        new SignUpThree("");
    }
    
}
