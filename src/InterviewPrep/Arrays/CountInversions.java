package InterviewPrep.Arrays;

import java.util.ArrayList;
import java.util.List;

public class CountInversions {
    public static void main(String[] args) {
        int[] arr={5,3,2,4,1};
        //Brute
//        int count=0;
//        for(int i=0;i<arr.length;i++) {
//
//            for(int j=i+1;j< arr.length;j++) {
//                if(arr[i]>arr[j]) {
//                    count++;
//                }
//            }
//
//        }
//        System.out.println(count);

        //Optimal
        int low=0;
        int high=arr.length-1;
        System.out.println(mergeSort(arr,low,high));
    }

    public static int mergeSort(int[] a, int low, int high) {
        int count=0;
        if(low>=high) return count;
        int mid=(low+high)/2;
        count+=mergeSort(a,low,mid);
        count+=mergeSort(a,mid+1,high);
        count+=merge(a,low,mid,high);
        return count;
    }

    public static int merge(int[] a, int low, int mid, int high) {
        List<Integer> list = new ArrayList<>();
        int count=0;
        int left=low;
        int right= mid+1;
        while(left<=mid && right<=high) {
            if(a[left]<=a[right]) {
                list.add(a[left]);
                left++;
            }
            else {
                list.add(a[right]);
                count+=mid-left+1;
                right++;
            }
        }

        while(left<=mid) {
            list.add(a[left]);
            left++;
        }

        while(right<=high) {
            list.add(a[right]);
            right++;
        }

        for(int i=low;i<=high;i++) {
            a[i]= list.get(i - low);

        }
        return count;
    }
}
