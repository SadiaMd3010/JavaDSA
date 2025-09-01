package ArraysEasy;

import java.util.Arrays;

public class InsertElement {
    public static void main(String[] args) {
        int[] a={2,4,5,6};
        int ele=3;
        int pos=2;
        int[] b = new int[a.length+1];

        for(int i=0;i<pos;i++) {
            b[i]=a[i];
        }
        b[pos]= ele;

        for(int i=pos;i<a.length;i++) {
            b[i+1]=a[i];
        }
        System.out.println(Arrays.toString(b));

    }
}
