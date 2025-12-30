package InterviewPrep.Hashing;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortForStringValues {
    public static void main(String[] args) {
        List<Value> list = Arrays.asList(
                new Value("sadia",6),
                new Value("sara",10)
        );

        Collections.sort(list,(a,b)-> b.id-a.id);
        for(Value v : list) {
            System.out.println(v.name);
        }


    }
}




class Value {
    String name;
    int id;
    Value(String name,int id) {
        this.name=name;
        this.id=id;
    }
}