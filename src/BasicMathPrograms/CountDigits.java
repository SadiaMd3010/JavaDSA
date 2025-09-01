package BasicMathPrograms;

public class CountDigits {
    public static void main(String[] args) {
        int n=99679;
        int count=0;
        while(n>0) {
            int temp=n%10;
            count++;
            n=n/10;
        }
        System.out.println(count);
    }
}
