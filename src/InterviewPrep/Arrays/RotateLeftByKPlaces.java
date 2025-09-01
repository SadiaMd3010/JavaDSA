package InterviewPrep.Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RotateLeftByKPlaces {
    public static void main(String[] args) {
        int a[]= {1,2,3,4,5,6};
        int d=2;
//        int[] temp = new int[d];
//        for(int i=0;i<d;i++) {
//            temp[i]=a[i];
//        }
//
//        for(int i=d;i<a.length;i++) {
//           a[i-d]=a[i];
//        }
//
//        for(int i=a.length-d;i<a.length;i++) {
//            a[i]=temp[i-(a.length-d)];
//        }
//
//        System.out.println(Arrays.toString(a));

        //OPTIMAL
        reverse(a,0,d-1);
        reverse(a,d,a.length-1);
        reverse(a,0,a.length-1);
        System.out.println(Arrays.toString(a));

    }

    public static  void reverse(int[] a,int start,int end) {
        while(start<end) {
            int temp= a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
    }


}
