package InterviewPrep.BinarySearch;

public class PeakElementII {
    public static void main(String[] args) {
        int[][] a={{4,2,5,1,4,5},{2,9,3,2,3,2},{1,7,6,0,1,3},{3,6,2,3,7,2}};
        //Brute
//        for(int i=0;i<a.length;i++) {
//            for(int j=0;j<a[0].length;j++) {
//                boolean isPeak =(i==0 || a[i][j]> a[i-1][j]) && (i==a.length-1|| a[i][j]>a[i+1][j])
//                    && (j==0 || a[i][j]> a[i][j-1] )
//                && (j==a[0].length-1 || a[i][j] > a[i][j+1]);
//
//                if(isPeak) {
//                    System.out.println(i +" , "+ j);
//                    return;
//                }
//            }
//        }

        //Optimal
        int low=0; int high=a[0].length-1;
        while(low<=high) {
            int mid=(low+high)/2;
            int maxIndex = maxIndex(a,mid);
            int left= (mid-1>=0) ? a[maxIndex][mid-1] : -1;
            int right = (mid+1<a[0].length) ? a[maxIndex][mid+1] : -1;
            if(a[maxIndex][mid] > left && a[maxIndex][mid]>right) {
                System.out.println(a[maxIndex][mid]);
                return;
            }
            else if(a[maxIndex][mid]>right) {
                high=mid-1;
            }
            else low=mid+1;
        }

    }

    public static int maxIndex(int[][] a,int col) {
        int index=-1,max=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++) {
            if(a[i][col]>max) {
                max=a[i][col];
                index=i;
            }
        }
        return index;
    }
}
