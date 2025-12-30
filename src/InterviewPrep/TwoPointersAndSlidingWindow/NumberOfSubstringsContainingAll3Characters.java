package InterviewPrep.TwoPointersAndSlidingWindow;

public class NumberOfSubstringsContainingAll3Characters {
    public static void main(String[] args) {
       String s = "abcba";
       int count=0;
       for(int i=0;i<s.length();i++) {
           int hash[]= new int[3];
           for(int j=i;j<s.length();j++) {
               hash[s.charAt(j) - 'a']++;
               if(hash[0]>0 && hash[1]>0 && hash[2]>0) {
                   count++;
               }
           }
       }
        System.out.println(count);
    }
}
