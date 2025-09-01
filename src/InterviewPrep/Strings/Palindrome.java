package InterviewPrep.Strings;

public class Palindrome {
    public static void main(String[] args) {
        String s ="hannah";
        int start=0;
        int end = s.length()-1;
        for(int i=0;i<s.length();i++) {
            if(s.charAt(start)!=s.charAt(end)) {
                System.out.println("Not palin");
            }
            start++;
            end--;
        }
        System.out.println("palin");
    }
}
