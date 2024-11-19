package STS_DSA_java;

public class MajorityElement {
    public static int findMajorityElement(int[] arr) {
        int candidate = 0;
        int count = 0;

        for (int num : arr) {
            if (count == 0) {
                candidate = num;
                count = 1;
            } else if (candidate == num) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }
    public static void main(String[] args) {
        int[] arr = {3, 3, 4, 2, 4, 4, 2, 4, 4};
        int majorityElement = findMajorityElement(arr);
        System.out.println("Majority Element: " + majorityElement);
    }
}

