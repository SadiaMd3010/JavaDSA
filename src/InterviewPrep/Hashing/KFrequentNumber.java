package InterviewPrep.Hashing;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class KFrequentNumber {
    public static void main(String[] args) {
        String s ="tttreeess";
        int k=3;
        int[] hash = new int[26];
        for(int i=0;i<s.length();i++) {
            hash[s.charAt(i)-'a']++;
        }

        List<int[]> list = new ArrayList<>();
        for(int i=0;i<hash.length;i++) {
            if(hash[i]>0) {
                list.add(new int[]{i,hash[i]});
            }
        }

        Collections.sort(list,(a,b) -> b[1]-a[1]);
        int last= list.get(0)[1];
        int rank=1;
        for(int i=1;i<list.size();i++) {
            int current= list.get(i)[1];
            if(current!=last) {
                rank++;
                last=current;
            }
            if(rank==k) {
                System.out.println((char)(list.get(i)[0]+'a'));
            }
        }
    }
}