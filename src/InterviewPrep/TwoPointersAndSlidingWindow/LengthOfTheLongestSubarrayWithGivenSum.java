package InterviewPrep.TwoPointersAndSlidingWindow;

public class LengthOfTheLongestSubarrayWithGivenSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 1, 1, 1, 2, 2, 3};
        int k = 5;
        //brute
        int maxLen = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum = sum + arr[j];
                if (sum == k) {
                    maxLen= Math.max(maxLen,j-i+1);
                    }
                }
            }
        System.out.println(maxLen);
        }

        }


        //Better
//        int l=0,r=0,maxLen=0,sum=0;
//        while(r<arr.length) {
//            sum=sum+arr[r];
//            while(sum>k) {
//                sum=sum-arr[l];
//                l=l+1;
//            }
//            if(sum==k) {
//                maxLen=Math.max(maxLen,r-l+1);
//            }
//            r=r+1;
//        }
//        System.out.println(maxLen);
//    }


