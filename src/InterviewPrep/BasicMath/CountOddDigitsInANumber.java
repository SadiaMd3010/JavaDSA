package InterviewPrep.BasicMath;

public class CountOddDigitsInANumber {
    public static void main(String[] args) {
        int n=15;
        int count=0;
        while(n>0) {
            int r = n%10;
            if(r%2!=0) {
                count++;
            }
            n=n/10;
        }
        System.out.println(count);
    }
}
