package BinarySearch;

public class BinarySearchAlgo {
    public static int func(int a[],int target) {
        int low=0;
        int high=a.length-1;
        while(low<=high) {
            int mid=(low+high)/2;
            if(a[mid]==target) return mid;
            else if(target>a[mid]) low=mid+1;
            else high=mid-1;

        }
        return -1;
    }
    public static void main(String[] args) {
        int a[]={2,6,7,9,13,17,22};
        int target=17;
        System.out.println(func(a,target));

    }
}
