package ArraysMedium;

import java.util.ArrayList;
import java.util.Arrays;

public class RearrangeArrayElementsBySize_EqualPostiveAndNegative {
    public static void main(String[] args) {
//        int a[]={2,3,-1,-4,-6,9,5,-8};
//        int n=a.length;
//        ArrayList<Integer> pos = new ArrayList<>();
//        ArrayList<Integer> neg = new ArrayList<>();
//        for(int i=0;i<a.length;i++) {
//            if(a[i]>0) {
//                pos.add(a[i]);
//            }
//            else {
//                neg.add(a[i]);
//            }
//        }
//
//        for(int i=0;i<n/2;i++) {
//            a[2*i]=pos.get(i);
//            a[2*i+1]=neg.get(i);
//        }
//        System.out.println(Arrays.toString(a));

        //OPTIMAL
        int a[]={2,3,-1,-4,-6,9,5,-8};
        int b[]=new int[a.length];
        int posIndex=0;
        int negIndex=1;
        for(int i=0;i<a.length;i++) {
            if(a[i]<0) {
                b[negIndex]=a[i];
                negIndex+=2;
            }
            else {
                b[posIndex]=a[i];
                posIndex+=2;
            }
        }
        System.out.println(Arrays.toString(b));



    }
}
