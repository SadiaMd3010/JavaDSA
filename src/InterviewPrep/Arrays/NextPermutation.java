package InterviewPrep.Arrays;

import java.util.Arrays;

public class NextPermutation {
    public static void main(String[] args) {
        int[] a = {1,3,2};
        int index =-1;
        for(int i=a.length-2;i>=0;i--) {
            if(a[i]<a[i+1]) {
                index=i;
                break;
            }
        }

        for(int i=a.length-1;i>=index;i--) {
            if(a[i]>a[index]) {
                int temp=a[i];
                a[i]=a[index];
                a[index] =temp;
                break;
            }
        }
        reverse(a,index+1,a.length-1);
        System.out.println(Arrays.toString(a));
    }

    public static void reverse(int a[], int i, int j) {
        while(i<j) {
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;
        }
    }
}
