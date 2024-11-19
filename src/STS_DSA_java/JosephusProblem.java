package STS_DSA_java;

public class JosephusProblem {

    public static int josephus(int n, int k) {
        if (n == 1) {
            return 1;
        } else {
            return (josephus(n - 1, k) + k - 1) % n + 1;
        }
    }

    public static void main(String[] args) {
        int n = 7; // Number of people in the circle
        int k = 3; // Elimination step

        int survivor = josephus(n, k);
        System.out.println("Survivor: " + survivor);
    }
}
