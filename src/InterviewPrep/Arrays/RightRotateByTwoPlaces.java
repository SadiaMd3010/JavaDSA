package InterviewPrep.Arrays;

import java.util.Arrays;

public class RightRotateByTwoPlaces {
    public static void main(String[] args) {
        int a[]= {1,2,3,4,5};
        int d =2;
//        int n=a.length-1;
//        int temp[] =new int[d];
//        for(int i=0;i<d;i++) {
//            temp[i]=a[n-d+1+i];
//        }
//
//        for(int i=n;i>=n-d;i--) {
//            a[i]= a[i-(n-d)];  // 4-(4-2)
//        }
//        for(int i=0;i<d;i++) {
//            a[i]= temp[i];
//        }
//        System.out.println(Arrays.toString(a));

        //OPtimal
        int n = a.length-1;
      reverse(a,0,n-d); // 4-2 =2
      reverse(a,d+1,a.length-1);
      reverse(a,0,n);
        System.out.println(Arrays.toString(a));
    }

    public static void reverse(int[] a,int start, int end) {
        while(start<end) {
            int temp= a[start];
            a[start] =a[end];
            a[end]= temp;
            start++;
            end--;
        }

    }

}
