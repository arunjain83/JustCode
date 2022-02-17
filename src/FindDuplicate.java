public class FindDuplicate {

    public static void main (String[] arg){
        int[] arr = {1,3,4,5,6,8,8};
        for (int i =0; i<arr.length; i++){
            for (int j=i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    System.out.println("True");
                    System.exit(0);
                }
            }
        }
        System.out.println("False");
    }
}
