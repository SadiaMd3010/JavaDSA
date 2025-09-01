package InterviewPrep.Arrays;

import java.util.Arrays;

public class ReArrangeArraysBySize {
    public static void main(String[] args) {
//        int[] a = {3,1,-2,-5,2,-4};
//        int[] b= new int[a.length];
//        int posIndex = 0;
//        int negIndex=1;
//        for(int i=0;i<a.length;i++) {
//            if(a[i] >0) {
//                b[posIndex]=a[i];
//                posIndex=posIndex+2;
//            }
//            else {
//                b[negIndex]=a[i];
//                negIndex=negIndex+2;
//            }
//        }
//        System.out.println(Arrays.toString(b));

        //If positive and negative count differs

        int a[] = {3, 1, -2, -2, 4, -9, -4, -7, -6};
        int b[] = new int[a.length];
        int posIndex = 0;
        int negIndex = 1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= 0 && posIndex<a.length) {
                b[posIndex] = a[i];
                posIndex = posIndex + 2;
            } else if(a[i]<0 && negIndex<a.length) {
                b[negIndex] = a[i];
                negIndex = negIndex + 2;
            }
        }

        for(int i=0;i<a.length;i++) {
            if(b[i]==0) {
                b[i]=a[i];
            }
        }
        System.out.println(Arrays.toString(b));
    }
}
