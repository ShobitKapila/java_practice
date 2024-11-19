package STS_DSA_java;

public class ManacherAlgorithm {

    public static String longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }

        String modifiedString = preProcess(s);
        int[] radius = new int[modifiedString.length()];
        int center = 0, right = 0;

        for (int i = 1; i < modifiedString.length() - 1; i++) {
            int mirror = 2 * center - i;
            if (i < right) {
                radius[i] = Math.min(right - i, radius[mirror]);
            }

            while (modifiedString.charAt(i + radius[i] + 1) == modifiedString.charAt(i - radius[i] - 1)) {
                radius[i]++;
            }

            if (i + radius[i] > right) {
                center = i;
                right = i + radius[i];
            }
        }

        int maxRadius = 0;
        int maxCenter = 0;
        for (int i = 1; i < modifiedString.length() - 1; i++) {
            if (radius[i] > maxRadius) {
                maxRadius = radius[i];
                maxCenter = i;
            }
        }

        int start = (maxCenter - maxRadius) / 2;
        return s.substring(start, start + maxRadius);
    }

    public static String preProcess(String s) {
        StringBuilder sb = new StringBuilder();
        sb.append("#");
        for (char ch : s.toCharArray()) {
            sb.append(ch);
            sb.append("#");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "babad";
        System.out.println("Longest Palindromic Substring: " + longestPalindrome(s));
    }
}
