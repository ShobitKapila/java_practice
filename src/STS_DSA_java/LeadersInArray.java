package STS_DSA_java;

import java.util.ArrayList;
import java.util.List;

public class LeadersInArray {
    public static List<Integer> findLeaders(int[] arr) {
        List<Integer> leaders = new ArrayList<>();
        int maxSoFar = Integer.MIN_VALUE;

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] >= maxSoFar) {
                leaders.add(arr[i]);
                maxSoFar = arr[i];
            }
        }

        return leaders;
    }
    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        List<Integer> leaders = findLeaders(arr);

        System.out.println("Leaders in the array:");
        for (int leader : leaders) {
            System.out.print(leader + " ");
        }
    }
}
