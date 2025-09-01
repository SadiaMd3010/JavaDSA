package InterviewPrep.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListToArrayConvertion {
    public static void main(String[] args) {
        List<Integer> ls = new ArrayList<>();
        ls.add(2);
        ls.add(5);
        ls.add(7);
        Integer[] a = new Integer[ls.size()];
        ls.toArray(a);
        System.out.println(Arrays.toString(a));

    }
}
