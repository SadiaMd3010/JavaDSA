package InterviewPrep.TwoPointersAndSlidingWindow;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithAtMostKDistinctCharacters {
    public static void main(String[] args) {
        String s = "abcddefg";
        int k=3;
        int maxLen=0;
        for(int i=0;i<s.length();i++) {
            Set<Character> set = new HashSet<>();
            for(int j=i;j<s.length();j++) {
                set.add(s.charAt(j));
                if(set.size()<=k) {
                    maxLen = Math.max(maxLen,j-i+1);
                }
            }
        }
        System.out.println(maxLen);

    }
}
