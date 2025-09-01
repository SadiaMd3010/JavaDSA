package InterviewPrep.BinarySearch;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MediamOf2SortedArrays {
    public static void main(String[] args) {
        int[] arr1={1,3,4,7,10,12};
        int[] arr2={2,3,6,15};
        int i=0;
        int j=0;
        //Brute
//        List<Integer> list = new ArrayList<>();
//        while(i<arr1.length && j<arr2.length) {
//            if(arr1[i]<arr2[j]) {
//                list.add(arr1[i]);
//                i++;
//            }
//            else {
//                list.add(arr2[j]);
//                j++;
//            }
//        }
//
//        while (i<arr1.length) {
//            list.add(arr1[i]);
//            i++;
//        }
//
//        while (i<arr2.length) {
//            list.add(arr2[j]);
//            j++;
//        }
//
//        int n= arr1.length+arr2.length;
//        if(n%2==1) {
//            System.out.println(list.get(n/2));
//        }
//        else if(n%2==0) {
//            System.out.println((list.get(n/2)+list.get(n/2)-1)/2);
//        }

        //Better
//        int count=0;
//        int n=arr1.length+arr2.length;
//        int index2=n/2;
//        int index1=index2-1;
//        int ele1=-1,ele2=-1;
//        while(i<arr1.length && j<arr2.length) {
//            if(arr1[i]<arr2[j]) {
//                if(count==index1) {
//                    ele1=arr1[i];
//                }
//                if(count==index2) {
//                    ele2=arr1[i];
//                }
//                count++;
//                i++;
//            }
//            else {
//                if(count==index1) {
//                    ele1=arr2[j];
//                }
//                if(count==index2) {
//                    ele2=arr2[j];
//                }
//                count++;
//                j++;
//            }
//        }
//
//        while (i<arr1.length) {
//            if(count==index1) ele1=arr1[i];
//            if(count==index2) ele2=arr1[i];
//            count++;
//            i++;
//        }
//
//        while (j<arr2.length) {
//            if(count==index1) ele1=arr2[j];
//            if(count==index2) ele2=arr2[j];
//            count++;
//            j++;
//        }
//
//        if(n%2==1) {
//            System.out.println(ele2);
//        }
//        else if(n%2==0) {
//            System.out.println((ele1+ele2)/2);
//        }

        //Optimal
        System.out.println(findMedianOf2SortedArrays(arr1,arr2));




    }

    public static double findMedianOf2SortedArrays(int[] arr1,int[] arr2) {
        int n=arr1.length+arr2.length;
        int low=0; int high =arr2.length;
        if(arr1.length>arr2.length) return findMedianOf2SortedArrays(arr2,arr1);
        int left=(arr1.length+arr2.length+1)/2;
        while(low<=high) {
            int mid1=(low+high)/2;
            int mid2=left-mid1;
            int l1= (mid1>0) ? arr1[mid1-1] : Integer.MIN_VALUE;
            int l2= (mid2>0) ? arr2[mid2-1] : Integer.MIN_VALUE;
            int r1= (mid1<arr1.length) ? arr1[mid1] : Integer.MAX_VALUE;
            int r2= (mid2<arr2.length) ? arr2[mid2] : Integer.MAX_VALUE;

            if(l1<=r2 && l2<=r1) {
                if(n%2==0) {
                    return (Math.max(l1,l2)+Math.min(r1,r2))/2.0;
                }
                else if(n%2==1) {
                    return (Math.max(l1,l2));
                }
            }
            else if(l1>r2) high=mid1-1;
            else low=mid1+1;
        }
        return 0.0;
    }
}
