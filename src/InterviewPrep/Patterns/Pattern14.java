package InterviewPrep.Patterns;

public class Pattern14 {
    public static void main(String[] args) {
//A
//AB
//ABC
//ABCD
        for(int i=0;i<4;i++) {
            for(char ch='A';ch<='A'+i;ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
