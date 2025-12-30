package InterviewPrep.TwoPointersAndSlidingWindow;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Practice {
    public static void main(String[] args) {
       int[] nums= {-8,2,3,-6,10};
       int k=2;
       int l=0,r=k-1;
       List<Integer> list = new ArrayList<>();
       boolean found=false;
       for(int i=l;i<=r;i++) {
           if(nums[i]<0) {
               list.add(nums[i]);
               found = true;
               break;
           }
       }
       if(!found) list.add(0);

       while(r<nums.length-1) {
           if(nums[l]==list.get(0)) {
               list.remove(nums[l]);
           }
           l++;
           r++;
           if(nums[r]<0) {
               list.add(nums[r]);
           }
       }
        System.out.println(list);
    }
}
