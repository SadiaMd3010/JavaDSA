package InterviewPrep.BinarySearch;

public class Practice {
    public static void main(String[] args) {
        int max=Integer.MIN_VALUE;
        int[][] ans ={{1,2,3},{9,4,5},{8,8,1}};
        for(int i=0;i<ans.length;i++) {
            int rowMax=func(ans[i]);
            if(rowMax>max) {
                max=rowMax;
            }
        }
        System.out.println(max);
    }


    public static int func(int[] ans) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<ans.length;i++) {
            if(ans[i]>max) {
                max=ans[i];
            }
        }
        return max;
    }
}


