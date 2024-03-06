
package regex33;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Regex33 {

    public static void main(String[] args) {
            Pattern p=Pattern.compile("a*b");
     Matcher m1=p.matcher("ab aabcba");
     if(m1.find())
     {
         System.out.println(m1.start()+""+m1.end()+""+m1.group());
     }
       
    }
      
}
