package STS_DSA_java;
import java.util.ArrayList;
import java.util.List;


public class SegmentedSieve {

    public static List<Integer> segmentedSieve(int left, int right) {
        int maxN = (int) Math.sqrt(right) + 1;
        List<Integer> primes = new ArrayList<>();
        boolean[] isPrime = new boolean[maxN + 1];

        for (int i = 2; i * i <= maxN; i++) {
            if (!isPrime[i]) {
                for (int j = i * i; j <= maxN; j += i) {
                    isPrime[j] = true;
                }
            }
        }

        for (int i = 2; i <= maxN; i++) {
            if (!isPrime[i]) {
                primes.add(i);
            }
        }

        List<Integer> result = new ArrayList<>();
        boolean[] rangeIsPrime = new boolean[right - left + 1];

        for (int prime : primes) {
            int start = Math.max(prime * prime, (left + prime - 1) / prime * prime);
            for (int j = start; j <= right; j += prime) {
                rangeIsPrime[j - left] = true;
            }
        }

        for (int i = 0; i < rangeIsPrime.length; i++) {
            if (!rangeIsPrime[i]) {
                result.add(left + i);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int left = 10;
        int right = 50;
        List<Integer> primesInRange = segmentedSieve(left, right);

        System.out.println("Prime numbers between " + left + " and " + right + ":");
        for (int prime : primesInRange) {
            System.out.print(prime + " ");
        }
    }
}


