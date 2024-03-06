
package bank.management.system;
import com.toedter.calendar.JDateChooser;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


import java.util.Random;


public class SignUpOne extends JFrame implements ActionListener{
    long random;
     JLabel  formno,personalDetails,name, fathername ,dob , gander, Email, Mstatus, Address , city, state
             , pincode;
     JTextField nametextfield, addresstextfield,   emailtextfield , fathernametextfield, 
           citytextfield ,statetextfield   , pintextfield;
     JButton next;
     JRadioButton married , unmarried, other, male , female;
      JDateChooser datechooser;
            
    JButton button;
    SignUpOne( )
    {
        setLayout(null);
        Random ran=new Random();
        random=(Math.abs((ran.nextLong()%9000L)+1000L));
        
        formno=new JLabel("Application Form No."+random);
        formno.setBounds(140,20,600,40);
        formno.setFont(new Font("font family",Font.BOLD, 32));
        add(formno);
        
        personalDetails=new JLabel("Personal Details");
        personalDetails.setBounds(280,70,350,30);
        personalDetails.setFont(new Font("font family",Font.BOLD, 18));
        add(personalDetails);
        
         name=new JLabel("Name:");
        name.setBounds(90,110,350,30);
        add(name);
         nametextfield=new JTextField();
        nametextfield.setFont(new Font("Raleway",Font.BOLD,14));
        nametextfield.setBounds(200,110,400,30);
        add(nametextfield);
       
        
        fathername=new JLabel("Father Name:");
        fathername.setBounds(90,160,350,30);
        add(fathername);
        
         fathernametextfield=new JTextField();
        fathernametextfield.setFont(new Font("Raleway",Font.BOLD,14));
        fathernametextfield.setBounds(200,160,400,30);
        add(fathernametextfield);
        
         dob=new JLabel("Date Of Birth:");
        dob.setBounds(90,210,350,30);
        add(dob);
         datechooser=new JDateChooser();
        datechooser.setBounds(200,210,350,30);
        add(datechooser);
        
         
        
         gander=new JLabel("Gander:");
        gander.setBounds(90,260,350,30);
        add(gander);
        
         male=new JRadioButton("Male");
         male.setBounds(250,260,80,30);
         male.setBackground(Color.WHITE);
         add(male);
         
         female=new JRadioButton("Female");
         female.setBounds(370,260,80,30);
          female.setBackground(Color.WHITE);
         add(female);
         
         
         
         ButtonGroup  gendergroup=new ButtonGroup();
         gendergroup.add(male);
         gendergroup.add(female);
         
        
        Email=new JLabel("Email");
        Email.setBounds(90,310,350,30);
        add(Email); 
         emailtextfield =new JTextField();
        emailtextfield .setFont(new Font("Raleway",Font.BOLD,14));
        emailtextfield .setBounds(200,310,400,30);
        add(emailtextfield );
        
         Mstatus=new JLabel("Marital Status:");
        Mstatus.setBounds(90,360,350,30);
        add(Mstatus);
        
         married=new JRadioButton("Married");
        married.setBounds(250,360,70,30);
        married.setBackground(Color.WHITE);
        add(married);
        
         unmarried=new JRadioButton("Unmarried");
         unmarried.setBounds(370,360,90,30);
         unmarried.setBackground(Color.WHITE);
         add(unmarried);
         
       
         other=new JRadioButton("Other");
         other.setBounds(490,360,80,30);
         other.setBackground(Color.WHITE);
         add(other);
         
        ButtonGroup marriedgroup=new ButtonGroup();
        marriedgroup.add(married);
        marriedgroup.add(unmarried);
        marriedgroup.add(other);
        Address =new JLabel("Address:");
        Address.setBounds(90,410,350,30);
        add(Address);
         addresstextfield=new JTextField();
        addresstextfield.setFont(new Font("Raleway",Font.BOLD,14));
        addresstextfield.setBounds(200,410,400,30);
        add(addresstextfield);
        
        city=new JLabel("City:");
        city.setBounds(90,460,350,30);
        add(city);
         citytextfield=new JTextField();
        citytextfield.setFont(new Font("Raleway",Font.BOLD,14));
        citytextfield.setBounds(200,460,400,30);
        add(citytextfield);
        
        state=new JLabel("State:");
        state.setBounds(90,510,350,30);
        add(state);
         statetextfield=new JTextField();
        statetextfield.setFont(new Font("Raleway",Font.BOLD,14));
        statetextfield.setBounds(200,510,400,30);
        add(statetextfield);
        
        pincode=new JLabel("Pin Code:");
        pincode.setBounds(90,560,350,30);
        add(pincode);
        pintextfield=new JTextField();
        pintextfield.setFont(new Font("Raleway",Font.BOLD,14));
        pintextfield.setBounds(200,560,400,30);
        add(pintextfield);
     
         button=new JButton("Next");
         button.setBounds(500,620,70,30);
         add(button);
         button.addActionListener(this);
        getContentPane().setBackground(Color.WHITE);
        setSize(750, 800);
        setLocation(400,15);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae)
    {
        String Formno=" "+random;
        String name=nametextfield.getText(); 
        String fathername=fathernametextfield.getText();
        String dob=((JTextField)datechooser.getDateEditor().getUiComponent()).getText();
        String gander=null;
        if(male.isSelected())
        {
            gander="Male";
        }
        else if(female.isSelected())
        {
            gander="female";
        }
        String Mstatus=null;
        if(married.isSelected())
        {
            Mstatus="Married";
            
        }
        else if(unmarried.isSelected())
        {
            Mstatus="Unmarried";
        }
        else if(other.isSelected())
        {
            Mstatus="Other";
        }
        String Email=emailtextfield.getText();
        String Address=addresstextfield.getText();
        String city=citytextfield.getText();
        String state=statetextfield.getText();
        String pincode=pintextfield.getText();
        
        try{
            if(name.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Name is Required");
            }
            else{
                Conn c=new Conn();
                String query="insert into signup values('"+Formno+"' , ' "+name+"',' "+fathername+"',' "+dob+" ' , ' "+gander+"' , ' "+Email+" ', ' "+Mstatus+" ' , ' "+city+"')";
                c.s.executeUpdate(query);
                
                setVisible(false);
               new SignUpTwo(Formno).setVisible(true);
           
            }
           /* else if(fathername.equals(""))
            {
                JOptionPane.showMessageDialog(null, "FatherName is Required");
            }
              if(dob.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Date Of Birth is Required");
            }
              if(Email.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Email is Required");
            }
               if(Address.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Address is Required");
            }
                if(city.equals(""))
            {
                JOptionPane.showMessageDialog(null, "City is Required");
            }*/
        }
          catch(Exception e)  
                  {
                  System.out.println(e);
                  }
    }
                    
        
    
   
    public static void main(String args[])
    {
        new SignUpOne();
    }

   
    
}
