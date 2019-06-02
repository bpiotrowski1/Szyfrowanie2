import java.util.Scanner;

public class Main {
    final static private int[] primes = {127, 131, 137, 139, 149};

    public static void main(String[] args) throws java.lang.Exception {
        Scanner scanInt = new Scanner(System.in);
        int n = scanInt.nextInt();

        for (int i = 0; i < n; i++) {
            int k = scanInt.nextInt();
            int[] letters = new int[k];
            for (int j = 0; j < k; j++) {
                letters[j] = scanInt.nextInt();
            }

            int prime = getPrime(letters[letters.length/2]);
            if (prime == -1) {
                System.out.println("NIECZYTELNE");
            } else {
                System.out.print(prime + " ");
                for (int j = 0; j < k; j++) {
                    int result = letters[j] % prime;
                    System.out.print((char) result);
                }
                System.out.println();
            }
        }
    }

    private static int getPrime(int letter){
        for (int i = primes.length - 1; i >= 0; i--) {
            int result = letter % primes[i];
            if (result >= 65 && result <= 90) {
                return primes[i];
            }
        }
        return -1;
    }
}