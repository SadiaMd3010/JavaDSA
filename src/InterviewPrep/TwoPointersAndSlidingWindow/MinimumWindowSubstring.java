package InterviewPrep.TwoPointersAndSlidingWindow;

public class MinimumWindowSubstring {
    public static void main(String[] args) {
        String s="ADOBECODEBANC";
        String t = "ABC";
        int start=-1;
        int minLen=Integer.MAX_VALUE;
        for(int i=0;i<s.length();i++) {
            int[] hash=new int[256];
            for(int j=0;j<t.length();j++) {
                hash[t.charAt(j)]++;
            }
            int count=0;
            for(int j=i;j<s.length();j++) {
               if(hash[s.charAt(j)]>0) {
                   count++;
               }
               hash[s.charAt(j)]--;
               if(count==t.length()) {
                   if((j-i+1) < minLen) {
                       minLen=j-i+1;
                       start=i;
                       break;
                   }

               }
            }
        }
        System.out.println(s.substring(start,start+minLen));
    }
}
