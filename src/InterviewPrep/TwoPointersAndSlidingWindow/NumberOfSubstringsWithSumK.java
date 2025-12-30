package InterviewPrep.TwoPointersAndSlidingWindow;

public class NumberOfSubstringsWithSumK {
    public static void main(String[] args) {
        int nums[]= {1, 1, 0, 1, 0, 0, 1};
        int k=3;
        int count=0;
        for(int i=0;i<nums.length;i++) {
            int sum=0;
            for(int j=i;j<nums.length;j++) {
                sum=sum+nums[j];
                if(sum==k) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
