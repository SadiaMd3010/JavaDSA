package Hashing;

public class CountCharactersInStringUsighHashArray {
    public static void main(String[] args) {
        //lower case
        String s= "aaaabhkja";
        int hash[]= new int[26];
        for(int i=0;i<s.length();i++) {
            hash[s.charAt(i)-'a']++;
        }

        for(int i=0;i<hash.length;i++) {
            if(hash[i]>0) {
                char character = (char) (i + 'a');
                System.out.println(character + " occurs "+hash[i]);
            }
        }

        //upper case
        String str= "KDJJwueijj";
        int hashh[]=new int[256];
        for(int i=0;i<str.length();i++) {
            hashh[str.charAt(i)]++;
        }

        for(int i=0;i<hashh.length;i++) {
            if(hashh[i]>0) {
                char chara = (char) (i);
                System.out.println(chara +" occures "+hashh[i]);
            }
        }
    }
}
