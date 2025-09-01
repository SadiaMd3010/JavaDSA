package ArraysMedium;

import java.util.HashMap;

public class CountAllSubArraysWithGivenSum {
    public static void main(String[] args) {
        int a[]={1,2,3,-3,1,1,1,4,2,-3};
        int k=3;
//        int count=0;
//        for(int i=0;i<a.length;i++) {
//            int sum=0;
//            for(int j=i;j<a.length;j++) {
//                sum=sum+a[j];
//                if(sum==k) {
//                    count++;
//                }
//            }
//        }
//        System.out.println(count);

        //BETTER
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum=0;
        int count=0;
        for(int i=0;i<a.length;i++) {
            sum=sum+a[i];
            map.put(0,1);
            int rem=sum-k;
            if(map.containsKey(rem)) {
                count=count+map.get(rem);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        System.out.println(count);
    }
}
