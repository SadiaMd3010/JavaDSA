package InterviewPrep.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeOverlappingIntervals {
    public static void main(String[] args) {
        int[][] a = {{1,3},{2,6},{8,9},{9,11},{8,10},{2,4},{15,18},{16,17}};
        Arrays.sort(a,(b,c)-> Integer.compare(b[0],c[0]));
        List<List<Integer>> list = new ArrayList<>();
//        for(int i=0;i<a.length;i++) {
//            int start = a[i][0];
//            int end= a[i][1];
//            if(!list.isEmpty() && list.get(list.size()-1).get(1)>=end) {
//                continue;
//            }
//
//            for(int j=i+1;j<a.length;j++) {
//                if(a[j][0]<=end) {
//                    end = Math.max(end,a[j][1]);
//                }
//                else {
//                    break;
//                }
//            }
//            list.add(Arrays.asList(start,end));
//        }
//        System.out.println(list);

        //Optimal
        for(int i=0;i<a.length;i++) {
            if(list.isEmpty() || list.get(list.size()-1).get(1)<a[i][0]) {
                list.add(Arrays.asList(a[i][0],a[i][1]));
            }
            else {
                list.get(list.size()-1).set(1,Math.max(a[i][1],list.get(list.size()-1).get(1)));
            }

        }
        System.out.println(list);


    }
}
