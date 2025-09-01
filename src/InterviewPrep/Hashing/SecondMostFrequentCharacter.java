package InterviewPrep.Hashing;

public class SecondMostFrequentCharacter {
    public static void main(String[] args) {
        String s = "saaaddii";
        int maxFreq = Integer.MIN_VALUE;
        int secMaxFreq = Integer.MIN_VALUE;
        char c='0';
        char secChar = '0';
        int[] hash = new int[26];
        for(int i=0;i<s.length();i++) {
            hash[s.charAt(i)-'a']++;
        }

        for(int i=0;i<hash.length;i++) {
            if(hash[i]>maxFreq) {
                secMaxFreq = maxFreq;
                secChar = c;
                maxFreq= hash[i];
                c = (char) (i+'a');
            }
            else if (maxFreq!=hash[i] && secMaxFreq<hash[i]) {
                secMaxFreq= hash[i];
                secChar = (char) (i+'a');
            }
            else if(maxFreq==hash[i]) {
                char currentChar = (char) (i+'a');
                if(currentChar<c) {
                    c= currentChar;
                }
            }
            else if(secMaxFreq==hash[i]) {
                char currentChar = (char) (i+'a');
                if(currentChar<secChar) {
                    secChar= currentChar;
                }
            }
        }
        System.out.println(secChar);

    }
}
