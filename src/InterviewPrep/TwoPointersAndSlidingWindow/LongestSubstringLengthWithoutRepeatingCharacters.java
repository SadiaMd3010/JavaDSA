package InterviewPrep.TwoPointersAndSlidingWindow;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LongestSubstringLengthWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String s= "cadbzabcd";
        int max = Integer.MIN_VALUE;
        List<Character> list = new ArrayList<>();
        char[] ch = s.toCharArray();
        for(int i=0;i<s.length();i++) {
            int count=0;
            for (int j = i; j < s.length(); j++) {
                if ((list.isEmpty() || !list.contains(ch[j]))) {
                    list.add(ch[j]);
                    count++;
                }
            }
            max= Math.max(count,max);
        }
        System.out.println(max);

        //Brute - Second Type
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<s.length();i++) {
            Set<Character> set = new HashSet<>();
            for(int j=i;j<s.length();j++) {
                if(set.contains(s.charAt(j))) {
                    maxi = Math.max(maxi,j-i);
                    break;
                }
                set.add(s.charAt(j));
            }
        }
        System.out.println(maxi);
    }
}
