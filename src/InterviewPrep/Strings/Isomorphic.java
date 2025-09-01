package InterviewPrep.Strings;

public class Isomorphic {
    public static void main(String[] args) {
        String s= "egg";
        String t="add";
        int[] smap= new int[26];
        int[] tmap = new int[26];

        for(int i=0;i<s.length();i++) {
            if(smap[s.charAt(i)-'a']!=tmap[t.charAt(i)-'a']) {
                System.out.println("Not Isomorphic");
            }
            smap[s.charAt(i)-'a']=i+1;
            tmap[t.charAt(i)-'a']=i+1;
        }
        System.out.println("Isomorphic String");

    }
}
