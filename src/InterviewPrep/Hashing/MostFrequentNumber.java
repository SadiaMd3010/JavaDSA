package InterviewPrep.Hashing;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MostFrequentNumber {
    public static void main(String[] args) {
        int[] arr = {4, 4, 5, 5, 6};
        /*
        If element occurs same no of times, return the lowest element i.e, 4
         */
        int max = Arrays.stream(arr).max().orElse(0);
        int[] hash = new int[max+1];
        int maxFreq = Integer.MIN_VALUE;
        int maxEle = -1;
        for(int i=0;i<arr.length;i++) {
            hash[arr[i]]++;
        }

        for(int i=0;i<hash.length;i++) {
            if(hash[i]>maxFreq) {
                maxFreq = hash[i];
                maxEle= i;
            }
            else if(hash[i]==maxFreq) {
                maxEle= Math.min(maxEle,i);
            }
        }
        System.out.println(maxEle);
    }
}
