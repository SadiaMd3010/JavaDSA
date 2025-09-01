package InterviewPrep.Arrays;

import java.util.Arrays;

public class SetMatrixZeros {
//    public static void markRow(int i,int a[][]) {
//        for(int j=0;j<a.length;j++) {
//            if(a[i][j]!=0) {
//                a[i][j]=-1;
//            }
//        }
//    }
//
//    public static void markCol(int j,int a[][]) {
//        for(int i=0;i<a.length;i++) {
//            if(a[i][j]!=0) {
//                a[i][j]=-1;
//            }
//        }
//    }
    public static void main(String[] args) {
        int[][] a = {{1,1,1,1},{1,0,0,1},{1,1,0,1},{1,1,1,1}};

        //Brute
//        for(int i=0;i<a.length;i++) {
//            for(int j=0;j<a.length;j++) {
//                if(a[i][j]==0) {
//                    markRow(i,a);
//                    markCol(i,a);
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
//        System.out.println(Arrays.deepToString(a));

        //Better
//        int row[] = new int[a.length];
//        int col[]= new int[a.length];
//        for(int i=0;i<a.length;i++) {
//            for(int j=0;j<a.length;j++) {
//                if(a[i][j]==0) {
//                    row[i]=1;
//                    col[j]=1;
//                }
//            }
//        }
//
//        for (int i=0;i<a.length;i++) {
//            for(int j=0;j<a.length;j++) {
//                if(row[i]==1 || col[j]==1) {
//                    a[i][j]=0;
//                }
//            }
//        }
//        System.out.println(Arrays.deepToString(a));

        //Optimal
        int col0=1;
        for(int i=0;i<a.length;i++) {
            for(int j=0;j<a.length;j++) {
                if(a[i][j]==0) {
                    a[i][0]=0;
                    if(j!=0) {
                        a[0][j]=0;
                    }
                    else {
                        col0=0;
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
                a[i][0] =0;
            }
        }
        System.out.println(Arrays.deepToString(a));
    }


}
