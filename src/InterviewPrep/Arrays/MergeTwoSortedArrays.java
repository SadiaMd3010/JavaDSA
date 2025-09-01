package InterviewPrep.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr1= {1,3,5,7};
        int[] arr2 = {0,2,6,8,9};
        int i=0;
        int j=0;
//        List<Integer> list = new ArrayList<>();
//        while(i<arr1.length && j<arr2.length) {
//            if(arr1[i]<=arr2[j]) {
//                if(list.isEmpty() || list.get(list.size()-1)!=arr1[i]) {
//                    list.add(arr1[i]);
//                }
//                i++;
//            }
//            else {
//                if(list.isEmpty() || list.get(list.size()-1)!=arr2[j]) {
//                    list.add(arr2[j]);
//                }
//                j++;
//            }
//        }
//
//        while(i< arr1.length) {
//            if(list.get(list.size()-1)!=arr1[i]) {
//                list.add(arr1[i]);
//            }
//            i++;
//        }
//
//        while(j< arr2.length) {
//            if(list.get(list.size()-1)!=arr2[j]) {
//                list.add(arr2[j]);
//            }
//            j++;
//        }
//
//        for(i=0;i<list.size();i++) {
//            if(i<arr1.length) {
//                arr1[i]=list.get(i);
//            }
//            else {
//                arr2[i-arr1.length]=list.get(i);
//            }
//        }
//        System.out.println(Arrays.toString(arr1));
//        System.out.println(Arrays.toString(arr2));

        //Optimal
//        i= arr1.length-1;
//        j=0;
//        while(i>=0 && j<arr2.length) {
//            if(arr1[i]>arr2[j]) {
//                int temp=arr1[i];
//                arr1[i]=arr2[j];
//                arr2[j]=temp;
//                i--;
//                j++;
//            }
//            else {
//                break;
//            }
//        }
//        Arrays.sort(arr1);
//        Arrays.sort(arr2);
//        System.out.println(Arrays.toString(arr1));
//        System.out.println(Arrays.toString(arr2));

        //Optimal 3
        int gap = (arr1.length+ arr2.length)/2 + (arr1.length+ arr2.length)%2 ;
        while (gap>0) {
            int left = 0;
            int right = left+gap;
            while(right<(arr1.length+ arr2.length)) {
                if(left<arr1.length && right >=arr1.length) {
                    swap(arr1,arr2,left,right-arr1.length);

                }
                else if (left>=arr1.length) {
                    swap(arr2,arr2,left-arr1.length,right-arr1.length);
                }
                else {
                    swap(arr1,arr1,left,right);
                }
                left++;
                right++;
            }
            if(gap==1) break;
            gap=(gap/2)+(gap%2);
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

    }

    private static void swap(int[] arr1, int arr2[], int i, int j) {
        if(arr1[i]>arr2[j]) {
            int temp = arr1[i];
            arr1[i] = arr2[j];
            arr2[j] = temp;
        }
    }
}
