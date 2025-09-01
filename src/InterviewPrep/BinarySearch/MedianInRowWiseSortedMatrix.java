package InterviewPrep.BinarySearch;

public class MedianInRowWiseSortedMatrix {
    public static void main(String[] args) {
        int[][] a = {{1, 5, 7, 9, 11}, {2, 3, 4, 5, 10}, {9, 10, 12, 14, 16}};
        int min= Integer.MAX_VALUE;
        int max= Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++) {
            min= Math.min(min,a[i][0]);
            max= Math.max(max,a[i][a[0].length-1]);
        }

        int low=min;
        int high=max;
        int n=a.length;
        int m=a[0].length;
        int req = (n*m)/2;
        while(low<=high) {
            int mid=(low+high)/2;
            int count = countValues(a,mid);
            if(count>req) {
                high=mid-1;
            }
            else {
                low=mid+1;
            }
        }
        System.out.println(low);

    }

    public static int countValues(int a[][], int mid) {
        int count=0;
        for(int i=0;i<a.length;i++) {
            count=count+up(a[i],mid);
        }
        return count;
    }

    public static int up(int[] a, int mid) {
        int low=0;
        int high=a.length-1;
        while(low<=high) {
            int mid1=(low+high)/2;
            if(a[mid1]>mid) {
                high=mid1-1;
            }
            else {
                low=mid1+1;
            }
        }
        return low;
    }
}
