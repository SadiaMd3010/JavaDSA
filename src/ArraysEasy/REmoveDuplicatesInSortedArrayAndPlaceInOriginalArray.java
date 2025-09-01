package ArraysEasy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class REmoveDuplicatesInSortedArrayAndPlaceInOriginalArray {
    //BRUTE
//    public static void main(String[] args) {
//        int a[]={1,1,2,2,2,3,4,4,5};
//        HashSet<Integer> set = new HashSet<>();
//        for(int i=0;i<a.length;i++) {
//            set.add(a[i]);
//        }
//
//        int i=0;
//        for(int it:set) {
//            a[i++]=it;
//        }
//
//        System.out.println(i);
//    }
    //OPTIMAL
    public static void main(String[] args) {
        int a[]={1,1,1,2,3,3,4,5};
        int i=0;
        for(int j=1;j<a.length;j++) {
            if(a[j]!=a[i]) {
                a[i+1]=a[j];
                i++;
            }
        }
        System.out.println(i+1);
        System.out.println(Arrays.toString(a));
    }

}
