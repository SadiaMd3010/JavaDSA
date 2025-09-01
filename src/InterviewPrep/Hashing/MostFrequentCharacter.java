package InterviewPrep.Hashing;

public class MostFrequentCharacter {
    public static void main(String[] args) {
        String s = "saaadiii";
        int hash[] = new int[26];
        char c ='0';
        int maxFreq = Integer.MIN_VALUE;
        for(int i=0;i<s.length();i++) {
            hash[s.charAt(i)-'a']++;
        }

        for(int i=0;i<hash.length;i++) {
            if(hash[i]>maxFreq) {
                maxFreq=hash[i];
                c = (char) (i+'a');
            }
            else if(hash[i]==maxFreq) {
                char currentChar = (char) (i+'a');
                if(currentChar<c) {
                    c=currentChar;
                }
            }
        }
        System.out.println(c);
    }
}
