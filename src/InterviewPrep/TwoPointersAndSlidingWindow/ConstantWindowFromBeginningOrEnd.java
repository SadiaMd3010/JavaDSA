package InterviewPrep.TwoPointersAndSlidingWindow;

public class ConstantWindowFromBeginningOrEnd {
    public static void main(String[] args) {
        int[] arr={1, 2, 3, 4, 5, 6};
        int k=3;
        int lsum=0,rSum=0;
        int maxSum=0;
        for(int i=0;i<=k-1;i++) {
            lsum+=arr[i];
        }
        maxSum=lsum;

        int rIndex=arr.length-1;
        for(int i=k-1;i>=0;i--) {
            lsum=lsum-arr[i];
            rSum=rSum+arr[rIndex];
            rIndex=rIndex-1;
            maxSum=Math.max(maxSum,lsum+rSum);
        }
        System.out.println(maxSum);



    }
}
