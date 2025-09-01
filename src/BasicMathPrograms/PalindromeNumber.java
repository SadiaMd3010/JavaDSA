package BasicMathPrograms;

public class PalindromeNumber {
    public static void main(String[] args) {
        int n=123215;
        int original = n;
        int rev=0;
        while(n>0) {
            int temp=n%10;
            rev=rev*10+temp;
            n=n/10;
        }
        if(original==rev) {
            System.out.println("palin");
        }
        else {
            System.out.println("not palin");
        }
    }
}
