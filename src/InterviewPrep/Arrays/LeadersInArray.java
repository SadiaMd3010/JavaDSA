package InterviewPrep.Arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LeadersInArray {
    public static void main(String[] args) {
        int a[]= {10,22,12,3,0,6};
        List<Integer> list = new ArrayList<>();
//        for(int i=0;i<a.length;i++) {
//            int num=a[i];
//            boolean flag = false;
//            for(int j=i+1;j<a.length;j++) {
//                if(a[j]>num) {
//                    flag=true;
//                    break;
//                }
//            }
//            if(!flag) {
//                list.add(num);
//            }
//        }
//        System.out.println(list);

        //Optimal
        int maxi= Integer.MIN_VALUE;
        for(int i=a.length-1;i>0;i--) {
            if(a[i]>maxi) {
                list.add(a[i]);
            }
            maxi=Math.max(a[i],maxi);
        }
        Collections.sort(list);
        System.out.println(list);


    }
}
