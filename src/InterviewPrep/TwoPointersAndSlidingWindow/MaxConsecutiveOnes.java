package InterviewPrep.TwoPointersAndSlidingWindow;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] nums={1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
        int k=3;
//        int maxLen=0;
//        for(int i=0;i<nums.length;i++) {
//            int count=0;
//            for(int j=i;j<nums.length;j++) {
//                if(nums[j]==0) {
//                    count++;
//                }
//                if(count>k) {
//                    break;
//                }
//                maxLen=Math.max(j-i+1,maxLen);
//            }
//        }
//        System.out.println(maxLen);

        //Better
        int l=0,r=0,maxLen=0;
        int count=0;
        while(r<nums.length) {
            if(nums[r]==0) {
                count++;
            }

            while(count>k) {
                if(nums[l]==0) {
                    count--;
                }
                l++;
            }
            if(count<=k) {
                maxLen = Math.max(maxLen, r - l + 1);
            }
            r++;
        }
        System.out.println(maxLen);
    }
}
