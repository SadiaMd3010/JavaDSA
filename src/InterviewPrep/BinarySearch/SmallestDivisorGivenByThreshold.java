package InterviewPrep.BinarySearch;

import java.util.Arrays;

public class SmallestDivisorGivenByThreshold {
    public static void main(String[] args) {
        int[] a={1,2,5,9};
        int threshold=6;
        int max = Arrays.stream(a).max().orElse(0);
        //Brute
//        for(int i=1;i<=max;i++) {
//            if(smallestDivisor(a,i)<=threshold) {
//                System.out.println(i);
//                return;
//            }
//        }
        //Optimal
        int low=1;int high=max;
        while(low<=high) {
            int mid=(low+high)/2;
            if(smallestDivisor(a,mid)<=threshold) {
                System.out.println(mid);
                high=mid-1;
            }
            else {
                low=mid+1;
            }
        }

    }

    public static int smallestDivisor(int[] a,int i) {
        int sum=0;
        for(int j=0;j<a.length;j++) {
            sum+=Math.ceil((double)(a[j])/(double) (i));
        }
        return sum;
    }
}
