package STS_DSA_java;

import java.util.*;

public class CoinChangeGreedy {

    public static List<Integer> coinChangeGreedy(int[] coins, int amount) {
        Arrays.sort(coins);
        List<Integer> result = new ArrayList<>();

        for (int i = coins.length - 1; i >= 0; i--) {
            while (amount >= coins[i]) {
                result.add(coins[i]);
                amount -= coins[i];
            }
        }

        return (amount == 0) ? result : Collections.emptyList();
    }

    public static void main(String[] args) {
        int[] coins = {25, 10, 5, 1}; // Coin denominations (sorted in descending order)
        int amount = 48; // Amount to be changed

        List<Integer> change = coinChangeGreedy(coins, amount);

        if (change.isEmpty()) {
            System.out.println("No solution!");
        } else {
            System.out.println("Change:");
            System.out.println(change);
        }
    }
}
