package InterviewPrep.InterviewPrograms;

public class PrintAllNumbersInString {
    public static void main(String[] args) {
        String name = "My name is 12 Sadia";
        for(int i=0;i<name.length();i++) {
            char ch = name.charAt(i);
            if(Character.isDigit(ch)) {
                System.out.print(ch);
            }
        }
    }

}