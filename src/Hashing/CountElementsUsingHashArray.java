package Hashing;

import java.util.Arrays;

public class CountElementsUsingHashArray {
    public static void main(String[] args) {
        int a[] = {1,1,1,9,6,9,9,4,9,7};
        int maxValue = Arrays.stream(a).max().orElse(0);
        int hash[]= new int[maxValue+1];

        for(int i=0;i<a.length;i++) {
            hash[a[i]]++;
        }

        for(int i=0;i<hash.length;i++) {
//            if(hash[i]>0) {
                System.out.println(i + " occurs "+hash[i]);
//            }
        }
    }
}
