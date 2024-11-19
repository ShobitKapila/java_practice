package STS_DSA_java;

public class KaratsubaAlgorithm {

    public static long karatsuba(long x, long y) {
        if (x < 10 || y < 10) {
            return x * y;
        }

        int maxLength = Math.max(Long.toString(x).length(), Long.toString(y).length());
        int splitPosition = maxLength / 2;

        long a = x / (long) Math.pow(10, splitPosition);
        long b = x % (long) Math.pow(10, splitPosition);
        long c = y / (long) Math.pow(10, splitPosition);
        long d = y % (long) Math.pow(10, splitPosition);

        long ac = karatsuba(a, c);
        long bd = karatsuba(b, d);
        long adPlusBc = karatsuba(a + b, c + d) - ac - bd;

        return (long) (ac * Math.pow(10, 2 * splitPosition) + adPlusBc * Math.pow(10, splitPosition) + bd);
    }

    public static void main(String[] args) {
        long x = 12345;
        long y = 6789;
        System.out.println("Product of " + x + " and " + y + " using Karatsuba algorithm: " + karatsuba(x, y));
    }
}
