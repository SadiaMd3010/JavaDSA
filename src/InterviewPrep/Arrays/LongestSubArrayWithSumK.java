package InterviewPrep.Arrays;

import java.util.HashMap;
import java.util.Map;

public class LongestSubArrayWithSumK {
    public static void main(String[] args) {
        int[] a = {1,2,5,1,1,1,2,2,3};
        int k=5;
        //Brute
//        int len =0;
//        for(int i=0;i<a.length;i++) {
//            int sum=0;
//            for(int j=i;j<a.length;j++) {
//                sum=sum+a[j];
//                if(sum==k) {
//                   len=Math.max(len,j-i+1);
//                }
//            }
//        }
//        System.out.println(len);



        //Better
        int sum=0;
        int len =0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<a.length;i++) {
           sum=sum+a[i];
           if(sum==k) {
               len=Math.max(len,i+1);
           }
           if(map.containsKey(sum-k)) {
               len=Math.max(len,i-map.get(sum-k));
           }
//           if(!map.containsKey(sum)) {
//               map.put(sum,i);
//           }
           map.putIfAbsent(sum,i);
        }
        System.out.println(len);

//Optimal
//        int maxLength = 0;
//        int sum=a[0];
//        int left=0;
//        int right=0;
//        while(right<a.length) {
//            while(sum>k) {
//                sum=sum-a[left];
//                left++;
//            }
//            if(sum==k) {
//                maxLength=Math.max(maxLength,right-left+1);
//            }
//            right++;
//            if(right<a.length) {
//                sum = sum + a[right];
//            }
//
//        }
//        System.out.println(maxLength);
    }
}
