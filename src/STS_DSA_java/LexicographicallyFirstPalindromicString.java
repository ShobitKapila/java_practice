package STS_DSA_java;

public class LexicographicallyFirstPalindromicString {

    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static String lexicographicallyFirstPalindromicString(String s) {
        if (isPalindrome(s)) {
            return s;
        }

        int n = s.length();
        char[] arr = s.toCharArray();
        for (int i = 0; i < n / 2; i++) {
            if (arr[i] != 'a') {
                arr[i] = 'a';
                return String.valueOf(arr);
            }
        }
        arr[n - 1] = 'b';
        return String.valueOf(arr);
    }

    public static void main(String[] args) {
        String s = "abb";
        System.out.println("Lexicographically first palindromic string: " + lexicographicallyFirstPalindromicString(s));
    }
}

