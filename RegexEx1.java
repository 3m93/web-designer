
package regexex1;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RegexEx1 {

   
    public static void main(String[] args) {
       /*Pattern p1=Pattern.compile("abc");
       Matcher m1=p1.matcher("abc");
       if(m1.matches())
       {
           System.out.println("Pattern matched successfully");
       }
       else
       {
            System.out.println("Invalid input");
       }*/
       Pattern p1=Pattern.compile("a*b");
       Matcher m1=p1.matcher("aaaaab");
       if(m1.lookingAt())
       {
           System.out.println(m1.start()+""+m1.end()+""+m1.group()); 
       }
    }
    
}
