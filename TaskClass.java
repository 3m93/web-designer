/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.thread;

/**
 *
 * @author Win10pro
 */
public class TaskClass implements Runnable {
   
   public TaskClass(){

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

  

    public static void main(String[] args)
    {
    
    }
   
       public class Client{
           public void someMethod()
           {
               TaskClass task=new TaskClass();
               
               Thread thread=new Thread(task);
               
               thread.start();
           }
       }
   }

   
    public void run() {
        System.out.println("Thread is Running");
   
for(int i=0;i<100;i++){
 System.out.println("a");
}
   }
}
    

