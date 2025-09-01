package ArraysEasy;

import java.util.HashMap;

public class LongestSubArrayLengthOfSumK {
    public static void main(String[] args) {
        //BRUTE
//        int a[]={1,2,3,1,1,1,1,4,2,3};
//        int k=3;
//        int len=0;
//        for(int i=0;i<a.length;i++) {
//            int sum=0;
//            for(int j=i;j<a.length;j++) {
//                sum=sum+a[j];
//                if(sum==k) {
//                    len=Math.max(len,j-i+1);
//                }
//            }
//        }
//        System.out.println(len);

        //OPTIMAL - Hashing
//        int a[]={1,2,3,1,1,1,1,4,2,3};
//        int k=3;
//        int sum=0;
//        int len=0;
//        HashMap<Integer,Integer> map = new HashMap<>();
//        for(int i=0;i<a.length;i++) {
//            sum=sum+a[i];
//            if(sum==k) {
//                len=Math.max(len,i+1);
//            }
//
//            if(!map.containsKey(sum)) {
//                map.put(sum,i);
//            }
//
//            int rem=sum-k;
//            if(map.containsKey(rem)) {
//                int maxlen =i-map.get(rem);
//                len=Math.max(maxlen,len);
//            }
//
//
//        }
//        System.out.println(len);

        //OPTIMAL - TWO POINTERS
        int a[]={1,2,3,1,1,1,1,4,2,3};
        int i=0;
        int j=0;
        int k=3;
        int sum=0;
        int len=0;
        while(j<a.length) {

            sum=sum+a[j];

            while(i<=j && sum>k) {
                sum=sum-a[i];
                i++;
            }
            if(sum==k) {
                len=Math.max(len,j-i+1);
            }
            j++;


        }
        System.out.println(len);

    }
}
