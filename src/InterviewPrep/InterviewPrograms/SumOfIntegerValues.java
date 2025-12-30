package InterviewPrep.InterviewPrograms;

public class SumOfIntegerValues {
    public static void main(String[] args) {
        String str = "1abcc2e30fg67gfh-20";

        //Sum individual values
//        int sum=0;
//        for(int i=0;i<str.length();i++) {
//            if(Character.isDigit(str.charAt(i))) {
//                int val =Character.getNumericValue(str.charAt(i));
//                sum=sum+val;
//            }
//        }
//        System.out.println(sum);

        //Sum whole numbers
        int sum=0;
        String[] s = str.split("[^0-9]");
        for(String ans : s) {
            if(!ans.isEmpty()) {
                sum = sum + Integer.parseInt(ans);
            }
        }
        System.out.println(sum);
    }
}
