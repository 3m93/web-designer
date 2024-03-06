package bank.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class SignUpTwo extends JFrame implements  ActionListener{
    JLabel Adetail, religion, category, income , educational, occupation,seniorCitizen, existingAccount,qualification;
      JButton button; 
      JComboBox religionComboBox,catagoryComboBox,incomeComboBox,educationComboBox, occupationComboBox;
      JRadioButton syes, no, eyes,eno;
      String formno;
        SignUpTwo(String Formno)
    {
        this.formno=Formno;
        setLayout(null);
        setTitle("Account Application form -Page 2");
        
        getContentPane().setBackground(Color.WHITE); 
         Adetail=new JLabel("Page 2: Additional Detail");
        Adetail.setBounds(200,40,300,40);
        Adetail.setFont(new Font("font family", Font.BOLD, 22));
        add(Adetail);
        
        
        
        religion=new JLabel("Religion:");
        religion.setBounds(60,130,100,40);
        religion.setFont(new Font("font family", Font.BOLD, 18));
        add(religion);
        String var1[]={"Islam", "Hindu","Christian","Jew", "Sikhism"};
       religionComboBox=new JComboBox(var1);
        religionComboBox.setBounds(200,135,400,30);
        religionComboBox.setBackground(Color.WHITE); 
        add(religionComboBox);
        
         category=new JLabel("Category:");
        category.setBounds(60,190,100,40);
        category.setFont(new Font("font family", Font.BOLD, 18));
        add(category);
        
        String var2[]={"General","OBC","SC","ST","Others"};
       catagoryComboBox=new JComboBox(var2);
        catagoryComboBox.setBounds(200,195,400,30);
        catagoryComboBox.setBackground(Color.WHITE); 
        add(catagoryComboBox);
        
         income=new JLabel("Income:");
        income.setBounds(60,250,100,40);
        income.setFont(new Font("font family", Font.BOLD, 18));
        add(income);
        
        String var3[]={"Null","<100000","<200000","<300000","Up to 500000"};
        incomeComboBox=new JComboBox(var3);
       incomeComboBox.setBounds(200,255,400,30);
        incomeComboBox.setBackground(Color.WHITE); 
        add(incomeComboBox);
        
         educational=new JLabel("Educational");
       educational.setBounds(60,310,150,40);
       educational.setFont(new Font("font family", Font.BOLD, 18));
        add(educational);
        
         
        
         qualification=new JLabel(" Qualification:");
      qualification.setBounds(56,330,150,40);
       qualification.setFont(new Font("font family", Font.BOLD, 18));
        add(qualification);
        
        String var4[]={"Maric","FSC","BS","MS","Others"};
       educationComboBox=new JComboBox(var4);
      educationComboBox.setBounds(200,335,400,30);
        educationComboBox.setBackground(Color.WHITE); 
        add(educationComboBox);
        
        occupation=new JLabel("Occupation:");
      occupation.setBounds(60,380,150,40);
      occupation.setFont(new Font("font family", Font.BOLD, 18));
        add(occupation);
        
         String var5[]={"Salaried","Employee","Bussiness","Student","Retired","Others"};
        occupationComboBox=new JComboBox(var5);
      occupationComboBox.setBounds(200,385,400,30);
        occupationComboBox.setBackground(Color.WHITE); 
        add(occupationComboBox);
        
        seniorCitizen=new JLabel("Senior Citizen:");
       seniorCitizen.setBounds(60,440,150,40);
      seniorCitizen.setFont(new Font("font family", Font.BOLD, 18));
        add(seniorCitizen);
        syes=new JRadioButton("Yes");
        syes.setBounds(250,440, 70,40);
        syes.setFont(new Font("font family", Font.BOLD, 16));
        syes.setBackground(Color.WHITE);
        add(syes);
        
        no=new JRadioButton("No");
        no.setBounds(350,440, 70,40);
        no.setFont(new Font("font family", Font.BOLD, 16));
        no.setBackground(Color.WHITE);
        add(no);
        
        ButtonGroup seniorCitizenGroup=new ButtonGroup();
        seniorCitizenGroup.add(syes);
        seniorCitizenGroup.add(no);
        
       existingAccount=new JLabel("Existing Account:");
       existingAccount.setBounds(60,500,160,40);
       existingAccount.setFont(new Font("font family", Font.BOLD, 18));
        add(existingAccount);
        
        eyes=new JRadioButton("Yes");
        eyes.setBounds(250,500, 70,40);
        eyes.setFont(new Font("font family", Font.BOLD, 16));
        eyes.setBackground(Color.WHITE);
        add(eyes);
        
       eno=new JRadioButton("No");
        eno.setBounds(350,500, 70,40);
        eno.setFont(new Font("font family", Font.BOLD, 16));
        eno.setBackground(Color.WHITE);
        add(eno);
        
        ButtonGroup ExistingAccountGroup=new ButtonGroup();
        ExistingAccountGroup.add(eyes);
        ExistingAccountGroup.add(eno);
        
        button=new JButton("Next");
         button.setBounds(480,580,70,30);
         add(button);
        button.addActionListener(this);
       
        setSize(700,700);
        setLocation(270,0);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        String Religion=(String)religionComboBox.getSelectedItem();
        String Catagory=(String)catagoryComboBox.getSelectedItem();
        String Income=(String)incomeComboBox.getSelectedItem();
        String Education=(String)educationComboBox.getSelectedItem();
        String Occupation=(String)occupationComboBox.getSelectedItem();
        String SeniorCitizen=null;
        if(syes.isSelected())
        {
            SeniorCitizen="Yes";
        }
        else if(no.isSelected())
        {
            SeniorCitizen="No";
        }
        String ExistingAccount=null;
        if(eyes.isSelected())
        {
            ExistingAccount="yes";
        }
        else if(eno.isSelected())
        {
            ExistingAccount="No"; 
        }
        try{
           Conn c=new Conn();
           String query="insert into SignUpTwo values('"+formno+"' , '"+Religion+"', '"+Catagory+"' , '"+Income+"', '"+Education+"','"+ Occupation+"','"+SeniorCitizen+"','" + ExistingAccount+"')";
           c.s.executeUpdate(query);
           setVisible(false);
           new SignUpThree(formno).setVisible(true);
            
        }
        catch(Exception e)
        {
            System.out.println(e); 
        }
            
    }
    public static void main(String args[])
    {
        new SignUpTwo("");
    }

  
    
}



