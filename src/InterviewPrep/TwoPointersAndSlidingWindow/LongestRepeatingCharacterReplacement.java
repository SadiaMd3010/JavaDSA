package InterviewPrep.TwoPointersAndSlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class LongestRepeatingCharacterReplacement {
    public static void main(String[] args) {
        String s= "BAABAABBBAAA";
        int k=2;
//        int maxLen=0;
//        for(int i=0;i<s.length();i++) {
//            int[] hash = new int[26];
//            int maxFreq=0;
//            for(int j=i;j<s.length();j++) {
//                hash[s.charAt(j)-'A']++;
//                maxFreq= Math.max(maxFreq,hash[s.charAt(j)-'A']);
//                int change = (j-i+1) - maxFreq;
//                if(change>k) break;
//                maxLen= Math.max(maxLen,j-i+1);
//            }
//        }
//        System.out.println(maxLen);

        //Better
        int l=0,r=0,maxLen=0;
        Map<Character,Integer> map = new HashMap<>();
        int maxFreq=0;
        while (r<s.length()) {
            map.put(s.charAt(r),map.getOrDefault(s.charAt(r),0)+1);
            maxFreq= Math.max(maxFreq,map.get(s.charAt(r)));
            while((r-l+1)-maxFreq>k) {
                map.put(s.charAt(l),map.get(s.charAt(l))-1);
                if(map.get(s.charAt(l))==0) {
                    map.remove(s.charAt(l));
                }
                l++;
            }
            maxLen=Math.max(maxLen,r-l+1);
            r++;
        }
        System.out.println(maxLen);


    }
}
