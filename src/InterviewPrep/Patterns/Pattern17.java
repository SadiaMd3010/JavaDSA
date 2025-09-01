package InterviewPrep.Patterns;

public class Pattern17 {
    public static void main(String[] args) {
//    A
//   ABA
//  ABCBA
// ABCDCBA
//ABCDEDCBA
        int n=5;
        for(int i=0;i<n;i++) {
            for(int j=0;j<n-i-1;j++) {
                System.out.print(" ");
            }
            char c='A';
            for(int j=0;j<2*i+1;j++) {
                System.out.print(c);
                if(j<((2*i+1)/2)) {
                    c++;
                }
                else {
                    c--;
                }

            }
            System.out.println();
        }
    }
}
