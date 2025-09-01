package InterviewPrep.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortArrayOf012 {
    public static void main(String[] args) {
        int a[] = {1, 2, 0, 2, 2, 1, 0, 1, 2, 0, 1, 1, 0};
        //Brute
        // SOrt using any type of sorting
        //Better
//        int count=0;
//        int count1=0;
//        int count2=0;
//       for(int i=0;i<a.length;i++) {
//           if(a[i]==0) {
//               count++;
//           }
//           else if(a[i]==1) {
//               count1++;
//           }
//           else {
//               count2++;
//           }
//       }
//
//       for (int i=0;i<count;i++) {
//           a[i]=0;
//       }
//       for (int i=count;i<count+count1;i++) {
//           a[i]=1;
//       }
//       for (int i=count+count1;i<a.length;i++) {
//           a[i]=2;
//       }
//        System.out.println(Arrays.toString(a));
//    }
        //Optimal - Dutch National Flag Algo
        int low = 0;
        int mid = 0;
        int high = a.length - 1;
        for (int i = 0; i < a.length; i++) {
            if (a[mid] == 0) {
                 swap(a,low,mid);
                 low++;
                 mid++;
            }
            else if(a[mid]==1) {
                mid++;
            }
            else {
                swap(a,mid,high);
                high--;
            }
        }
        System.out.println(Arrays.toString(a));

    }

    public static void swap(int[] a, int i, int j) {
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }

}
