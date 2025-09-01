package Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int a[]= {8,4,2,9,6,2,7};
        for(int i=0;i<a.length;i++) {
            int j=i;
            while(j>0 && a[j-1]>a[j]) {
                int temp=a[j-1];
                a[j-1]=a[j];
                a[j]=temp;
                j--;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
