
public class Code1{

    public static void main(String[] args) {
        int i=12;
        for(int j=3;j>=-1;j--)
        try {
        
        
        System.out.println("Try block  entered"+"="+i+"j="+j);
        System.out.println();
        System.out.println("Ending try block");
        }
        catch(ArithmeticException e)
        {
        System.out.println("Arithmetic exception caught");
        }
         System.out.println("After try block");
         
    }
}

