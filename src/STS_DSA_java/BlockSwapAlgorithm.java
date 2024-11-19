package STS_DSA_java;

//The block swap algorithm is used to rotate an array by a given number of positions
// in a highly efficient way. It involves three reverse operations to achieve the rotation.
// Here's a Java code for the block swap algorithm with fewer lines and efficient time complexity:

import java.util.Arrays;

public class BlockSwapAlgorithm {
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void blockSwap(int[] arr, int d) {
        int n = arr.length;
        d = d % n;
        if (d < 0) {
            d += n;
        }
        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
        reverse(arr, 0, n - 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int d = 2;
        System.out.println("Original Array: " + Arrays.toString(arr));
        blockSwap(arr, d);
        System.out.println("Rotated Array: " + Arrays.toString(arr));
    }
}
