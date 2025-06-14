import java.util.*;

public class prime {

    public static void main(String[] args) {
        int N = 1000000;
        System.out.println("Circular primes below " + N + ": " + countCircularPrimes(N));
    }

    public static int countCircularPrimes(int N) {
        boolean[] isPrime = sieveOfEratosthenes(N);
        int count = 0;

        for (int i = 2; i < N; i++) {
            if (isPrime[i] && isCircularPrime(i, isPrime)) {
                count++;
            }
        }

        return count;
    }

    public static boolean[] sieveOfEratosthenes(int N) {
        boolean[] isPrime = new boolean[N + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        for (int i = 2; i * i <= N; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= N; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        return isPrime;
    }

    public static boolean isCircularPrime(int num, boolean[] isPrime) {
        String s = Integer.toString(num);
        int len = s.length();

        for (int i = 0; i < len; i++) {
            int rotated = Integer.parseInt(s.substring(i) + s.substring(0, i));
            if (!isPrime[rotated]) {
                return false;
            }
        }

        return true;
    }
}
