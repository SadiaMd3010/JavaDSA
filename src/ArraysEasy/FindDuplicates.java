package ArraysEasy;

import java.util.ArrayList;
import java.util.Arrays;

public class FindDuplicates {
    public static void main(String[] args) {
        int a[] = {1, 1, 1, 1, 2, 3, 5, 5, 2}; // 1 1 1 2 2 3 5 5
        int i=0;
        int visible[]= new int[a.length];
        for(int j=1;j<a.length;j++) {
            if(a[i]==a[j] && visible[j]==0) {
                System.out.println(a[j]);
                visible[j]=1;
            }
            i++;
        }

    }
}
