package BinarySearch;

import java.util.Arrays;

public class FirstAndLastOccuranceOfElement {
//    public static void main(String[] args) {
//        //BRUTE
//        int a[]= {2,4,6,8,8,8,11,13};
//        int element=8;
//        int first=-1; int last=-1;
//        for(int i=0;i<a.length;i++) {
//            if(a[i]==element) {
//                if(first==-1) {
//                    first=i; }
//                    last=i;
//            }
//        }
//        System.out.println(first);
//        System.out.println(last);
//
//    }
//    public static int lowerBound(int a[],int x,int n) {
//        int low=0; int high=n-1;
//        int first=n;
//        while(low<=high) {
//            int mid=(low+high)/2;
//            if(a[mid]>=x) {
//                first=mid;
//                high=mid-1;
//            }
//            else {
//                low=mid+1;
//            }
//        }
//        return first;
//    }
//
//    public static int upperBound(int a[],int x,int n) {
//        int low=0; int high=n-1;
//        int last=n;
//        while(low<=high) {
//            int mid=(low+high)/2;
//            if(a[mid]>x) {
//                last=mid;
//                high=mid-1;
//            }
//            else {
//                low=mid+1;
//            }
//        }
//        return last;
//    }
//
//    public static int[] firstAndLastOccurance(int a[],int element) {
//        int n=a.length;
//        int lb=lowerBound(a,element,n);
//        if(lb==n || a[lb]!=element) {
//            return new int[] {-1,-1};
//        }
//        return new int[] {lb,upperBound(a,element,n)-1};
//
//    }
//
//
//public static void main(String[] args) {
//        int a[]= {2,4,6,8,8,8,11,13};
//        int n=a.length;
//        int element=8;
//    System.out.println(Arrays.toString(firstAndLastOccurance(a,element)));

    //OPTIMAL

    public static int lowerBound(int a[],int x,int n) {
        int low=0;
        int high=n-1;
        int first=-1;
        while(low<=high) {
            int mid=(low+high)/2;
            if(a[mid]==x) {
                first=mid;
                high=mid-1;
            }
            else if(x>a[mid]) {
                low=mid+1;
            }
            else high=mid+1;
        }
        return first;
    }

    public static int upperBound(int a[],int x,int n) {
        int low=0;
        int high=n-1;
        int last=-1;
        while(low<=high) {
            int mid=(low+high)/2;
            if(a[mid]==x) {
                last=mid;
                low=mid+1;
            }
            else if(x>a[mid]) {
                low=mid+1;
            }
            else high=mid-1;
        }
        return last;
    }

    public static void main(String[] args) {
        int a[]= {2,4,6,8,8,8,11,13};
        int n=a.length;
        int element=8;
        System.out.println(lowerBound(a,element,n));
        System.out.println(upperBound(a,element,n));

    }


}
