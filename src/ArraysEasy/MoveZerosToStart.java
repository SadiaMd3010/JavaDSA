package ArraysEasy;

import java.util.ArrayList;
import java.util.Arrays;

public class MoveZerosToStart {
//    public static void main(String[] args) {
//        int a[]={1,2,0,0,3,0,4,0,5,0};
//        ArrayList<Integer> al = new ArrayList<>();
//        for(int i=0;i<a.length;i++) {
//            if(a[i]==0) {
//                al.add(a[i]);
//            }
//        }
//
//        for(int i=0;i<a.length;i++) {
//            if(a[i]!=0) {
//                al.add(a[i]);
//            }
//        }
//        System.out.println(al);
//    }

    //OPTIMAL
    public static void main(String[] args) {
        int a[]={2,0,3,4,0,1,7,6,0};
        int j=-1;
        for(int i=a.length-1;i>=0;i--) {
            if(a[i]==0) {
                j=i;
                break;
            }
        }

        for(int i=j-1;i>=0;i--) {
            if(a[i]!=0) {
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                j--;
            }
        }
        System.out.println(Arrays.toString(a));
    }


}
