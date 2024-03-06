
package regex22;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex22 {  
    public static void main(String[] args) {
         Pattern p=Pattern.compile("a*b");
     Matcher m1=p.matcher("ba aab");
     if(m1.lookingAt())
     {
         System.out.println(m1.start()+""+m1.end()+""+m1.group());
     }
       
    }
    
}
