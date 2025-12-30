package InterviewPrep.TwoPointersAndSlidingWindow;

import java.util.HashSet;
import java.util.Set;

public class MaximunGoodSubarrayLength {
    public static void main(String[] args) {
        int nums[]={2, 7, 3, 4, 5, 3};
        int[] badNums= {7,5};
        int maxLen=0;
        for(int i=0;i<nums.length;i++) {
            Set<Integer> set = new HashSet<>();
            for(int j=0;j<badNums.length;j++) {
                set.add(badNums[j]);
            }
            Set<Integer> ans = new HashSet<>();
            for(int j=i;j<nums.length;j++) {
                if(set.contains(nums[j])) {
                    ans.add(nums[j]);
                }
                if(ans.size()==set.size()) {
                    break;
                }
                maxLen= Math.max(maxLen,j-i+1);
            }
        }
        System.out.println(maxLen);
    }
}
