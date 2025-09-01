package InterviewPrep.Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MaximumSubArraySum {
    public static void main(String[] args) {
        int a[]= {-2,-3,4,-1,-2,1,5,-3};
        //Brute
        int ansstart=-1;
        int ansend=-1;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++) {
            int sum=0;
            for(int j=i;j<a.length;j++) {
                sum=sum+a[j];
                if(sum>max) {
                    max = sum;
                    ansstart = i;
                    ansend = j;
                }
            }
        }
        System.out.println(max);
        for (int i=ansstart;i<=ansend;i++) {
            System.out.print(a[i] + " ");
        }


        //Optimal - Kadane's Algo
//        int a[]= {-2,-3,-4,-1};
        int currentSum =0;
        int start =0;
        int ansStart = -1;
        int ansEnd = -1;
        int maxSum= Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++)
        {
            if(currentSum==0) start=i;
            currentSum=currentSum+a[i];
            maxSum=Math.max(maxSum,currentSum);
            ansStart =start;
            ansEnd=i;

            if(currentSum<0) {
                currentSum=0;
            }
            if(maxSum <0) maxSum=0;
        }
        System.out.println(maxSum);
        for(int i=ansStart;i<ansEnd;i++) {
            System.out.print(a[i] +" ");
        }

    }
}
