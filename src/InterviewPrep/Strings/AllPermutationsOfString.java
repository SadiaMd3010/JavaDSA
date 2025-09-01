package InterviewPrep.Strings;

public class AllPermutationsOfString {
    public static void main(String[] args) {
        String s = "SAD";
        String left ="";
        for(int i=0;i<s.length();i++) {
            String right = s.substring(i);
            String full = right+left;
            System.out.println(full);
            left=left+s.charAt(i);
        }
    }
}
