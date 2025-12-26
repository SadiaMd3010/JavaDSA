package InterviewPrep.InterviewPrograms;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Practice {
    public static void main(String[] args) {
        int[] val = {3,3,4,5,2,5,1,3};
        int max = Arrays.stream(val).max().orElse(0);
        int hash[]= new int[max+1];
        for(int i=0;i<val.length;i++) {
            hash[val[i]]++;
        }

        List<int[]> list = new ArrayList<>();
        for(int i=0;i<hash.length;i++) {
            if(hash[i]>0) {
                list.add(new int[]{i, hash[i]});
            }
        }
        Collections.sort(list,(a,b)-> b[1]-a[1]);

        for(int[] ans : list) {
            for (int j = 0; j < ans[1]; j++) {
                System.out.print(ans[0]);
            }
        }


    }

}
