package InterviewPrep.Arrays;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args) {
        //Find the element at specific row and column
//       int row=3;
//       int col=2;
//       int n=row-1;
//       int r=col-1;
//       int rem=1;
//       for(int i=0;i<r;i++) {
//           rem=rem*(n-i);
//           rem=rem/(i+1);
//       }
//        System.out.println(rem);

        //Find the complete row
//        int n=6;
//        int rem=1;
//        System.out.print(rem+" ");
//        for(int i=1;i<n;i++) {
//            rem=rem*(n-i);
//            rem=rem/i;
//            System.out.print(rem+" ");
//        }

        //Print entire pascal triangle
//        int n = 6;
//
//        List<List<Integer>> ans = new ArrayList<>();
//        for (int i = 1; i <= n; i++) {
//            ans.add(printRow(i));
//        }
//        System.out.println(ans);


//    public static List<Integer> printRow(int row) {
//        int rem=1;
//        List<Integer> list = new ArrayList<>();
//        list.add(rem);
//        for(int i=1;i<row;i++) {
//            rem=rem*(row-i);
//            rem=rem/i;
//            list.add(rem);
//        }
//        return list;
//    }

        //Print entire
        int n=6;
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=1;i<=n;i++) {
            List<Integer> list= new ArrayList<>();
            int rem=1;
            list.add(rem);
            for(int j=1;j<i;j++) {
                rem=rem*(i-j);
                rem=rem/j;
                list.add(rem);
            }
            ans.add(list);

        }
        System.out.println(ans);
        }
}
