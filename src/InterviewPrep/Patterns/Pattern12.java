package InterviewPrep.Patterns;

public class Pattern12 {
    public static void main(String[] args) {
//1      1
//12    21
//123  321
//12344321
        int n=4;
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print(j);
            }
            for(int j=1;j<=2*n-2*i;j++) {
                System.out.print(" ");
            }
            for(int j=i;j>0;j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
