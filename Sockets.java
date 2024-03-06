
package sockets;

import java.io.*;
import java.net.*;
import java.util.Scanner;



public class Sockets {

    
    public static void main(String[] args) throws IOException {
       
        Socket s=new Socket("localhost", 3333);
System.out.println("Accepting Connections");
//Socket ss=s.accept();
//System.out.println("connection with client");
InputStream is=s.getInputStream();
InputStreamReader isr=new InputStreamReader(is);
BufferedReader br=new BufferedReader(isr);
OutputStream os=s.getOutputStream();
PrintWriter pw=new PrintWriter(os,true);
pw.println("hello from server");
String recMsg=br.readLine();
System.out.println(recMsg);
s.close();
Scanner console=new Scanner(System.in);
pw.println("enter data");
int t=console.nextInt();
do
{
    System.out.println(t);
}
while(t!='s');
  
    }
    
}
