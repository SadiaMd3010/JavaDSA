package BinarySearch;

public class PeakElement {
//    public static void main(String[] args) {
//       int a[]={1,10,13,7,6,5,4,2,1,0};
//       int n=a.length;
//        System.out.println(peakElement(a,n));
//    }
//
//    public static int peakElement(int a[],int n) {
//         if(n==1) return 0;
//         if(a[0]>a[1])  return 0;
//         if(a[n-1]>a[n-2]) return n-1;
//         int low=1; int high=n-1;
//         while(low<=high) {
//             int mid=(low+high)/2;
//             if(a[mid]>a[mid-1] && a[mid]>a[mid+1]) return mid;
//             else if(a[mid]>a[mid-1]) low=mid+1;
//             else high=mid-1;
//         }
//         return -1;
//
//    }

    public static void main(String[] args) {
        int a[]={1,10,13,7,6,5,4,2,1,0};
        int n=a.length;
        for(int i=0;i<a.length;i++) {
            if((i==0 || a[i-1]<a[i]) && (i==n-1 || a[i]>a[i+1])) {
                System.out.println(i);
            }
        }

    }
}
