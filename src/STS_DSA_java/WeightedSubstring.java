package STS_DSA_java;

public class WeightedSubstring {

    public static int getWeightedSubstring(String str, int k) {
        int n = str.length();
        int weightedSum = 0;
        int currentWeight = 0;

        for (int i = 0; i < n; i++) {
            currentWeight = Math.max(0, currentWeight - k);
            char currentChar = str.charAt(i);
            int charWeight = currentChar - 'a' + 1;
            currentWeight += charWeight;
            weightedSum += currentWeight;
        }

        return weightedSum;
    }

    public static void main(String[] args) {
        String str = "abc";
        int k = 2;

        int weightedSum = getWeightedSubstring(str, k);
        System.out.println("Weighted Substring: " + weightedSum);
    }
}
