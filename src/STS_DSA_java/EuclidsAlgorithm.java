package STS_DSA_java;


//Euclidean algorithm or Euclid's algorithm, is an efficient method for computing the greatest
//common divisor (GCD) of two integers (numbers), the largest number that divides them both
//without a remainder.

public class EuclidsAlgorithm {

    public static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public static void main(String[] args) {
        int num1 = 48;
        int num2 = 18;
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd(num1, num2));
    }
}
