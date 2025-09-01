package InterviewPrep.BinarySearch;

public class Algorithm {

    public static int binarySerach(int[] arr, int n, int target)  {
        int low=0;
        int high=n-1;
        while(low<=high) {
            int mid=(low+high)/2;
            if(arr[mid]==target) {
                return mid;
            }
            else if(target>arr[mid]) {
                low=mid+1;
            }
            else {
                high=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={3,4,7,9,12,15,19,22,25};
        System.out.println(binarySerach(arr, arr.length,15));

    }
}
