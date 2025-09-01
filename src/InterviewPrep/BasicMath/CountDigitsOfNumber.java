package InterviewPrep.BasicMath;

public class CountDigitsOfNumber {
    public static void main(String[] args) {
        int N=7789;
        int count=0;
        while(N>0) {
//            int ld=N%10;

            N=N/10;
            count++;

        }
        System.out.println(count);
    }
}
