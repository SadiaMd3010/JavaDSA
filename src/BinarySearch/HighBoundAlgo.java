package BinarySearch;

public class HighBoundAlgo {
    public static void main(String[] args) {
        int a[]={2,6,7,9,13,17,22};
        int target=22;
        System.out.println(func(a,target));
    }

    public static int func(int a[],int target) {
        int low=0;
        int high=a.length-1;
        int ans=a.length;
        while(low<=high) {
            int mid=(low+high)/2;
            if(a[mid]>target) {
                ans=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        return ans;
    }
}
