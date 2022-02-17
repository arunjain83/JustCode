public class MissingNumberInArray {
    public static void main(String[] arg){
        int[] arr = {8,9,3,5,1,0,4,7,2};
        int len = arr.length;
        int actualSum = len*(len+1)/2;
        int arraySum = 0;
        for(int num:arr){
            arraySum+=num;
        }
        System.out.println(actualSum-arraySum);
    }
}
