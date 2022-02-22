import java.util.Locale;

public class StringPalindrome {

    public static void main(String[] arg){
        String str = "Saippuakivikauppias";
        char[] strArray = str.toLowerCase(Locale.ROOT).toCharArray();
        int len = str.length();
        boolean isPalindrome = true;
        for(int i=0; i<len/2;i++){
            if(strArray[i] != strArray[len-1-i]){
                isPalindrome = false;
                break;
            }
        }
        if(isPalindrome){
            System.out.println("String "+str+" is a palindrome");
        }else{
            System.out.println("String "+str+" is NOT a palindrome");
        }
    }
}
