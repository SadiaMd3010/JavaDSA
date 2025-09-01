package InterviewPrep.BasicMath;

public class PalindromeNumber {
    public static void main(String[] args) {
        int n=121;
        int original = n;
        int rev =0;
        while(n>0) {
            int ld = n%10;
            n=n/10;
            rev=rev*10+ld;
        }
        if(rev==original) {
            System.out.println("palin");
        }
    }
}
