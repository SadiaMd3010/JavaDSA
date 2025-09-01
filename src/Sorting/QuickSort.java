package Sorting;

import java.util.Arrays;

public class QuickSort {
    public static void quickSort(int a[],int low, int high) {
        if(low<high) {
            int partitionIndex = partition(a, low, high);
            quickSort(a, low, partitionIndex - 1);
            quickSort(a, partitionIndex + 1, high);
        }
    }
    public static int partition(int[] a, int low, int high) {
        int pivot=a[low];
        int i=low;
        int j= high;
        while(i<j) {
            while(i<high && a[i]<=pivot ) {
                i++;
            }
            while(j>low &&a[j]>pivot) {
                j--;
            }
            if(i<j) {
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }

        int temp=a[low];
        a[low]=a[j];
        a[j]=temp;

        return j;
    }

    public static void main(String[] args) {
        int a[]= {4,3,5,1,2};
        quickSort(a,0,a.length-1);
        System.out.println(Arrays.toString(a));
    }
}
