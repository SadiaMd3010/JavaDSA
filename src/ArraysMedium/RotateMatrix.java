package ArraysMedium;

import java.util.Arrays;

public class RotateMatrix {
    public static void main(String[] args) {
        //BRUTE
//        int a[][]= {{1,2,3,4},
//                {5,6,7,8},
//                {9,10,11,12},
//                {13,14,15,16}};
//        int rotated[][]=new int[a.length][a[0].length];
//        for(int i=0;i<a.length;i++) {
//            for(int j=0;j<a[i].length;j++) {
//                rotated[j][a.length-1-i]=a[i][j];
//            }
//        }
//        System.out.println(Arrays.deepToString(rotated));

        //OPTIMAL
                int a[][]= {{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}};
                for(int i=0;i<a.length-1;i++) {
                    for(int j=i+1;j<a[i].length;j++) {
                        int temp=a[i][j];
                        a[i][j]=a[j][i];
                        a[j][i]=temp;
                    }
                }

                for(int i=0;i<a.length;i++) {
                    for(int j=0;j<a[i].length/2;j++) {
                        int temp=a[i][j];
                        a[i][j]=a[i][a[i].length-1-j];
                        a[i][a[i].length-1-j]=temp;
                    }
                }

        System.out.println(Arrays.deepToString(a));

    }
}
