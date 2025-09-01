package InterviewPrep.Arrays;

import java.util.ArrayList;
import java.util.List;

public class IntersectionOf2SortedArrays {
    public static void main(String[] args) {
        int[] a = {1,2,2,3,5};
        int[] b ={1,1,2,2,3,4};
        int visited[]= new int[b.length];
        List<Integer> list= new ArrayList<>();
        for(int i=0;i<a.length;i++) {
            for(int j=0;j<b.length;j++) {
                if(a[i]==b[j] && visited[j]==0) {
                    list.add(a[i]);
                    visited[j]=1;
                    break;
                }
            }
        }



        //Optimal
//        List<Integer> list = new ArrayList<>();
//        int i=0;
//        int j=0;
//        while(i<a.length && j<b.length ) {
//            if(a[i]==b[j]) {
//                list.add(a[i]);
//                i++;
//                j++;
//            }
//            else if(a[i]<b[j]) {
//                i++;
//            }
//            else {
//                j++;
//            }
//
//        }
//        System.out.println(list);

    }
}
