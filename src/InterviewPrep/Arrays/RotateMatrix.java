package InterviewPrep.Arrays;

import javax.print.attribute.standard.OrientationRequested;
import java.util.Arrays;

public class RotateMatrix {
    public static void main(String[] args) {
        int a[][] = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};
        //BRUTE
//        int b[][]=new int[a.length][a.length];
//        for(int i=0;i<a.length;i++) {
//            for(int j=0;j<a.length;j++) {
//                b[j][a.length-1-i]=a[i][j];
//            }
//        }
//        System.out.println(Arrays.deepToString(b));

        //OPTIMAL
        for(int i=0;i<a.length-1;i++) {
            for(int j=i+1;j<a.length;j++) {
                int temp=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=temp;
            }
        }

//        for(int i=0;i<a.length;i++) {
//            for (int j = 0; j < a.length / 2; j++) {
//                int temp = a[i][j];
//                a[i][j] = a[i][a.length - j - 1];
//                a[i][a.length - j - 1] = temp;
//            }
//        }



        //OR
        reverseRows(a);
        System.out.println(Arrays.deepToString(a));


    }

    public static void reverseRows(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            int left = 0, right = a[i].length - 1;
            while (left < right) {
                int temp = a[i][left];
                a[i][left] = a[i][right];
                a[i][right] = temp;
                left++;
                right--;
            }
        }
    }

}
