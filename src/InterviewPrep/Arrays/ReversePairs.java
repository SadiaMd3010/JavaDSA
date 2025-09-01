package InterviewPrep.Arrays;

import java.util.ArrayList;
import java.util.List;

public class ReversePairs {

    //Optimal // Brute is similar to count inversions
    public static void main(String[] args) {
        int[] arr={4,1,2,3,1};
        System.out.println(mergeSort(arr,0,arr.length-1));
    }

    public static int mergeSort(int[] arr, int low, int high) {
        int count=0;
        if(low>=high) return count;
        int mid= (low+high)/2;
        count+=mergeSort(arr,low,mid);
        count+=mergeSort(arr,mid+1,high);
        count+=countReversePairs(arr,low,mid,high);
        merge(arr,low,mid,high);
        return count;
    }

    public static int countReversePairs(int[] arr, int low, int mid, int high) {
        int right=mid+1;
        int count=0;
        for(int i=low;i<=mid;i++) {
            while(right<=high && arr[i]>2*arr[right]) {
               right++;
               count+=right-(mid+1);
            }
        }
        return count;
    }

    public static void merge(int[] arr, int low, int mid,int high) {
        int left=low;
        List<Integer> list = new ArrayList<>();
        int right =mid+1;
        while(left<=mid && right<=high) {
            if(arr[left]<=arr[right]) {
                list.add(arr[left]);
                left++;
            }
            else {
                list.add(arr[right]);
                right++;
            }
        }

        while (left<=mid) {
            list.add(arr[left]);
            left++;
        }

        while (right<=high) {
            list.add(arr[right]);
            right++;
        }

        for(int i=low;i<=high;i++) {
            arr[i]=list.get(i-low);
        }

    }
}
