package InterviewPrep.BinarySearch;

public class SearchInA2DMatrix {
    public static void main(String[] args) {
        int[][] a={{3,4,7,9},{12,13,16,18}, {20,21,23,29}};
        int target =23;
        //Brute
//        for(int i=0;i<a.length;i++) {
//            for(int j=0;j<a[0].length;j++) {
//                if(a[i][j]==target) {
//                    System.out.println("true");
//                }
//            }
//        }

        //Better
//        boolean val = false;
//        for (int i=0;i<a.length;i++) {
//            if(a[i][0]<=target && target<=a[i][a[0].length-1]) {
//                val = searchTarget(a[i], target);
//            }
//        }
//        System.out.println(val);

        //Optimal
        System.out.println(searchVal(a,target));


    }

    public static boolean searchVal(int[][] a, int target) {
        int low=0;
        int n=a.length;
        int m=a[0].length;
        int high=n*m -1;
        while(low<=high) {
            int mid=(low+high)/2;
            int row= mid/m;
            int col= mid%m;
            if(a[row][col]==target)
            {
                System.out.println(row);
                System.out.println(col);
                return true;
            }
            else if(a[row][col]>target) high=mid-1;
            else low=mid+1;
        }
        return false;
    }

    public static boolean searchTarget(int[] a, int target) {
        int low=0;int high = a.length-1;
        while(low<=high) {
            int mid=(low+high)/2;
            if(a[mid]==target) {
                return true;
            }
            else if(target>a[mid]) {
                low=mid+1;
            }
            else {
                high=mid-1;
            }
        }
        return false;
    }
}
