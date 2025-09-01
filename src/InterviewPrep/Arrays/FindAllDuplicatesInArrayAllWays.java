package InterviewPrep.Arrays;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicatesInArrayAllWays {
    public static void main(String[] args) {
        //First Method
        int[] a={2,1,2,4,5,3,6,7};
//        for(int i=0;i<a.length;i++) {
//            boolean found = false;
//            for(int k=0;k<i;k++) {
//                if(a[k]==a[i]) {
//                    found = true;
//                    break;
//                }
//            }
//            if(!found) {
//
//            for(int j=i+1;j<a.length;j++) {
//                if (a[i] == a[j]) {
//                    System.out.println(a[i]);
//                    break;
//                }
//            }
//            }
//        }
        //Method 2
//        Arrays.sort(a);
//        int lastChecked=Integer.MIN_VALUE;
//        for(int i=0;i<a.length-1;i++) {
//            if(a[i]==a[i+1] && lastChecked!=a[i]) {
//                System.out.println(a[i]);
//                lastChecked=a[i];
//            }
//        }

        //Method 3
//        HashSet<Integer> hs = new HashSet<>();
//        List<Integer> l = new ArrayList<>();
//        for(int i : a) {
//            if(hs.contains(i) && !l.contains(i)) {
//                l.add(i);
//            }
//            hs.add(i);
//        }
//        System.out.println(l);

        //Method 4
        List<Integer> l = new ArrayList<>();
        for(int i=0;i<a.length;i++) {
            int index = Math.abs(a[i]) - 1;
            if (a[index] < 0) {
                l.add(index + 1);
            }

            a[index] = a[index]*-1;
        }
        System.out.println(l);

    }


}
