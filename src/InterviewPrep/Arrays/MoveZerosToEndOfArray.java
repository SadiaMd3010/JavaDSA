package InterviewPrep.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveZerosToEndOfArray {
    public static void main(String[] args) {
        int a[]= {1,0,2,3,2,0,0,4,5,1};
        List<Integer> al = new ArrayList<>();
        for(int i=0;i<a.length;i++) {
            if(a[i]!=0) {
                al.add(a[i]);
            }
        }

       for(int i=al.size();i<a.length;i++) {
           al.add(0);
       }
        System.out.println(al);

        //Optimal
//        int j=-1;
//        for(int i=0;i<a.length;i++) {
//            if(a[i]==0) {
//                j=i;
//                break;
//            }
//        }
//
//        for(int i=j+1;i<a.length;i++) {
//            if(a[i]!=0) {
//                swap(a,i,j);
//                j++;
//            }
//        }
//        System.out.println(Arrays.toString(a));
    }

    public static void swap(int a[],int i,int j) {
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
}
