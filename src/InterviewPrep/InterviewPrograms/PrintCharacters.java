package InterviewPrep.InterviewPrograms;


public class PrintCharacters {
    public static void main(String[] args) {
        //Input is 2a3b4c Output is aabbbcccc
        String input="2a3b4c";
        StringBuilder s = new StringBuilder();
        int left =0;
        while(left< input.length()) {
            char c= input.charAt(left);
            int as = Character.getNumericValue(c);
            int right = left+1;
            char ch = input.charAt(right);
            for(int i=0;i<as;i++) {
                s.append(ch);
            }
            left=left+2;
        }

        System.out.println(s);
    }
}
