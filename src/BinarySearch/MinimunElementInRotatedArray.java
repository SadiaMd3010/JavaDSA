package BinarySearch;

public class MinimunElementInRotatedArray {
    public static void main(String[] args) {
        int a[]={7,8,9,1,2,3,4};
        int low=0;
        int high=a.length-1;
        int min=Integer.MAX_VALUE;
        while(low<=high) {
            int mid=(low+high)/2;
            if(a[low]<=a[high]) {
                min=Math.min(min,a[low]);
                break;
            }
            if(a[low]<=a[mid]) {
                min=Math.min(min,a[low]);
                low=mid+1;
            }
            else {
                min=Math.min(min,a[mid]);
                high=mid-1;
            }
        }
        System.out.println(min);
    }
}
