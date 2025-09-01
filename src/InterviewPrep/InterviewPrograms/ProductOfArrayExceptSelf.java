package InterviewPrep.InterviewPrograms;


import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int nums[]={1,2,3,4};
        int result[]= new int[nums.length];
//       for(int i=0;i<nums.length;i++) {
//           int right = 1;
//           int left=1;
//           for (int j = i+1; j < nums.length; j++) {
//               right = right * nums[j];
//           }
//           for(int j=0;j<i;j++) {
//               left=left*nums[j];
//           }
//           result[i]=right*left;
//       }
//        System.out.println(Arrays.toString(result));

        //Better

//        for(int i=0;i<nums.length;i++) {
//            int prod=1;
//            for(int j=0;j<nums.length;j++) {
//                if(i!=j) {
//                    prod*=nums[j];
//                }
//            }
//            result[i]=prod;
//        }
//        System.out.println(Arrays.toString(result));

        //Optimal
        int prefix=1;
        for(int i=0;i<nums.length;i++) {
            result[i]=prefix;
            prefix=prefix*nums[i];
        }
        int suffix=1;
        for(int i=nums.length-1;i>=0;i--) {
            result[i]*=suffix;
            suffix=suffix*nums[i];
        }
        System.out.println(Arrays.toString(result));
    }
}
