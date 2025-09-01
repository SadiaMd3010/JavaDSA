package InterviewPrep.BasicMath;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrintAllDivisors {
    public static void main(String[] args) {
        int n=36;
//        for(int i=1;i<=n;i++) {
//            if(n%i==0) {
//                System.out.print(i +" ");
//            }
//        }
        //Another Approach
        List<Integer> list = new ArrayList<>();
        for(int i=1;i<=Math.sqrt(n);i++) {
            if (n % i == 0) {
                list.add(i);
                if ((n / i) != i) {
                    list.add(n/i);
                }
            }
        }
        Collections.sort(list);
        System.out.println(list);
    }
}
