package InterviewPrep.Strings;

import java.util.Arrays;
import java.util.Map;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] str = {"flowers", "flow", "fly", "flight"};
        Arrays.sort(str);
        String start = str[0];
        String end = str[str.length-1];
        StringBuilder sb = new StringBuilder();
        for(int i=0;i< Math.min(start.length(),end.length());i++) {
            if(start.charAt(i)!=end.charAt(i)) {
                break;
            }
            else {
                sb.append(start.charAt(i));
            }
        }
        System.out.println(sb.toString());




    }
}

