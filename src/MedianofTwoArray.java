public class MedianofTwoArray {
    public static void main(String[] arg){
        int[] arr = {4,1,8,3,9,6};
        arr = sortArray(arr);
        System.out.println(findMedian(arr));
    }

    public static int[] sortArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    int hold = arr[i];
                    arr[i] = arr[j];
                    arr[j] = hold;
                }
            }
        }
        return arr;
    }

    public static double findMedian(int [] arr){
        int len = arr.length;
        double arrMedian;
        if ((len%2) == 0){
            arrMedian = (double)(arr[(len/2)]+arr[(len/2)-1])/2;
        }else{
            int mid = len/2;
            arrMedian = arr[mid];
        }
        return arrMedian;
    }
}
