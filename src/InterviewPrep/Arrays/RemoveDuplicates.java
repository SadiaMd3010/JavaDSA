package InterviewPrep.Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
       int[] a= {3, 6, 7, 5, 9, 3, 5, 3, 5};
        Arrays.sort(a); // 2 2 2 3 7 7 7 9
        for(int i=0;i<a.length-1;i++) {
            if(a[i]!=a[i+1]) {
                System.out.println(a[i]);
            }
        }
        System.out.println(a[a.length-1]);
//        int i=0;
//        for(int j=1;j<a.length;j++) {
//            if(a[i]!=a[j]) {
//                System.out.println(a[i]);
//
//            }
//            i++;
//        }
    }
}
