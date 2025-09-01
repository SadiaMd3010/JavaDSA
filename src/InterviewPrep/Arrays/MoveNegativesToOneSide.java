package InterviewPrep.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveNegativesToOneSide {
    public static void main(String[] args) {
        int a[]= {2,5,1,-3,-1,1,-5,3};
//        List<Integer> list = new ArrayList<>();
//        for(int i=0;i<a.length;i++) {
//            if(a[i]<0) {
//                list.add(a[i]);
//            }
//        }
//
//        for(int i=0;i<a.length;i++) {
//            if(a[i]>0) {
//                list.add(a[i]);
//            }
//        }
//        System.out.println(list);
        int j=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++) {
            if(a[i]<0) {
                j=i;
                break;
            }
        }

        for(int i=j+1;i<a.length;i++) {
            if(a[i]>0) {
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                j++;
            }
        }
        System.out.println(Arrays.toString(a));

    }
}
