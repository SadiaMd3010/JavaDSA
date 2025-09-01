package ArraysEasy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int a[] = {5, 1,1, 1, 1, 2, 3, 2, 5}; // 1 1 2 2 3 5
        Arrays.sort(a);
        int i = 0;
        for (int j = 1; j < a.length; j++) {
            if (a[j] != a[i]) {
                System.out.println(a[i]);
            }
                i++;
        }
        System.out.println(a[a.length - 1]);
    }

        //using hashSet
//        int b[] = {5, 1, 1, 1, 2, 3, 2, 5};
//        HashSet<Integer> hs = new HashSet<>();
//        for(int i=0;i<b.length;i++) {
//            hs.add(b[i]);
//        }
//        System.out.println(hs);

        //using 2 pointers another way
//        int a[]={5, 1,1, 1, 1, 2, 3, 2, 5}; // 1 1 1 2 2 3 5 5
//        Arrays.sort(a);
//        ArrayList<Integer> al = new ArrayList<>();
//        int i=0;
//       for(int j=1;j<a.length;j++) {
//            if(a[i]<=a[j]) {
//                if (al.size() == 0 || al.get(al.size()-1) != a[i])
//                    al.add(a[i]);
//                i++;
//            }
//        }
//        System.out.println(al);
//
//    }
    }
