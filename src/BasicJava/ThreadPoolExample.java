package BasicJava;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExample {
    public static void main(String[] arg){
        ExecutorService srv = Executors.newFixedThreadPool(5);
        for(int i =0; i<10;i++){
            Runnable worker = new WorkerThread();
            srv.execute(worker);
        }
        srv.shutdown();
    }
}

class WorkerThread implements Runnable {
    public void run() {
        System.out.println("Worker - "+ Thread.currentThread().getName());
    }
}