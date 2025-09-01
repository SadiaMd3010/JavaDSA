package InterviewPrep.Strings;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
//        String s ="sadia";
//        int start=0;
//        int end = s.length()-1;
//        char[] ch = s.toCharArray();
//        while(start<end) {
//            char temp= ch[start];
//            ch[start] = ch[end];
//            ch[end]= temp;
//            start++;
//            end --;
//        }
//
//        String s1 = new String(ch);
//        System.out.println(s1);

        //With space
//        String s = "Java is oops concept";
//        int start=0;
//        int end = s.length()-1;
//        char[] ch = s.toCharArray();
//        while(start<end) {
//            char temp= ch[start];
//            ch[start] = ch[end];
//            ch[end]= temp;
//            start++;
//            end --;
//        }
//
//        String s1 = new String(ch);
//        System.out.println(s1);

        //Reverse only words
        String s = "Java is oops concept";
        String split[] = s.split(" ");
        int start = 0;
        int end = split.length-1;
        while(start<end) {
            String temp= split[start];
            split[start]= split[end];
            split[end]=temp;
            start++;
            end--;
        }

        String ss= Arrays.toString(split);
        System.out.println(ss);

        String s1 = String.join(" ",split);
        System.out.println(s1);

        StringBuilder spl= new StringBuilder();
        for(int i=0;i<split.length;i++) {
            spl.append(split[i]);
            spl.append(" ");
        }
        System.out.println(spl.toString());









    }
}
