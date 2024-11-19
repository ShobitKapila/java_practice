package STS_DSA_java;

import java.util.ArrayList;
import java.util.List;

public class Combinations {
    public static List<List<Integer>> generateCombinations(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(arr, 0, new ArrayList<>(), result);
        return result;
    }

    public static void backtrack(int[] arr, int start, List<Integer> current, List<List<Integer>> result) {
        result.add(new ArrayList<>(current));

        for (int i = start; i < arr.length; i++) {
            current.add(arr[i]);
            backtrack(arr, i + 1, current, result);
            current.remove(current.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        List<List<Integer>> combinations = generateCombinations(arr);

        System.out.println("Combinations:");
        for (List<Integer> combination : combinations) {
            System.out.println(combination);
        }
    }
}
