package BasicMathPrograms;

public class ExtractDigits {
    public static void main(String[] args) {
        int n=7789;
        while(n>0) {
            int temp = n%10;
            System.out.println(temp);
            n=n/10;
        }
    }
}
