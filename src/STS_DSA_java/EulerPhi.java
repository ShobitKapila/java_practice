package STS_DSA_java;

//Euler's totient function, also known as phi-function ϕ(n), counts the number of integers between 1 and n
//inclusive, which are coprime to n

public class EulerPhi {
    public static int eulerPhi(int n) {
        int result = n;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                while (n % i == 0) {
                    n /= i;
                }
                result -= result / i;
            }
        }
        if (n > 1) {
            result -= result / n;
        }
        return result;
    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println("Euler's Phi (" + n + ") = " + eulerPhi(n));
    }
}

