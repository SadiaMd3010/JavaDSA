package InterviewPrep.Arrays;

import java.util.Arrays;

public class MissingAndRepeating {
    public static void main(String[] args) {
        int arr[] = {4,3,6,2,1,1};
        int n=6;
        int repeating =-1;
        int missing =-1;
//        for(int i=1;i<=n;i++) {
//            int count=0;
//            for(int j=0;j< arr.length;j++) {
//                if(arr[j]==i) {
//                    count++;
//                }
//            }
//            if(count==0) {
//                missing=i;
//            }
//            else if(count==2) {
//                repeating=i;
//            }
//        }
//        System.out.println("Repeating Number is "+repeating);
//        System.out.println("Missing Number is "+missing);

        //Better
//        int max = n;
//        int[] hash= new int[max+1];
//        for(int i=0;i< arr.length;i++) {
//            hash[arr[i]]++;
//        }
//        for (int i=0;i<hash.length;i++) {
//            if(hash[i]==0) {
//                missing=i;
//            }
//            if(hash[i]==2) {
//                repeating=i;
//            }
//        }
//        System.out.println("Repeating Number is "+repeating);
//        System.out.println("Missing Number is "+missing);

        //Optimal
        int sum= (n*(n+1))/2;
        int sum2= (n * (n+1) * (2*n+1)) /6;
        int s=0,s2=0;
        for(int i=0;i< arr.length;i++) {
            s+=arr[i];
            s2+=arr[i]*arr[i];
        }
        int val1= s-sum;
        int val2= s2-sum2;
        val2= val2/val1;
        int x = (val1+val2)/2;
        int y = x - val1;
        System.out.println("Repeating Number is "+x);
        System.out.println("Missing Number is "+y);
    }
}
