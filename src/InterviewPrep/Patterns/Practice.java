package InterviewPrep.Patterns;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Practice {
    public static void main(String[] args) {
       String s="abcbbcee";
       Pair hash[]=new Pair[26];
       for(int i=0;i<hash.length;i++) {
           hash[i]= new Pair(0, (char) (i+'a'));
       }

       for(int i=0;i<s.length();i++) {
           hash[s.charAt(i)-'a'].freq++;
       }

        Arrays.sort(hash,(p1,p2) -> {
            if(p1.freq!=p2.freq) return p2.freq-p1.freq;
            return p1.ch-p2.ch;
        });
       int k=3;
       Set<Integer> set = new HashSet<>();
       int count=0;

        for(int i=0;i<hash.length;i++) {
            if(!set.contains(hash[i].freq)) {
                count++;
                set.add(hash[i].freq);
            }
            if(count==k) {
                System.out.println(hash[i].ch);
            }
        }


    }
}

class Pair {
    char ch;
    int freq;
    Pair(int freq,char ch) {
        this.ch=ch;
        this.freq=freq;
    }
}
