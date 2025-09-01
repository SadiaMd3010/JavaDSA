package InterviewPrep.Arrays;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSUm {
//    public static boolean findSum(int[] a) {
//        int sum=18;
//        for(int i=0;i<a.length;i++) {
//            int num=a[i];
//            for(int j=i+1;j<a.length;j++) {
//                if(a[j]+num==sum) {
//                    System.out.println("Pair found: " + num + ", " + a[j]);
//                    return true;
//                }
//            }
//        }
//        return false;
//    }


    public static void main(String[] args) {
        int a[]={2,6,5,9,11};
        int sum=14;
        //Brute
//        System.out.println(findSum(a));
        //Better - Hashing
//        HashMap<Integer,Integer> map = new HashMap<>();
//        for(int i=0;i<a.length;i++) {
//            int k=sum-a[i];
//
//            if(map.containsKey(sum-a[i])) {
//                System.out.println("Pair found: " + k+ ", " + a[i]);
//            }
//            map.put(a[i],i);
//
//        }

        //Optimal - for varity 1 , yes or no
        Arrays.sort(a);
        int left=0;
        int right=a.length-1;
        while(left<right) {
            if(a[left]+a[right]==sum) {
                System.out.println("Yes");
                break;
            }
            else if(a[left]+a[right]<sum) {
                left++;
            }
            else {
                right--;
            }
        }
    }
}
