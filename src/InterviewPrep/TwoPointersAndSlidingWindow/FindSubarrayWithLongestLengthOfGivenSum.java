package InterviewPrep.TwoPointersAndSlidingWindow;

public class FindSubarrayWithLongestLengthOfGivenSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 1, 1, 1, 2, 2, 3};
        int k = 5;

        int l = 0, r = 0, maxLen = 0, sum = 0;
        int start=-1,end=-1;
        while (r < arr.length) {
            sum = sum + arr[r];
            while (sum > k) {
                sum = sum - arr[l];
                l = l + 1;
            }
            if (sum == k) {
                if(r-l+1>maxLen) {
                    maxLen=r-l+1;
                    start=l;
                    end=r;
                }
            }
            r = r + 1;
        }
        for(int i=start;i<=end;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
