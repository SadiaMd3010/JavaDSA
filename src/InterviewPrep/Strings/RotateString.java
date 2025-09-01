package InterviewPrep.Strings;

public class RotateString {
    public static void main(String[] args) {
        String s = "abcde";
        String goal = "cdeab";

        //Brute
        String left ="";
        for(int i=0;i<s.length();i++) {
            String right = s.substring(i);
            String s1 = right+left;
            if(s1.equals(goal)) {
                System.out.println("Strings are equal");
            }
            left=left+s.charAt(i);

        }

        //Optimal
        String d = s+s;
        if(d.contains(goal)) {
            System.out.println("Strings are equal");
        }
    }
}
