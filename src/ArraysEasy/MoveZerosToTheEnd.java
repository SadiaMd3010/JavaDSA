package ArraysEasy;

import java.util.ArrayList;
import java.util.Arrays;

public class MoveZerosToTheEnd {
    //BRUTE
//    public static void main(String[] args) {
//        int a[]={1,0,2,1,0,0,6,7,8};
//        ArrayList<Integer> al = new ArrayList<>();
//        for(int i=0;i<a.length;i++) {
//            if(a[i]!=0) {
//                al.add(a[i]);
//            }
//        }
//
//        for(int i=al.size();i<a.length;i++) {
//            al.add(0);
//        }
//        System.out.println(al);

        //Anotherapproach
//        for(int i=0;i<al.size();i++) {
//            a[i]=al.get(i);
//        }
//
//        for (int i=al.size();i<a.length;i++) {
//            a[i]=0;
//        }
//        System.out.println(Arrays.toString(a));
//    }
        public static void main(String[] args) {
            int a[]={1,0,2,1,0,0,6,7,8};
            int j=-1;
            for(int i=0;i<a.length;i++) {
                if(a[i]==0) {
                    j=i;
                    break;
                }
            }

            for(int i=j+1;i<a.length;i++) {
                if(a[i]!=0) {
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                    j++;
                }
            }
            System.out.println(Arrays.toString(a));
        }
}
