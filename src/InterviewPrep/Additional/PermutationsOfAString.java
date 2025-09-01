package InterviewPrep.Additional;

import java.util.ArrayList;
import java.util.List;

public class PermutationsOfAString {
    public static void main(String[] args) {
        String str= "abc";
        List<String> ans =new ArrayList<>();
        List<Character> ds = new ArrayList<>();
        boolean[] freq = new boolean[str.length()];
        recur(str,ds,ans,freq);
        System.out.println(ans);

    }

    public static void recur(String str, List<Character> ds, List<String> ans, boolean[] freq) {
        if(str.length()==ds.size()) {
            ans.add(ds+"");
            return ;
        }

        for(int i=0;i<str.length();i++) {
            if(!freq[i]) {
                ds.add(str.charAt(i));
                freq[i]=true;
                recur(str,ds,ans,freq);
                ds.remove(ds.size()-1);
                freq[i]=false;
            }
        }
    }


}
