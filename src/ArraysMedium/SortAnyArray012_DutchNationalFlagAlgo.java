package ArraysMedium;

import java.util.Arrays;

public class SortAnyArray012_DutchNationalFlagAlgo {
    public static void swap(int a[],int start,int end) {
        int temp=a[start];
        a[start]=a[end];
        a[end]=temp;
    }
    public static void main(String[] args) {
        int a[]={2,1,0,0,0,1,2,1,2,1,2,0};
        int low=0;
        int mid=0;
        int high=a.length-1;
        while(mid<high)
            if(a[mid]==0) {
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
        System.out.println(Arrays.toString(a));

    }
}
