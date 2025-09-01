package BasicMathPrograms;

import java.util.ArrayList;
import java.util.Collections;

public class PrintAllDivisors {
    public static void main(String[] args) {
//        int n=36;
//        for(int i=1;i<=n;i++) {
//            if((n%i)==0) {
//                System.out.print(i + " ");
//            }
//        }

        int n=36;
        ArrayList<Integer> al= new ArrayList<>();
        for(int i=1;i<=Math.sqrt(n);i++) {
            if(n%i==0) {
                al.add(i);
                if(n/i!=i) {
                    al.add(n/i);
                }
            }
        }
        Collections.sort(al);
        System.out.print(al + " ");

    }
}
