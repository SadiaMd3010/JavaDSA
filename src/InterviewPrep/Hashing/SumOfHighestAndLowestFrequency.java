package InterviewPrep.Hashing;

import java.util.Arrays;

public class SumOfHighestAndLowestFrequency {
    public static void main(String[] args) {
        int[] arr = {10, 9, 7, 7, 8, 8, 8};
        int max = Arrays.stream(arr).max().orElse(0);
        int[] hash = new int[max+1];
        int maxFreq= Integer.MIN_VALUE;
        int minFreq = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++) {
            hash[arr[i]]++;
        }
        for(int i=0;i<hash.length;i++) {
            if(hash[i]>0) {
                maxFreq = Math.max(maxFreq, hash[i]);
                minFreq = Math.min(minFreq, hash[i]);
            }
        }
        System.out.println(maxFreq+minFreq);
    }
}
