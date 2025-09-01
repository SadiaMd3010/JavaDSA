package InterviewPrep.InterviewPrograms;

public class ReverseVowels {
    public static void main(String[] args) {
        String str= "triangle";
        String vowels = "aeiou";
        char[] ch = str.toCharArray();
        int start=0;
        int end = str.length()-1;

        while(start<end) {
            while (start<end && vowels.indexOf(ch[start])==-1) {
                start++;
            }
            while(start<end && vowels.indexOf(ch[end])==-1) {
                end--;
            }

            char temp= ch[start];
            ch[start] = ch[end];
            ch[end]=temp;
            start++;
            end--;
        }

    }
}
