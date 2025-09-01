package ArraysMedium;

import java.util.Arrays;
import java.util.HashSet;

public class LongestConsequtiveSequence {
    public static void main(String[] args) {
        int a[]={5,8,3,2,1,4}; // 1 2 3 4 5 8
//        Arrays.sort(a);
//        int longest=1;
//        int count=0;
//        int lastSmallest=Integer.MIN_VALUE;
//        for(int i=0;i<a.length;i++) {
//            if(a[i]-1==lastSmallest) {
//                count++;
//                lastSmallest=a[i];
//            }
//            else if(a[i]!=lastSmallest) {
//                count=1;
//                lastSmallest=a[i];
//            }
//            longest=Math.max(longest,count);
//        }
//
//        System.out.println(longest);

        //OPTIMAL
        HashSet<Integer> set = new HashSet<>();
        int longest=1;
        for(int i=0;i<a.length;i++) {
            set.add(a[i]);
        }
        for(int it:set) {
            if(!set.contains(it-1)) {
                int x=it;
                int count=1;
                while(set.contains(x+1)) {
                    x++;
                    count++;
                }
             longest=Math.max(longest,count);
            }
        }
        System.out.println(longest);

    }
}
