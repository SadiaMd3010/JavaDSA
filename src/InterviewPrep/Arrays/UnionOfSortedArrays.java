package InterviewPrep.Arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class UnionOfSortedArrays {
    public static void main(String[] args) {
        int a[]= {1,2,3,4,5};
        int b[]= {3,4,5,6,7};
//        HashSet<Integer> hs= new HashSet<>();
//        for(int i=0;i<a.length;i++) {
//            hs.add(a[i]);
//        }
//        for (int i=0;i<b.length;i++) {
//            hs.add(b[i]);
//        }
//        System.out.println(hs);

        int i=0;
        int j=0;
        List<Integer> al = new ArrayList<>();
       while(i<a.length && j<b.length) {
            if(a[i]<=b[j]) {
                if(al.isEmpty() || al.get(al.size()-1)!=a[i]) {
                    al.add(a[i]);
                }
                i++;
            }
            else {
                if(al.isEmpty() || al.get(al.size()-1)!=b[j]) {
                    al.add(b[j]);
                }
                j++;
            }
        }

        while(i<a.length) {
            if(al.get(al.size()-1)!=a[i]) {
                al.add(a[i]);
            }
            i++;
        }

       while (j<b.length){
            if(al.get(al.size()-1)!=b[j]) {
                al.add(b[j]);
            }
            j++;
        }
        System.out.println(al);

    }
}
