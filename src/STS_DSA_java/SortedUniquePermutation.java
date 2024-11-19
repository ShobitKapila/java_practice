package STS_DSA_java;

import java.util.Arrays;

public class SortedUniquePermutation {

    public static void sortedUniquePermutations(int[] arr) {
        Arrays.sort(arr);
        generatePermutations(arr, new boolean[arr.length], new int[arr.length], 0);
    }

    public static void generatePermutations(int[] arr, boolean[] used, int[] current, int index) {
        if (index == arr.length) {
            System.out.println(Arrays.toString(current));
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            if (!used[i]) {
                if (i > 0 && arr[i] == arr[i - 1] && !used[i - 1]) {
                    continue;
                }
                used[i] = true;
                current[index] = arr[i];
                generatePermutations(arr, used, current, index + 1);
                used[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2};
        sortedUniquePermutations(arr);
    }
}
