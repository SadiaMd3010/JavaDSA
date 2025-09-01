package InterviewPrep.Arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Duplicates {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        int[] arr = {5, 7, 2, 1, 4, 5, 2, 2};
//        for(int i=0;i< arr.length-1;i++) {
//            for(int j=i+1;j< arr.length;j++) {
//                if(arr[i]==arr[j] && !l.contains(arr[i])) {
//                    l.add(arr[j]);
//                }
//            }
//        }
//        System.out.println(l);

//        Arrays.sort(arr);
//        int lastChecked = Integer.MIN_VALUE;
//        for(int i=0;i< arr.length-1;i++) {
//
//            if(arr[i]==arr[i+1] && lastChecked!=arr[i]) {
//                System.out.println(arr[i]);
//                lastChecked=arr[i];
//            }
//        }

        HashSet<Integer> hs = new HashSet<>();
        HashSet<Integer> dup = new HashSet<>();
        for (int j : arr) {
            if (!hs.add(j)) {
                dup.add(j);
            }
        }
        System.out.println(dup);
    }



}
