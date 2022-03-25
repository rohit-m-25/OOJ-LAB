package program9;

public class thread1 implements Runnable{
    @Override
    public void run(){
        System.out.println("BMS COLLEGE OF ENGINEERING");
        try{Thread.sleep(10000);}
        catch (InterruptedException e){e.printStackTrace();}
    }
    
}
