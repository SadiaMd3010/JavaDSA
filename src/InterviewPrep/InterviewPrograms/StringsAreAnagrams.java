package InterviewPrep.InterviewPrograms;

import java.util.Arrays;

public class StringsAreAnagrams {
    public static void main(String[] args) {
        //Anagram means 2 strings have same characters but need not be in order
        String s1= "sadia";
        String s2= "aaidsa";
        if(s1.length()!=s2.length()) {
            System.out.println("False");
        }
        char[] ch1 = s1.toCharArray();
        Arrays.sort(ch1);
        char[] ch2= s2.toCharArray();
        Arrays.sort(ch2);

        for(int i=0;i<s2.length();i++) {
            if(ch1[i]!=ch2[i]) {
                System.out.println("False");
            }
            else {
                System.out.println("True");
            }
        }




    }
}
