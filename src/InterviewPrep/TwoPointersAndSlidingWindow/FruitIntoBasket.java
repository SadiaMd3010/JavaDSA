package InterviewPrep.TwoPointersAndSlidingWindow;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FruitIntoBasket {
    public static void main(String[] args) {
        int[] arr={1, 2, 3, 4, 5};
        int k=2;
//        int maxLen=0;
//        for(int i=0;i<arr.length;i++) {
//            Set<Integer> set = new HashSet<>();
//            for(int j=i;j<arr.length;j++) {
//                set.add(arr[j]);
//                if(set.size()>k) break;
//                maxLen = Math.max(maxLen,j-i+1);
//            }
//        }
//        System.out.println(maxLen);

        //Better
        int l=0,r=0,maxLen=0;
        Map<Integer,Integer> map = new HashMap<>();
        while(r<arr.length) {
            map.put(arr[r],map.getOrDefault(arr[r],0)+1);

            while(map.size()>2) {
                map.put(arr[l],map.get(arr[l])-1);
                if(map.get(arr[l])==0) {
                    map.remove(arr[l]);
                }
                l++;
            }
            maxLen=Math.max(maxLen,r-l+1);
            r++;
        }
        System.out.println(maxLen);
    }
}
