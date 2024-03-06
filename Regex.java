
package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Regex {

    public static void main(String[] args) {
     Pattern p=Pattern.compile("a*b");
     Matcher m1=p.matcher("aaaaaacb");
     if(m1.matches())
     {
         System.out.println(m1.start()+""+m1.end()+""+m1.group());
     }
    }
    
}
