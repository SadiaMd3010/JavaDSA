package InterviewPrep.TwoPointersAndSlidingWindow;

import java.util.Arrays;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String s = "abcddabac";
//        int maxLen=0;
//        for(int i=0;i<s.length();i++) {
//            int[] hash=new int[256];
//            for(int j=i;j<s.length();j++) {
//                if(hash[s.charAt(j)]==1) break;
//                maxLen= Math.max(maxLen,j-i+1);
//                hash[s.charAt(j)]=1;
//            }
//        }
//        System.out.println(maxLen);


        //Better
        int[] hash = new int[256];
        Arrays.fill(hash,-1);
        int l=0,r=0,maxLen=0;
        while(r<s.length()) {
            if(hash[s.charAt(r)]!=-1) {
                if(hash[s.charAt(r)]>=l) {
                    l=hash[s.charAt(r)]+1;
                }
            }
            maxLen=Math.max(r-l+1,maxLen);
            hash[s.charAt(r)]=r;
            r++;
        }
        System.out.println(maxLen);

    }
}
