public class MissingNumbersInArray {
    public static void main(String[] arg){
        int[] arr = {8,9,3,5,1,0,4,7};
        boolean isMissing;
        for (int i=0;i<arr.length;i++){
            isMissing = true;
            for(int j=0;j<arr.length;j++){
                if(i==arr[j]){
                    isMissing = false;
                }
            }
            if(isMissing) {
                System.out.println(i);
            }
        }
    }
}
