package InterviewPrep.Arrays;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};

        int left=0;
        int top=0;
        int right = a.length-1;
        int bottom= a.length-1;
        List<Integer> list = new ArrayList<>();
        while(top<=bottom  && left<=right) {
            for (int i = left; i <= right; i++) {
                list.add(a[top][i]);
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                list.add(a[i][right]);
            }
            right--;
            if(top<=bottom) {
                for (int i = right; i >= left; i--) {
                    list.add(a[bottom][i]);
                }
                bottom--;
            }
            if(left<=right) {
            for (int i = bottom; i >= top; i--) {
                list.add(a[i][left]);
            }
            left++;
            }
        }
        System.out.println(list);
    }
}
