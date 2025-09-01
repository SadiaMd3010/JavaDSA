package ArraysMedium;

import java.util.ArrayList;
import java.util.Arrays;

public class SprialMatrix {
    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};
        int n=mat.length;
        int m=mat[0].length;
        int left=0;
        int right = m-1;
        int top=0;
        int bottom= n-1;
        ArrayList<Integer> al = new ArrayList<>();
        while(top<=bottom && left<=right) {
            for (int i = left; i <= right; i++) {
                al.add(mat[top][i]);
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                al.add(mat[i][right]);
            }
            right--;
            if(top<=bottom) {
                for (int i = right; i >= left; i--) {
                    al.add(mat[bottom][i]);
                }
                bottom--;
            }
            if(left<=right) {
                for (int i = bottom; i >= top; i--) {
                    al.add(mat[i][left]);
                }
                left++;
            }
        }
        System.out.print(al+" ");


    }
}
