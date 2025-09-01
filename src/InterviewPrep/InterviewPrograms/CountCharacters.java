package InterviewPrep.InterviewPrograms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountCharacters {
    public static void main(String[] args) {
        String s= "aaabbbcccaaa";
        StringBuilder sb = new StringBuilder();
       int i=0;
       while(i<s.length()) {
           char start= s.charAt(i);
           int count=0;
           while(i<s.length() && s.charAt(i)==start) {
               count++;
               i++;
           }
           sb.append(start).append(count);
       }
        System.out.println(sb);
    }

//        //Hasing
//        Map<Character,Integer> map = new HashMap<>();
//        for(int i=0;i<s.length();i++) {
//            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
//        }
//        for(Map.Entry<Character,Integer> entry :map.entrySet() ) {
//            sb.append(entry.getKey()).append(entry.getValue());
//        }
//        System.out.println(sb);

}
