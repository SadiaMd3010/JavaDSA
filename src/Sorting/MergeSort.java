package Sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {

    public static void mergeSort(int[] a, int low, int high) {
        if(low>=high) return;
        int mid=(low+high)/2;
        mergeSort(a,low,mid);
        mergeSort(a,mid+1,high);
        merge(a,low,mid,high);
    }

    public static void merge(int[] a, int low, int mid, int high) {
        ArrayList<Integer> al = new ArrayList<>();
        int left=low;
        int right=mid+1;
        while(left<=mid && right<=high) {
            if(a[left]<=a[right]) {
                al.add(a[left]);
                left++;
            }
            else {
                al.add(a[right]);
                right++;
            }
        }

        while(left<=mid) {
            al.add(a[left]);
            left++;
        }
        while(right<=high) {
            al.add(a[right]);
            right++;
        }

        for(int i=low;i<=high;i++) {
            a[i]=al.get(i-low);
        }
    }

    public static void main(String[] args) {
        int a[]= {5,3,4,1,2};
        mergeSort(a,0,a.length-1);
        System.out.println(Arrays.toString(a));
    }
}
