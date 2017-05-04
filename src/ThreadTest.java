public class ThreadTest 
{ 
  public static void main(String[] argv) 
  { 
    // start a loop 
    new Thread(new Runnable() 
    { 
      public void run() 
      { 
        for (int i = 0; i < 50000; i++) 
        { 
          System.out.println("1st loop..."); 
          try{Thread.sleep(10000);} // 1 second pause 
          catch(Exception e){} 
        } 
      } 
    }).start(); 

    // start a 2nd loop 
    new Thread(new Runnable() 
    { 
      public void run() 
      { 
        for (int i = 0; i < 50000; i++) 
        { 
          System.out.println("2nd loop..."); 
          try{Thread.sleep(31400);} // 0.314 second pause 
          catch(Exception e){} 
        } 
      } 
    }).start(); 

    System.out.println("Both loops started."); 
  } 
} 
