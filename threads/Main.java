package program9;

public class Main {
    public static void main(String[]args){
        thread1 myt1=new thread1();
        Thread t1= new Thread(myt1);
        thread2 myt2=new thread2();
        Thread t2= new Thread(myt2);

        t1.start();
        t2.start();
    }
    
}
