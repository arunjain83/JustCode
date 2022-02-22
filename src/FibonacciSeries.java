import java.util.ArrayList;

public class FibonacciSeries {
    public static void main(String[] arg){
        int fib1=1;int fib2=1;int fib=1;
        for(int i=3; i<10; i++) {
            fib=fib1+fib2;
            fib1=fib2;
            fib2=fib;
            System.out.println(fib);
        }
    }
}
