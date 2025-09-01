package InterviewPrep.BinarySearch;

import java.util.Arrays;

public class MinimumNumberOfDaysTomakeMBouquets {
    public static void main(String[] args) {
        int[] arr={7,7,7,7,13,11,12,7};
        int min = Arrays.stream(arr).min().orElse(0);
        int max= Arrays.stream(arr).max().orElse(0);
        //Brute
//        for(int i=min;i<=max;i++) {
//            if(possible(arr,i,2,3)) {
//                System.out.println(i);
//                break;
//            }
//        }

        //Optimal
        int m=2,k=3,n= arr.length;
        if(m*k>n) System.out.println("-1");
        int low=min,high=max;
        while(low<=high) {
            int mid=(low+high)/2;
            if(possible(arr,mid,2,3)) {
                System.out.println(mid);
                high=mid-1;
            }
            else {
                low=mid+1;
            }
        }

    }

    public static boolean possible(int[] arr,int day,int m,int k) {
        int count=0;
        int boq=0;
        for(int i=0;i<arr.length;i++) {
            if(arr[i]<=day) {
                count++;
            }
            else {
                boq+=(count/k);
                count=0;
            }
        }
        boq+=(count/k);
        if(boq>=m) {
            return true;
        }
        return false;
    }
}
