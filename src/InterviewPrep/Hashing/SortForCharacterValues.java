package InterviewPrep.Hashing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortForCharacterValues {
    public static void main(String[] args) {
        String name = "ssasdai";
        int hash[]= new int[26];
        for(int i=0;i<name.length();i++) {
            hash[name.charAt(i)-'a']++;
        }

        List<int[]> list = new ArrayList<>();
        for(int i=0;i<hash.length;i++) {
            if(hash[i]>0) {
                list.add(new int[]{i,hash[i]});
            }
        }
        Collections.sort(list,(a,b)->b[1]-a[1]);
        for(int[] ans : list) {
            System.out.println((char)(ans[0]+'a'));
        }
    }
}
