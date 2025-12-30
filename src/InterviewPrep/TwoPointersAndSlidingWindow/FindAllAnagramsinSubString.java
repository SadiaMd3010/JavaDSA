package InterviewPrep.TwoPointersAndSlidingWindow;

import java.util.*;

public class FindAllAnagramsinSubString {
    public static void main(String[] args) {
        String s = "cbaaaabacd";
        String p = "abc";

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i <=s.length()-p.length(); i++) {
            int[] hash = new int[256]; // or use 26 if lowercase only

            // Build frequency map for p
            for (int j = 0; j < p.length(); j++) {
                hash[p.charAt(j)]++;
            }

            int count = 0;
            // Check exactly p.length() characters starting from i
            for (int j = i; j < i + p.length(); j++) {
                if (hash[s.charAt(j)] > 0) {
                    count++;
                }
                hash[s.charAt(j)]--;
            }
            if (count == p.length()) {
                result.add(i);
            }
        }

        System.out.println(result); // Output: [0, 6]
    }
}
