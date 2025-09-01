package ArraysMedium;

import java.util.Arrays;

public class SetMatrixZeros {
    public static void main(String[] args) {
        //BRUTE
//        int a[][]={{1 ,1, 1, 1} ,
//                {1,0,0,1},
//                {1,1,0,1},
//                {1,1,1,1}};
//        for(int i=0;i<a.length;i++) {
//            for(int j=0;j<a.length;j++) {
//                if(a[i][j]==0) {
//                    markRow(a,i);
//                    markCol(a,j);
//                }
//            }
//        }
//
//        for(int i=0;i<a.length;i++) {
//            for(int j=0;j<a.length;j++) {
//                if(a[i][j]==-1) {
//                    a[i][j]=0;
//                }
//            }
//        }
//
//        System.out.println(Arrays.deepToString(a));
//
//    }
//
//    public static void markRow(int a[][],int i) {
//        for(int j=0;j<a.length;j++) {
//            if(a[i][j]!=0) {
//                a[i][j]=-1;
//            }
//        }
//    }
//
//    public static void markCol(int a[][],int j) {
//        for(int i=0;i<a.length;i++) {
//            if(a[i][j]!=0) {
//                a[i][j]=-1;
//            }
//        }
//    }
        //BETTER
//        int a[][]={{1 ,1, 1, 1} ,
//                {1,0,0,1},
//                {1,1,0,1},
//                {1,1,1,1}};
//        int row[]=new int[a.length];
//        int col[]=new int[a.length];
//        for(int i=0;i<a.length;i++) {
//            for(int j=0;j<a.length;j++) {
//                if (a[i][j]==0) {
//                    row[i]=1;
//                    col[j]=1;
//                }
//            }
//        }
//
//        for (int i=0;i<a.length;i++) {
//            for(int j=0;j<a.length;j++) {
//                if(row[i] ==1 || col[j]==1) {
//                    a[i][j]=0;
//                }
//            }
//        }
//        System.out.println(Arrays.deepToString(a));
        //OPTIMAL
        int a[][] = {{1, 1, 1, 1},
                     {1, 0, 0, 1},
                     {1, 1, 0, 1},
                     {1, 1, 1, 1}};
        int col0 = 1;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i][j] == 0) {
                    a[i][0] = 0;
                    if (j != 0) {
                        a[0][j] = 0;
                    } else {
                        col0 = 0;
                    }
                }

            }
        }

        for(int i=1;i<a.length;i++) {
            for(int j=1;j<a.length;j++) {
                if(a[i][j]!=0) {
                    if(a[i][0]==0 || a[0][j]==0) {
                        a[i][j]=0;
                    }
                }
            }
        }
        if(a[0][0]==0) {
            for(int j=0;j<a.length;j++) {
                a[0][j]=0;
            }
        }
        if(col0==0) {
            for(int i=0;i<a.length;i++) {
                a[i][0]=0;
            }
        }

        System.out.println(Arrays.deepToString(a));
    }
}
