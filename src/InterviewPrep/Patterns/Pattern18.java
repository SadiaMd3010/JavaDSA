package InterviewPrep.Patterns;

public class Pattern18 {
    public static void main(String[] args) {
//E
//DE
//CDE
//BCDE
//ABCDE
        for(int i=0;i<5;i++) {
            int index=5-i-1;
            char c= (char) ('A'+index);
            for(int j=0;j<=i;j++) {
                System.out.print(c);
                c++;
            }
            System.out.println();
        }

        //OR

        for(int i=0;i<5;i++) {
            for(char ch = (char) ('E'-i); ch<='E'; ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
