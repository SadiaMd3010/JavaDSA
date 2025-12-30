package InterviewPrep.TwoPointersAndSlidingWindow;

public class NumberOfSubarrayWithKOddNumbers {
    public static void main(String[] args) {
        int[] nums={1,1,2,1,1};
        int k=3;
        int countt=0;
        for(int i=0;i<nums.length;i++) {
            int count=0;
            for(int j=i;j<nums.length;j++) {
                if(nums[j]%2!=0) {
                    count++;
                }
                if(count==k) {
                    countt++;
                }
            }
        }
        System.out.println(countt);
    }
}
