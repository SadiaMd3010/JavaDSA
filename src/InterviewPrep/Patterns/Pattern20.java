package InterviewPrep.Patterns;

public class Pattern20 {
    public static void main(String[] args) {
//*        *
//**      **
//***    ***
//****  ****
//**********
//****  ****
//***    ***
//**      **
//*        *
        int n=5;
        int stars=1;
        int spaces=1;
        for(int i=0;i<2*n;i++) {
            if(i>=n) {
                stars=2*n-i-2;
            }
            else stars=i;
            for(int j=0;j<=stars;j++) {
                System.out.print("*");
            }
            if(i>=n) {
                spaces=2*(i-n)+2;
            }
            else spaces=2*(n-i)-2;
            for(int j=0;j<spaces;j++) {
                System.out.print(" ");
            }
            for(int j=0;j<=stars;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
