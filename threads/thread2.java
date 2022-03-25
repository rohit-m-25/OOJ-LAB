package program9;

public class thread2 implements Runnable{
    @Override
    public void run(){
        System.out.println("CSE");
        try{Thread.sleep(2000);}
        catch (InterruptedException e){e.printStackTrace();}
    }
    
}
