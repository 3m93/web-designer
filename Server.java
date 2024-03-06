/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
/**
 *
 * @author Win10pro
 */
public class Server {
    public static void main(String[] args)
    {
        int serverPort=8080;
        try{
           ServerSocket ss=new ServerSocket(serverPort);
           System.out.println("Server is listening on port"+serverPort);
           Socket clientSocket=ss.accept();
           System.out.println("Accepted connection from client");
           BufferedReader reader=new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
           OutputStream outputStream=clientSocket.getOutputStream();
           String cM=reader.readLine();
           System.out.println("Recieved Message from Client"+cM);
           String rM="Hello,Client! I receieved your message";
           System.out.println("Sending response to client"+rM);
           outputStream.write(rM.getBytes());
           outputStream.flush();
           System.out.println("closing connection with client");
           clientSocket.close();
           ss.close();
        }
        catch(IOException e)
                {
                   e.printStackTrace();
                }
    }
}
