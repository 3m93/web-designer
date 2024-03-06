import java.utill.Scanner;
public class q2 {
    public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    System.out.println("Whats your fav numbe?");
    try{
    int n=scan.nextInt();
    System.out.println("n");
    }catch(Exception e) 
    {
      System.out.println("Sorry , please enter a number");  
    }
    }
}
