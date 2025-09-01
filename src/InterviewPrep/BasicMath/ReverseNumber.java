package InterviewPrep.BasicMath;

public class ReverseNumber {
    public static void main(String[] args) {
        int N=1200;
        int r=0;
        while(N>0) {
            int ld= N%10;
            N=N/10;
            r = r*10+ld;
        }
        System.out.println(r);
    }
}
