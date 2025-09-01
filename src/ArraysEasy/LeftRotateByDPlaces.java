package ArraysEasy;

import java.util.Arrays;

public class LeftRotateByDPlaces {
    //BRUTE
//    public static void main(String[] args) {
//        int a[]={1,2,3,4,5}; // 3 4 5 1 2
//        int k=2;
//        k=k%(a.length);
//        int temp[] = new int[k];
//        for(int i=0;i<k;i++) {
//            temp[i]=a[i];
//        }
//        for(int i=0;i<a.length-k;i++) {
//            a[i]=a[i+k];
//        }
//        for(int i=0;i<k;i++) {
//            a[a.length-k+i]=temp[i];
//        }
//
//        System.out.println(Arrays.toString(a));
//
//    }

    //OPTIMAL
    public static void reverse(int a[],int start,int end) {
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
        k=k%a.length;
        reverse(a,0,k-1);
        reverse(a,k,n-1);
        reverse(a,0,n-1);
        System.out.println(Arrays.toString(a));

    }

}
