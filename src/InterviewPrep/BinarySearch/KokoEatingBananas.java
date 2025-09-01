package InterviewPrep.BinarySearch;

import java.util.Arrays;

public class KokoEatingBananas {
    public static void main(String[] args) {
        int[] a={30,11,23,4,20};
        int h=5;
        int max = Arrays.stream(a).max().orElse(0);
        //Brute
//        for(int i=1;i<=max;i++) {
//            if(totalTimeTaken(a,i)<=h) {
//                System.out.println(i);
//                return;
//            }
//        }

        //Optimal
        int low=1,high=max;
        while(low<=high) {
            int mid=(low+high)/2;
            if(totalTimeTaken(a,mid)<=h) {
                System.out.println(mid);
                high=mid-1;
            }
            else {
                low=mid+1;
            }
        }
    }

    public static int totalTimeTaken(int[] a, int i) {
        int totalTime=0;
        for (int k : a) {
            totalTime += (int) Math.ceil((double) k / i);
        }
        return totalTime;
    }
}
