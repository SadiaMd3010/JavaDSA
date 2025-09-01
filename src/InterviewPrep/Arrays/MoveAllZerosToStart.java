package InterviewPrep.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveAllZerosToStart {
    public static void main(String[] args) {
        int a[]={2,0,3,4,0,1,7,6,0};
//        List<Integer> l= new ArrayList<>();
//        for(int i=0;i<a.length;i++) {
//            if(a[i]==0) {
//                l.add(a[i]);
//            }
//        }
//        for (int i=0;i<a.length;i++) {
//            if(a[i]!=0) {
//                l.add(a[i]);
//            }
//        }
//        System.out.println(l);

        int j=-1;
        for(int i=a.length-1;i>=0;i--) {
            if(a[i]==0) {
                j=i;
                break;
            }
        }

        for(int i=j-1;i>=0;i--) {
            if(a[i]!=0) {
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                j--;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
