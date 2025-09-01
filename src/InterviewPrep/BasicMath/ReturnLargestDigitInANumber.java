package InterviewPrep.BasicMath;

public class ReturnLargestDigitInANumber {
    public static void main(String[] args) {
        int n=25;
        int l=0;
        if(n==0) System.out.println(n);
        while(n>0) {
            int r = n%10;
            if(r>l) {
                l=r;
            }
            n=n/10;
        }
        System.out.println(l);

    }
}
