package InterviewPrep.Arrays;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int a[]={1,2,4,5};
        int n=5;
        //brute
//        int n=5;
//        for(int i=1;i<=n;i++) {
//            boolean flag = true;
//          for(int j=0;j<a.length;j++) {
//              if(a[j]==i) {
//                  flag=false;
//                  break;
//              }
//          }
//          if(flag) {
//              System.out.println(i);
//          }
//        }

        //BETTER
//      int max = Arrays.stream(a).max().orElse(0);
//      int hash[] = new int[max+1];
//      for(int i=0;i<a.length;i++) {
//          hash[a[i]]++;
//      }
//
//      for(int i=1;i<hash.length;i++) {
//          if(hash[i]==0) {
//              System.out.println(i);
//          }
//      }
        //Optimal
        int N=5;
        int sum=0;
        int actualSum = N*(N+1)/2;
        for(int i=0;i<a.length;i++) {
            sum=sum+a[i];
        }
        int missingNum = actualSum-sum;
        System.out.println(missingNum);

    }
}
