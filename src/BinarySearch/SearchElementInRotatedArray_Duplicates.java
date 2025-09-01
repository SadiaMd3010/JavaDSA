package BinarySearch;
public class SearchElementInRotatedArray_Duplicates {
public static int func(int a[],int n, int target) {
    int low = 0;
    int high = n - 1;
    while (low <= high) {
        int mid = (low + high) / 2;
        if (a[mid] == target) return mid;
        if (a[low] == a[mid] && a[mid] == a[high]) {
            low = low + 1;
            high = high - 1;
        }
        if (a[low] <= a[mid]) {
            if (a[low] <= target && target <= a[mid]) {
                high = mid - 1;
            } else low = mid + 1;
        } else {
            if (a[mid] <= target && target <= a[high]) {
                low = mid + 1;
            } else high = mid - 1;
        }
    }
    return -1;
}

    public static void main(String[] args) {
        int a[]={3,1,2,3,3,3,3};
        int n=a.length;
        int target=1;
        System.out.println(func(a,n,target));
    }


}
