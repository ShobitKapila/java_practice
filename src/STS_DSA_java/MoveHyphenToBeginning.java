package STS_DSA_java;

public class MoveHyphenToBeginning {

    public static String moveHyphen(String str) {
        StringBuilder hyphenAtBeginning = new StringBuilder();
        StringBuilder remainingChars = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (ch == '-') {
                hyphenAtBeginning.append(ch);
            } else {
                remainingChars.append(ch);
            }
        }

        hyphenAtBeginning.append(remainingChars);
        return hyphenAtBeginning.toString();
    }

    public static void main(String[] args) {
        String str = "pro-gram-ming";
        String result = moveHyphen(str);
        System.out.println("Result: " + result);
    }
}
