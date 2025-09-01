package InterviewPrep.BinarySearch;

public class KthMissingPositiveInteger {
    public static void main(String[] args) {
        int[] a={2,3,4,7,11};
        int k=5;
        //Brute
//        for(int i=0;i<a.length;i++) {
//            if(a[i]<=k) {
//                k++;
//            }
//            else {
//                break;
//            }
//        }
//        System.out.println(k);

        //Optimal
        int n=a.length;
        int low=0,high=n-1;
        while(low<=high) {
            int mid=(low+high)/2;
            int missing = a[mid]-(mid+1);
            if(missing<=k) {
                low=mid+1;
            }
            else {
                high=mid-1;
            }
        }
        System.out.println(low+k);

    }
}
