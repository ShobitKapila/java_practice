package STS_DSA_java;

public class MaximumEquilibriumSum {
    public static int maxEquilibriumSum(int[] arr) {
        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }

        int leftSum = 0;
        int maxEquilibrium = 0;
        for (int num : arr) {
            totalSum -= num;
            if (leftSum == totalSum) {
                maxEquilibrium = Math.max(maxEquilibrium, leftSum + num);
            }
            leftSum += num;
        }

        return maxEquilibrium;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1};
        System.out.println("Maximum equilibrium sum: " + maxEquilibriumSum(arr));
    }
}

