package STS_DSA_java;

import java.text.Collator;
import java.util.Arrays;
import java.util.Locale;

public class NaturalSortOrder {

    public static void naturalSort(String[] arr) {
        Collator collator = Collator.getInstance(Locale.getDefault());
        Arrays.sort(arr, collator);
    }

    public static void main(String[] args) {
        String[] arr = {"file2.txt", "file11.txt", "file1.txt", "file10.txt"};
        naturalSort(arr);

        System.out.println("Natural Sort Order:");
        for (String str : arr) {
            System.out.println(str);
        }
    }
}

