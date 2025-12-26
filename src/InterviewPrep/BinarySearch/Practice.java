package InterviewPrep.BinarySearch;

public class Practice {
    public static void main(String[] args) {
        int[][] a={{4,2,5,1,4,5},{2,9,3,2,3,2},{1,7,6,0,1,3},{3,6,2,3,7,2}};
        int low=0;
        int high= a[0].length-1;
        while(low<=high) {
            int mid=(low+high)/2;
            int index = func(mid,a);
            int left = mid-1>=0 ? a[index][mid-1] : -1;
            int right = mid+1<a[0].length-1 ? a[index][mid+1] : -1;
            if(a[index][mid]> left && a[index][mid]>right ) {
                System.out.println(a[index][mid]);
                return;
            }
            else if(a[index][mid]>left) {
                low=mid+1;
            }
            else {
                high= mid-1;
            }
        }

    }


    public static int func(int mid,int[][] a) {
        int max=Integer.MIN_VALUE;
        int index=-1;
        for(int i=0;i<a.length;i++) {
            if(a[i][mid]>max) {
                max=a[i][mid];
                index=i;
            }
        }
        return index;
    }
    }