package InterviewPrep.InterviewPrograms;


public class CountVowels {
    public static void main(String[] args) {
        String input="sadia";
        boolean[] visible = new boolean[input.length()];
        int count=0;
        String vowels = "aeiou";
        for(int i=0;i<input.length();i++) {
            int index= vowels.indexOf(input.charAt(i));
            if(index!=-1 && !visible[index]) {
                count++;
                visible[index]=true;
            }
        }
        System.out.println(count);

    }

}
