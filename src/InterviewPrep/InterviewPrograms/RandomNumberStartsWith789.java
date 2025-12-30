package InterviewPrep.InterviewPrograms;

import java.util.Random;

public class RandomNumberStartsWith789 {
    public static void main(String[] args) {
//        Random random = new Random();
//        StringBuilder str = new StringBuilder("789");
//        for(int i=0;i<7;i++) {
//            int digit = random.nextInt(10);
//            str.append(digit);
//        }
//        System.out.println(str);

        //Without Random Class
        long millis = System.currentTimeMillis();
        String rest = String.valueOf(millis).substring(String.valueOf(millis).length()-7);
        String phnNumber = "789"+rest;
        System.out.println(phnNumber);

    }
}
