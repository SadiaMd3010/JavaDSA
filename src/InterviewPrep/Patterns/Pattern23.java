package InterviewPrep.Patterns;

public class Pattern23 {
    public static void main(String[] args) {
//AEEEEE
//BDDDD
//CCCC
//DBB
//EA
        int n=5;
        for(int i=0;i<n;i++) {
            char ch = (char) ('E'-i);
            char c = (char) ('A'+i);
            System.out.print(c);
            for(int j=0;j<n-i;j++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }

}
