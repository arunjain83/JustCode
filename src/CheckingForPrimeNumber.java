public class CheckingForPrimeNumber {

    public static void main(String[] arg) {
        int num = 24;
        boolean isPrime = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (!isPrime) {
            System.out.println("Not a prime number");
        } else {
            System.out.println("Is a prime number");
        }
    }
}
