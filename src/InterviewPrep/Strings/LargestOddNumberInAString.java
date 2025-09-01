package InterviewPrep.Strings;

public class LargestOddNumberInAString {
    public static void main(String[] args) {
//        String s = "5347";

        //Brute
//        int val=0;
//        int max = Integer.MIN_VALUE;
//        for(int i=0;i<s.length();i++) {
//            int r = Character.getNumericValue(s.charAt(i));
//            val = val * 10 + r;
//            if (val % 2 != 0) {
//                if (val > max) {
//                    max = val;
//                }
//            }
//        }
//        System.out.println(max);

        //Optimal
        String s ="005347";
        int j=-1;
        for(int i=s.length()-1;i>=0;i--) {
            if(Character.getNumericValue(s.charAt(i))%2!=0) {
                j=i;
                break;
            }
        }

        int i=0;
        while(i<s.length() && s.charAt(i)=='0') {
            i++;
        }

        System.out.println(s.substring(i,j+1));

    }
}
