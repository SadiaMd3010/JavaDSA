package InterviewPrep.TwoPointersAndSlidingWindow;

public class ConstantWindow {
    public static void main(String[] args) {
        int[] arr={1,2,-2,3,5,8,3,-3,5,2};
        int k=4;
        int l=0;
        int r= k-1;
        int sum=0;
        int maxSum= Integer.MIN_VALUE;
        for(int i=l;i<=r;i++) {
            sum=sum+arr[i];
        }
        maxSum=sum;
        while(r<arr.length-1) {
            sum=sum-arr[l];
            l++;
            r++;
            sum=sum+arr[r];
            maxSum=Math.max(maxSum,sum);
        }
        System.out.println(maxSum);

    }
}
