public class Code2{

    public static void main(String[] args) {

try
{
   int[] a={4};
   System.out.println(a[1]);
   System.out.println("TRY AGAIN");
}
catch(IndexOutOfBoundsException e)
{
    System.out.println("Your index is out of bound");
}
catch(NegativeArraySizeException e)
{
    System.out.println("The array dimension is negative");
}
catch(NullPointerException e)
{
    System.out.println("object variable containing null");  
}
}
}