/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package regularexpression;

/**
 *
 * @author Win10pro
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegularExpression {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here"^[A-Za-z0-9]+$"
     
        Pattern p=Pattern .compile("0123abc");
        Matcher m=p.matcher("^[A-Za-z0-9]+$");
            
        if(m.matches())
            System.out.println(m.start()+""+m.end()+""+m.group());
    }
    
}

