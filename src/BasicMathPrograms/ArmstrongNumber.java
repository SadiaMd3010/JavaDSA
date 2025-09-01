package BasicMathPrograms;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int n=1634;
        int digits=Integer.toString(n).length();
        int sum=0;
        while(n>0) {
            int r=n%10;
            sum= sum+ (int) Math.pow(r,digits);
            n=n/10;
        }
        System.out.println(sum);
    }
}
