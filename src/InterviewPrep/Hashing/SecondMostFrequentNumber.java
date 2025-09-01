package InterviewPrep.Hashing;

import java.util.Arrays;

public class SecondMostFrequentNumber {
    public static void main(String[] args) {
        int[] arr={4, 4, 5, 5, 6, 7};
        int max= Arrays.stream(arr).max().orElse(0);
        int[] hash = new int[max+1];
        int maxFreq = Integer.MIN_VALUE;
        int secondMaxFreq = Integer.MIN_VALUE;
        int maxEle = -1;
        int secondEle = -1;
        for(int i=0;i<arr.length;i++) {
            hash[arr[i]]++;
        }
        for(int i=0;i<hash.length;i++) {
            if(hash[i]>maxFreq) {
                secondMaxFreq= maxFreq;
                secondEle= maxEle;
                maxFreq = hash[i];
                maxEle = i;
            }
            else if(hash[i]!=maxFreq && secondMaxFreq<hash[i]) {
                secondMaxFreq= hash[i];
                secondEle=i;
            }
            else if(hash[i]==maxFreq) {
                maxEle = Math.min(maxEle,i);
            }
            else if (hash[i]==secondMaxFreq) {
                secondEle = Math.min(secondEle,i);
            }
        }
        System.out.println(secondEle);

    }
}
