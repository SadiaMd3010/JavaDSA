package ArraysEasy;

import java.util.ArrayList;
import java.util.HashSet;

public class UnionOf2SortedArrays {
    public static void main(String[] args) {
//        int a[]={1,1,2,2,3,4,5};
//        int b[]={2,3,4,5,6,7};
//        HashSet<Integer> set=new HashSet<>();
//        for(int i=0;i<a.length;i++) {
//            set.add(a[i]);
//        }
//        for (int i=0;i<b.length;i++) {
//            set.add(b[i]);
//        }
//        for (int it:set) {
//            System.out.print(it+" ");
//        }
        //OPTIMAL
        int a[]={1,1,2,2,3,4,5};
        int b[]={2,3,4,5,6,7};
        int i=0;
        int j=0;
        ArrayList<Integer> al = new ArrayList<>();
        while(i<a.length && j<b.length) {
            if(a[i]<b[j]) {
                if(al.isEmpty() || al.get(al.size()-1) !=a[i]) {
                    al.add(a[i]);
                }
                i++;
            }
            else {
                if(al.isEmpty() || al.get(al.size()-1) !=b[j]) {
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

        while (j<b.length) {
            if(al.get(al.size()-1)!=b[j]) {
                al.add(b[j]);
            }
            j++;
        }

        System.out.print(al + " ");


    }
}
