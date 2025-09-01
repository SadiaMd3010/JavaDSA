package InterviewPrep.InterviewPrograms;


public class ReverseStringWithSameWordLength {
        public static void main(String[] args) {
            String input = "This is a string";
            char[] ch= input.toCharArray();
            char[] result = new char[ch.length];
            for(int i=0;i<ch.length;i++) {
                if(ch[i]==' ') {
                    result[i]=' ';
                }
            }
            int j=ch.length-1;
            for(int i=0;i<ch.length;i++) {
                if(ch[i]!=' ') {
                    while(result[j]==' ') {
                        j--;
                    }
                    result[j]=ch[i];
                    j--;
                }
            }
            System.out.println(result);
        }
    }


