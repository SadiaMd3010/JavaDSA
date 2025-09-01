package InterviewPrep.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayToArrayListConvertion {
    public static void main(String[] args) {
        Integer[] a={1,2,3,4};
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(a));
        System.out.println(list);

        //
        Collections.addAll(list,a);
        System.out.println(list);

        //
        list.addAll(Arrays.asList(a));
        System.out.println(list);

        //
        List<Integer> lis= Arrays.stream(a).collect(Collectors.toList());
        System.out.println(lis);

    }
}
