package InterviewPrep.Strings;

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        int smap[] = new int[26];
        int tmap[]= new int[26];

        for(int i=0;i<s.length();i++) {
            smap[s.charAt(i)-'a']++;
            tmap[t.charAt(i)-'a']++;
        }

        for(int i=0;i<smap.length;i++) {
            if(smap[i]!=tmap[i]) {
                System.out.println("Not Anagram");
            }
        }
        System.out.println("Anagram");


    }
}
