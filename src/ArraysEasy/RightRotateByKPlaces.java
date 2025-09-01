package ArraysEasy;

import java.util.Arrays;

public class RightRotateByKPlaces {
//    public static void main(String[] args) {
    //BRUTE
//        int a[]={1,2,3,4,5}; // 4,5,1,2,3
//        int k=2;
//        k=k%a.length;
//        int n=a.length;
//        int temp[]=new int[k];
//        for(int i=0;i<k;i++) {
//            temp[i]=a[n-k+i];
//        }
//
//        for(int i=a.length-1;i>=k;i--) {
//            a[i]=a[i-k];
//        }
//        for(int i=0;i<k;i++) {
//            a[i]=temp[i];
//        }
//        System.out.println(Arrays.toString(a));
//    }
    public static void reverse(int[] a,int start,int end) {
        while(start<end) {
            int temp=a[start];
            a[start]=a[end];
            a[end]=temp;
            start++;
            end--;
        }
    }
     public static void main(String[] args) {
         int a[]={1,2,3,4,5};
         int k=2;
         int n=a.length;
         k=k%n;
         reverse(a,0,n-1);
         reverse(a,0,k-1);
         reverse(a,k,n-1);
         System.out.println(Arrays.toString(a));

}
}
