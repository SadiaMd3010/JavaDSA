package InterviewPrep.BinarySearch;

public class FloorInSortedArray {
    public static void main(String[] args) {
        int[] arr={10,20,25,30,40,50};
        System.out.println(findFloor(arr, arr.length,25));
    }

    public static int findFloor(int[] arr, int n, int target) {
        int low=0;
        int high=n-1;
        int ans=-1;
        while(low<=high) {
            int mid=(low+high)/2;
            if(arr[mid]<=target) {
                ans=arr[mid];
                low=mid+1;
            }
            else {
                high=mid-1;
            }
        }
        return ans;
    }
}
