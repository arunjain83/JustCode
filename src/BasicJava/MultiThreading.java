package BasicJava;

public class MultiThreading {

    public static void main(String[] arg){
        for(int i=0;i<8;i++){
            MultiThread thread = new MultiThread();
            thread.start();
            Thread threadRunnable = new Thread(new MultiThreadRunnable());
            threadRunnable.start();
        }
    }

}

class MultiThread extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getId() + "is running");
    }
}

class MultiThreadRunnable implements Runnable{
    public void run(){
        System.out.println(Thread.currentThread().getId() + "Runnable is running");
    }
}