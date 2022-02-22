import java.util.List;
import java.util.ArrayList;
// "static void main" must be defined in a public class.
public class SlidingWindowMax {
    public static void main(String[] args) {
        int[] arr = {8,2,5,1,9,4,2,5,7};
        int k=3;
        int len = arr.length;
        int max;
        List<Integer> slidingMax = new ArrayList();
        for (int i=0;i<len-2;i++){
            max=0;
            for(int j=i;j<i+k;j++){
                if(arr[j]>max){
                    max=arr[j];
                }
            }
            slidingMax.add(max);
        }
        System.out.println(slidingMax);
    }
}
