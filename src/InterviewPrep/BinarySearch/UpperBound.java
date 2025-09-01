package InterviewPrep.BinarySearch;

public class UpperBound {
    public static void main(String[] args) {
        int[] arr={2,3,6,7,8,8,11,11,11,12};
        System.out.println(upperBound(arr, arr.length,11));

    }

    public static int upperBound(int[] arr, int n, int target) {
        int low=0;
        int high=n-1;
        int ans = n;
        while(low<=high) {
            int mid=(low+high)/2;
            if(arr[mid]>target) {
                ans=mid;
                high=mid-1;
            }
            else {
                low=mid+1;
            }

        }
        return ans;
    }
}
