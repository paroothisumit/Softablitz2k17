class MyThread extends Thread
{
  // New thread execution will start from here
  public void run(){  
    while(true){
      try{
        System.out.println("I am printing from new thread created");
        Thread.sleep(1000);
      }
      catch(InterruptedException e){
        System.out.println("Error in sleep");
      }
    }  
  }
}   

public class MultiThreadingImplementation2 {  
  public static void main(String args[]){  
    MyThread obj=new MyThread();   
    obj.start();  
    while(true){
      try{
        System.out.println("I am printing from Main thread");
        Thread.sleep(1000);
      }
      catch(InterruptedException e){

      }
    }
  }  
}