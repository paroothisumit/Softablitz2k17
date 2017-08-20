class MyThread implements Runnable
{
  // New Thred Execution will start from here
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


public class MultiThreadingImplementation1 {  
     
  public static void main(String args[]){  
    MyThread obj=new MyThread();
    Thread tobj =new Thread(obj);  
    tobj.start();  
    while(true){
      try{
        System.out.println("I am printing from Main thread");
        Thread.sleep(1000);
      }
      catch(InterruptedException e){
        System.out.println("Error in sleep");
      }
    }
  }  
}
