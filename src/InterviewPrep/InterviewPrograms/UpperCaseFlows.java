package InterviewPrep.InterviewPrograms;

public class UpperCaseFlows {
    public static void main(String[] args) {
        //First and last of sentence
        String s= "my name is sadia";
        String modified = s.substring(0,1).toUpperCase() + s.substring(1,s.length()-1) +
                s.substring(s.length()-1).toUpperCase();
        System.out.println(modified);

       // First and last of every word
        String st= "my name is sadia";
        String[] split = st.split(" ");
        for(String spl : split) {
            String modifiedd = spl.substring(0,1).toUpperCase()+ spl.substring(1,spl.length()-1)
                    + spl.substring(spl.length()-1).toUpperCase();
            System.out.print(modifiedd + " ");
        }

    }


}
