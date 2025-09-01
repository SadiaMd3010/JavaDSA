package InterviewPrep.Arrays;

import java.util.Arrays;
import java.util.HashSet;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {

        int[] a = {102, 4, 100, 1, 101, 3, 2, 1, 1};
        //Brute
//        int longest = 1;
//        for (int i = 0; i < a.length; i++) {
//            int coumt = 1;
//            int num = a[i];
//            while (ls(a, num + 1)) {
//                coumt++;
//                num = num + 1;
//            }
//        longest = Math.max(longest, coumt);
//    }
//        System.out.println(longest);
        //Better   // 1 1 1 2 3 4 100 101 102
        Arrays.sort(a);
        int count=0;
        int longestLength=1;
        int lastChecked=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++) {
            if(a[i]-1==lastChecked) {
                count++;
                lastChecked=a[i];
            }
            else if(a[i]==lastChecked){
            }
            else if(a[i]!=lastChecked) {
                count=1;
                lastChecked=a[i];
            }
            longestLength=Math.max(longestLength,count);
        }
        System.out.println(longestLength);

        //Optimal
//        HashSet<Integer> set = new HashSet<>();
//        int len=1;
//        for(int i=0;i<a.length;i++) {
//            set.add(a[i]);
//        }
//
//        for(int s : set) {
//            if(!set.contains(s-1)) {
//                int countt=1;
//                int x = s;
//                while(set.contains(x+1)) {
//                    countt++;
//                    x=x+1;
//                }
//                len=Math.max(len,countt);
//            }
//
//        }
//        System.out.println(len);
}


    public static boolean ls(int[] a, int num) {
        for(int j=0;j<a.length;j++) {
            if(a[j]==num) {
                return true;
            }
        }
        return false;
    }
}
