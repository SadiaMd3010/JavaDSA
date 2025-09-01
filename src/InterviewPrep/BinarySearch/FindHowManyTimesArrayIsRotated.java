package InterviewPrep.BinarySearch;

public class FindHowManyTimesArrayIsRotated {
    public static void main(String[] args) {
        int[] arr={3,4,5,1,2};
        System.out.println(findNumber(arr,arr.length));

    }

    public static int findNumber(int[] arr,int n) {
        int low=0,high=n-1,min=Integer.MAX_VALUE,index=-1;
        while(low<=high) {
            int mid=(low+high)/2;
            if(arr[low]<=arr[mid]) {
                if(arr[low]<min) {
                    index=low;
                    min=arr[low];
                }
                low=mid+1;
            }
            else {
                if(arr[mid]<min) {
                    index=mid;
                    min=arr[mid];
                }
                high=mid-1;
            }
        }
        return index;
    }
}
