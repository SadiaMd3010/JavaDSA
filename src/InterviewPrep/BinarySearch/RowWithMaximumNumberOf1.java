package InterviewPrep.BinarySearch;

public class RowWithMaximumNumberOf1 {
    public static void main(String[] args) {
        int[][] a = {{0,1,1},{1,1,1},{0,1,0}};
        int max=Integer.MIN_VALUE;
        int index=-1;
        //Brute
//        for(int i=0;i<a.length;i++) {
//            int count=0;
//            for(int j=0;j<a[0].length;j++) {
//                if(a[i][j]==1) {
//                    count++;
//                }
//            }
//            if(count>max) {
//                max=count;
//                index=i;
//            }
//        }
//        System.out.println(index);

        //Optimal
        for(int i=0;i<a.length;i++) {
            int count = a[0].length-lowerBound(a[i],1);
            if(count>max) {
                max=count;
                index=i;
            }
        }
        System.out.println(index);
    }

    public static int lowerBound(int[] a, int target) {
        int ans=-1;
        int low=0;
        int high=a.length-1;
        while(low<=high) {
            int mid=(low+high)/2;
            if(a[mid]>=target) {
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
