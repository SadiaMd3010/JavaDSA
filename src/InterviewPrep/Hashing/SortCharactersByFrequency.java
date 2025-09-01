package InterviewPrep.Hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortCharactersByFrequency {
    public static void main(String[] args) {
        String s ="tree";

        Pairr hash[] = new Pairr[26];
        for(int i=0;i<hash.length;i++) {
            hash[i]= new Pairr(0, (char) (i+'a'));
        }

        for(int i=0;i<s.length();i++) {
            hash[s.charAt(i)-'a'].freq++;
        }

        Arrays.sort(hash,(p1,p2)-> {
            if(p1.freq!=p2.freq) return p2.freq-p1.freq;
            return p1.c-p2.c;
        });

        List<Character> list = new ArrayList<>();
        for(int i=0;i<hash.length;i++) {
            if(hash[i].freq>0) {
                list.add(hash[i].c);
            }
        }

        System.out.println(list);

    }
}


class Pairr {
    int freq;
    char c;
    Pairr(int freq,char c) {
        this.freq=freq;
        this.c=c;
    }
}
