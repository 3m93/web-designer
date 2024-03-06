/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package THREAD3;

/**
 *
 * @author Win10pro
 */
public class Demo {
    public static void main(String[] aegs){
        Thread t1=new Thread(new Runnable(){
             @Override
    public void run()
    {
        for(int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getId() + " Value "+ i);
        }
        try{
            Thread.sleep(100);
        } catch(InterruptedException e) {
            e.getStackTrace();
        }
    }
        });
        t1.start();
    }
}
