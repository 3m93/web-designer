
package bank.management.system;


import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class Login extends JFrame implements ActionListener{
    JButton SignIn , SignUp, CLEAR;
    JTextField forcardno;
    JPasswordField forpin;
    Login()
    {
        setTitle("Autometed teller machine");
       setLayout(null);
       
       // Image Section
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2=i1.getImage().getScaledInstance(100, 100,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel label=new JLabel(i3);
        label.setBounds(70,10,100,100);
        add(label);
        
        
        //Labels section
        JLabel text=new JLabel("WellCome To ATM");
        text.setBounds(200,45,300,40);
        text.setFont(new Font("Osward", Font.BOLD , 32));
        add(text);
        
        JLabel card=new JLabel("Card No:");
        card.setBounds(120,130,150,40);
        card.setFont(new Font("Osward", Font.BOLD , 28));
        add(card);
        
        // text field for card 
      forcardno=new JTextField();
       forcardno.setBounds(280,137,270,30);
       add(forcardno);
        
        JLabel pin=new JLabel("Pin:");
        pin.setBounds(120,190,100,40);
        pin.setFont(new Font("Osward", Font.BOLD , 28));
        add(pin);
        
         
        // text field for pin 
        forpin=new JPasswordField();
       forpin.setBounds(280,197,270,30);
       add(forpin);
       
        SignIn=new JButton("SIGN IN");
       SignIn.setBounds(300, 260, 80, 30);
       SignIn.addActionListener(this);
       add(SignIn);
       
        SignUp=new JButton("SIGN UP");
       SignUp.setBounds(410, 260, 80, 30);
       SignUp.addActionListener(this);
       add(SignUp);
       
        CLEAR=new JButton("CLEAR");
       CLEAR.setBounds(340, 320, 130, 30);
       CLEAR.addActionListener(this);
       add(CLEAR);
        
        
        //Frame colour
        getContentPane().setBackground(Color.WHITE);
        setSize(800,480);
        setLocation(350, 200);
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae)
    {
            if(ae.getSource()  ==CLEAR)
    {
        forcardno.setText("");
        forpin.setText("");
    }
    else if(ae.getSource() ==SignUp)
    {
        setVisible(false);
        new SignUpOne().setVisible(true);
    }
   
    else if(ae.getSource() ==SignIn)
    {     Conn con=new Conn();
         String cardno= forcardno.getText();
         String Pin=forpin.getText();
       
         String query="select *from login where CardNo='"+cardno+"' and Pin='"+Pin+"'";
      try{
         ResultSet rs= con.s.executeQuery(query);
         if(rs.next())
         {
             setVisible(false);
             new Transaction(Pin).setVisible(true);
         }
         else
         {
             JOptionPane.showMessageDialog(null, "Incorrect Cardno or Pin");
         }
          }
    catch(Exception e)  
      {
         System.out.println(e);
           }
    }
    
    }

    public static void main(String args[])
    {
        new Login();
    }
    
}
