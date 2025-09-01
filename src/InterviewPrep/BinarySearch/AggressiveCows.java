package InterviewPrep.BinarySearch;

import java.util.Arrays;

public class AggressiveCows {
    public static void main(String[] args) {
        int[] a ={0,3,4,7,10,9};
        Arrays.sort(a);
        int cows=4;
        int limit= a[a.length-1]-a[0];
        //Brute
//        for(int i=1;i<=limit;i++) {
//              if(cowsPresent(a,i,cows)) {
//                  continue;
//              }
//              else {
//                  System.out.println(i-1);
//                  break;
//              }
//        }

        //Optimal
        int low=0,high= a[a.length-1]-a[0],ans=1;
        while(low<=high) {
            int mid=(low+high)/2;
            if(cowsPresent(a,mid,cows)) {
                ans=mid;
                low=mid+1;
            }
            else {
                high=mid-1;
            }
        }
        System.out.println(ans);

    }

    public static boolean cowsPresent(int[] a, int i, int cows) {
        int countCows=1,last =a[0];
        for(int j=0;j<a.length;j++) {
            if(a[j]-last>=i) {
                countCows++;
                last=a[j];
            }
            if(countCows>=cows) return true;
        }
        return false;
    }
}
