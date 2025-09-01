package ArraysEasy;

import java.lang.reflect.Array;
import java.util.Arrays;

public class DeleteElement {
    public static void main(String[] args) {
        int[] a={2,3,4,5,6,1};
        int ele=3;
        int pos=0;
        int[] b= new int[a.length-1];
        for(int i=0;i<a.length;i++) {
            if(a[i]==ele) {
                pos=i;
            }
        }

        for(int i=0;i<pos;i++) {
            b[i]=a[i];
        }
        for(int i=pos;i<a.length-1;i++) {
            b[i]=a[i+1];
        }
        System.out.println(Arrays.toString(b));

    }
}
