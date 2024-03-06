
package sockets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;


public class ServerFile {

 public static void main(String[] args) throws IOException {
 ServerSocket ss=new ServerSocket(3333);
System.out.println("Accepting connection");
Socket s=ss.accept();
System.out.println("connection with clint");
InputStream is=s.getInputStream();
InputStreamReader isr=new InputStreamReader(is);
BufferedReader br=new BufferedReader(isr);
OutputStream os=s.getOutputStream();
PrintWriter pw=new PrintWriter(os,true);
pw.println("hello from server");
String recMsg=br.readLine();
System.out.println(recMsg);
s.close();
    }
    
}
