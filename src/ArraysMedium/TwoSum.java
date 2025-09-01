package ArraysMedium;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    //BRUTE
//    public static void main(String[] args) {
//        int a[]={2,6,5,8,11};
//        int target=14;
//        for(int i=0;i<a.length;i++) {
//            for(int j=i+1;j<a.length;j++) {
//                if(a[i]+a[j]==target) {
//                    System.out.println("Indexes are "+i+" and "+j+" and values are "+a[i]+" and "+a[j]);
//                }
//            }
//        }
//    }

    //BETTER _ Hashing
//    public static void main(String[] args) {
//        int a[]={2,6,5,8,11};
//        int target=14;
//        HashMap<Integer,Integer> map = new HashMap<>();
//        for(int i=0;i<a.length;i++) {
//            map.put(a[i],i);
//            int rem=target-a[i];
//
//            if(map.containsKey(rem)) {
//                System.out.println(map.get(rem) +" and " +i);
//            }
//        }
//    }

    //BETTER
    public static void main(String[] args) {
        int a[]={2,6,5,8,11};
        int target=14;
        Arrays.sort(a);
        int i=0;int j=a.length-1;
        while(i<j) {
            int sum=a[i]+a[j];
            if(sum==target) {
                System.out.println("YES");
                return;
            }
            else if(sum<target) {
                i++;
            }
            else {
                j--;
            }
        }
        System.out.println("NO");
    }

}
