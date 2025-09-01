package InterviewPrep.InterviewPrograms;

public class FirstUniqueCharacterInString {
    public static void main(String[] args) {
        String s= "loveleetcode";
        for(int i=0;i<s.length();i++) {
            int count=0;
            for(int j=i+1;j<s.length();j++) {
                if(s.charAt(i)==s.charAt(j)) {
                    count++;
                }
            }
            if(count==0) {
                System.out.println(i);
                break;
            }
        }

        //Better
        int[] freq = new int[26];
        char[] ch = s.toCharArray();
        for(char c : ch ) {
            freq[c-'a']++;
        }
        for(int i=0;i<ch.length;i++) {
            if(freq[ch[i]-'a']==1) {
                System.out.println(i);
                return;
            }
        }



    }
}
